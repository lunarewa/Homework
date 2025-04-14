import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FactorialTest {
        @Test
        public void validFactorialTest() {
            Assertions.assertEquals(Factorial.factorial(5), 120);
        }

}
