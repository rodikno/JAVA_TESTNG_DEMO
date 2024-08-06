import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {


    @Test
    public void myFirstTest() {
        Assert.assertEquals(2 + 2, 4);
    }
}
