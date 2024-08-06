import org.example.Calculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(result, 5, "2 + 3 повинно дорівнювати 5");
    }
}
