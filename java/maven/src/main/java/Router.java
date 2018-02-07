import java.util.HashMap;
import java.util.Map;

/**
 * Created by mlding on 10/20/16.
 */
public class Router {
  Map<String, Command> map = new HashMap<String, Command>();
  
  public void init(Map<String, Command> map) {
    this.map = map;
  }
  
  public String route(String input) {
    Command command = map.get(input);
    if (command == null) return "invalid command";
    Result result = command.invoke(input);
    return result.getMsg();
  }
}
