import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mlding on 10/20/16.
 */
public class TransferBarToZipCommandTest {
  
  @Test
  public void should_get_zip_code_and_reset_router_map() throws Exception {
    TransferBarToZipService service = mock(TransferBarToZipService.class);
    TransferBarToZipCommand command = new TransferBarToZipCommand(service);
    
    when(service.transfer("1234")).thenReturn("4321");
    Result result = command.invoke("1234");
    
    assertThat(result.getMsg(), is("4321" + "\n1. ZipCode transfer to BarCode\n" +
      "2. BarCode transfer to ZipCode\n" +
      "3. Exit"));
    assertThat(result.getIsReset(), is(true));
  }
}