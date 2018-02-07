/**
 * Created by mlding on 10/20/16.
 */
public class TransferBarToZipCommand implements Command {
  TransferBarToZipService service;
  
  public TransferBarToZipCommand(TransferBarToZipService service) {
    this.service = service;
  }
  
  public Result invoke(String input) {
    return new Result(service.transfer(input) + "\n1. ZipCode transfer to BarCode\n" +
      "2. BarCode transfer to ZipCode\n" +
      "3. Exit", null, true);
  }
}
