import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mlding on 10/20/16.
 */
public class HomeCommandTest {
  @Test
  public void should_return_home_page_msg() throws Exception {
    HomeCommand homeCommand = new HomeCommand();
    Result result = homeCommand.invoke("/");
    
    assertThat(result.getMsg(), is("1. ZipCode transfer to BarCode\n" +
      "2. BarCode transfer to ZipCode\n" +
      "3. Exit"));
  }
  
}