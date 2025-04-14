import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class STest {

    @Test
    public void validSTest() {
        AssertJUnit.assertEquals(S.s(5,2),5);
    }

}
