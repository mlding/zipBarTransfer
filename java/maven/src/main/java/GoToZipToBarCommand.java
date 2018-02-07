import java.util.HashMap;
import java.util.Map;

/**
 * Created by mlding on 10/20/16.
 */
public class GoToZipToBarCommand implements Command {
  Map<String, Command> newMap = new HashMap<String, Command>();
  
  public GoToZipToBarCommand(Map<String, Command> newMap) {
    this.newMap = newMap;
  }
  
  public Result invoke(String input) {
    return new Result("input zip code: ", newMap, false);
  }
}
