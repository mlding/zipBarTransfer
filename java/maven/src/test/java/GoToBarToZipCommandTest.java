import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mlding on 10/20/16.
 */
public class GoToBarToZipCommandTest {
  @Test
  public void should_return_input_bar_code_msg() throws Exception {
    GoToBarToZipCommand command = new GoToBarToZipCommand(null);
    
    Result result = command.invoke("2");
    
    assertThat(result.getMsg(), is("please input bar code: \n"));
  }
  
}