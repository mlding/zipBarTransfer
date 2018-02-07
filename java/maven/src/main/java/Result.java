import java.util.HashMap;
import java.util.Map;

/**
 * Created by mlding on 10/20/16.
 */
public class Result {
  String msg;
  Map<String, Command> map = new HashMap<String, Command>();
  boolean isReset;
  
  public Result(String msg, Map<String, Command> map, boolean isReset){
    this.msg = msg;
    this.map = map;
    this.isReset = isReset;
  }
  
   public String getMsg() {
     return msg;
   }
   
   public Map<String, Command> getMap() {
     return map;
   }
   
   public boolean getIsReset() {
     return isReset;
   }
}
