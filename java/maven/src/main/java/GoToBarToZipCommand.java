import java.util.Map;

/**
 * Created by mlding on 10/20/16.
 */
public class GoToBarToZipCommand implements Command {
  Map<String, Command> newMap;
  
  public GoToBarToZipCommand(Map<String, Command> newMap) {
    this.newMap = newMap;
  }
  
  public Result invoke(String input) {
    return new Result("please input bar code: \n", newMap, false);
  }
}
