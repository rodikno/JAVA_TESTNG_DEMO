import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {


    @Test
    public void myFirstTest() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 4);

//        Assert.assertEquals(result, 7);
    }
}
