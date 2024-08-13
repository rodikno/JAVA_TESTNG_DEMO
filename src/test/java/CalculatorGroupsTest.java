import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorGroupsTest {
    Calculator calculator = new Calculator();

    @Test(groups = {"addSubtract"})
    public void testAdd() {
        int result = calculator.add(5, 3);
        Assert.assertEquals(result, 8);
    }

    @Test(groups = {"addSubtract"})
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(result, 2);
    }

    @Test(groups = {"addSubtractNegative"})
    public void testAddNegative() {
        int result = calculator.add(-5, -3);
        Assert.assertEquals(result, -8);
    }

    @Test(groups = {"addSubtractNegative"})
    public void testSubtractNegative() {
        int result = calculator.subtract(-5, -3);
        Assert.assertEquals(result, -2);
    }
}