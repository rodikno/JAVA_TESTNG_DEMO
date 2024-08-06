import org.example.Calculator;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class AdvancedCalculatorTest {
    Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("Перед усіма тестами в класі");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("Після усіх тестів в класі");
    }

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Перед кожним тестом");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Після кожного тесту");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(result, 5);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(result, 2);
    }
}
