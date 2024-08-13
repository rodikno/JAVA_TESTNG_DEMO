import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class HelloWorldTest {

    Calculator calc;

    @BeforeMethod
    public void prepareCalculator() {
        //щось зробити, виконати степи
        calc = new Calculator();
        System.out.println("New calculator created");
    }

    @AfterMethod
    public void cleanup() {
        System.out.println("THIS HAPPENS ONLY ONCE AFTER ALL TEST METHODS WERE EXECUTED");
    }

    @Test
    public void myFirstTest() {
        System.out.println("Addition test");
        int result = calc.add(5, 10);
        //виконати перевірку
        Assert.assertEquals(result, 15);
    }

    @Test
    public void subtractTest() {
        System.out.println("Subtraction test");
        int result = calc.subtract(10, 5);
        //виконати перевірку
        Assert.assertEquals(result, 5);
    }


}
