import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mlding on 10/20/16.
 */
public class GoToZipToBarCommandTest {
  @Test
  public void should_return_input_zip_code_msg_and_use_new_map() throws Exception {
    Map<String, Command> newMap = new HashMap<String, Command>();
    GoToZipToBarCommand goToZipToBarCommand = new GoToZipToBarCommand(newMap);
    newMap.put("#1", goToZipToBarCommand);
    
    Result result = goToZipToBarCommand.invoke("1");
    
    assertThat(result.getMsg(), is("input zip code: "));
    assertThat(result.getMap(), is(newMap));
  }
}