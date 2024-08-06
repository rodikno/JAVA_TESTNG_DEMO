import org.example.Calculator;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class CalculatorDataProviderTest {

    Calculator calculator;

    @DataProvider
    public Object[][] testDataAddition() {
        return new Object[][]{
                {2, 3, 5},
                {5, 5, 10},
                {10, 0, 10}
        };
    }

    @DataProvider
    public Object[][] testDataSubtraction() {
        return new Object[][]{
                {5, 2, 3},
                {10, 5, 5},
                {15, 10, 5}
        };
    }

    @BeforeClass
    public void calculatorInit() {
        System.out.println("Starting the tests, initializing a new Calculator object");
        calculator = new Calculator();

    }

    @Test(dataProvider = "testDataAddition")
    public void testAdd(int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertEquals(result, expected, String.format("%s + %s повинно дорівнювати %s", a, b, result));
    }

    @Test(dataProvider = "testDataSubtraction")
    public void testSubtract(int a, int b, int expected) {
        int result = calculator.subtract(a, b);
        assertEquals(result, expected, String.format("%s - %s повинно дорівнювати %s", a, b, result));
    }

    @AfterClass
    public void tearDown() {
        System.out.println("All tests in this class were completed");
    }
}
