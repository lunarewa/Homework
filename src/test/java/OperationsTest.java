import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperationsTest {

    @DisplayName("First test")
    @Test
    public void validSumTest() {
        Assertions.assertEquals(Operations.sum(0,2), 2);
    }

    @Test
    public void validMinusTest() {
        Assertions.assertEquals(Operations.minus(5, 0),5);
    }

    @Test
    public void validUmnozhenieTest() {
        Assertions.assertEquals(Operations.umnozhenie(5, 2),10);
    }

    @Test
    public void validDelenieTest() {
        Assertions.assertEquals(Operations.delenie(6, 2),3);
    }


}
