import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Predator feline;
    @Test
    public void lionDoesHaveManeTrue() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Assert.assertEquals(true, lion.doesHaveMane());
    }
    @Test
    public void lionDoesHaveManeFalse() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Assert.assertEquals(false, lion.doesHaveMane());
    }
    @Test
    public void lionExceptionIsRunning() /*throws Exception*/ {
        Exception trowException = Assert.assertThrows(Exception.class,() -> new Lion(feline, "Само"));
        //Assert.assertTrue(trowException.getMessage().contains("Используйте допустимые значения пола животного - самец или самка"));
        Assert.assertTrue(trowException.getMessage() == "Используйте допустимые значения пола животного - самец или самка");
    }

}
