import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void validFactorialTest() {
        AssertJUnit.assertEquals(Factorial.factorial(5), 120);
    }

}
