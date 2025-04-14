import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompairTest {
    @Test
    public void validBigTest() {
        Assertions.assertTrue(Compair.big(5,2));
    }

    @Test
    public void validEquallyTest() {
        Assertions.assertTrue(Compair.equally(5, 5));
    }
}
