import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class STest {
    @Test
    public void validSTest() {
        Assertions.assertEquals(S.s(5, 2), 5);
    }
}
