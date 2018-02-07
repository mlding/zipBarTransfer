/**
 * Created by mlding on 10/20/16.
 */
public class HomeCommand implements Command {
  public Result invoke(String input) {
    return new Result("1. ZipCode transfer to BarCode\n" +
      "2. BarCode transfer to ZipCode\n" +
      "3. Exit", null, false);
  }
}
