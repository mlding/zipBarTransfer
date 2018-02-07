import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mlding on 10/20/16.
 */
public class RouterTest {
  
  @Test
  public void should_return_home_page_msg() throws Exception {
    Router router = new Router();
    Map<String, Command> map = new HashMap<String, Command>();
    
    Command command = mock(HomeCommand.class);
    when(command.invoke("/")).thenReturn(new Result("home page", null, false));
    map.put("/", command);
    router.init(map);
  
    String str = router.route("/");
    assertThat(str, is("home page"));
  }
  
  @Test
  public void should_return_input_zip_code_msg() throws Exception {
    Router router = new Router();
    Map<String, Command> map = new HashMap<String, Command>();
    Map<String, Command> newMap = new HashMap<String, Command>();
  
    Command command = mock(Command.class);
    when(command.invoke("1")).thenReturn(new Result("input zip code: ", newMap, false));
    map.put("1", command);
    router.init(map);
    
    assertThat(router.route("1"), is("input zip code: "));
  
    newMap.putAll(map);
    newMap.remove("1");
    newMap.put("#1", command);
    router.init(newMap);
  
    assertThat(router.route("1"), is("invalid command"));
  }
  
  @Test
  public void should_return_transferred_bar_code() throws Exception {
    Router router = new Router();
    Map<String, Command> map = new HashMap<String, Command>();
    
    Command command = mock(Command.class);
    when(command.invoke("1234")).thenReturn(new Result("4321", null, true));
    map.put("1234", command);
    router.init(map);
    
    assertThat(router.route("1234"), is("4321"));
  }
  
  @Test
  public void should_return_input_bar_code_msg() throws Exception {
    Command command = mock(Command.class);
    when(command.invoke("2")).thenReturn(new Result("input bar code: ", null, false));
  }
}