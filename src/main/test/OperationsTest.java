import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class OperationsTest {

    @Test
    public void validSumTest() {
        AssertJUnit.assertEquals(Operations.sum(0,2), 2);
    }

    @Test
    public void validMinusTest() {
        AssertJUnit.assertEquals(Operations.minus(5, 0),5);
    }

    @Test
    public void validUmnozhenieTest() {
        AssertJUnit.assertEquals(Operations.umnozhenie(5, 2),10);
    }

    @Test
    public void validDelenieTest() {
        AssertJUnit.assertEquals(Operations.delenie(6, 2),3);
    }
}
