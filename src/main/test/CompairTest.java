import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CompairTest {

    @Test
    public void validBigTest() {
        AssertJUnit.assertTrue(Compair.big(5,2));
    }

    @Test
    public void validEquallyTest() {
        AssertJUnit.assertTrue(Compair.equally(5, 5));
    }
}