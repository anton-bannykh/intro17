import org.junit.Assert;
import org.junit.Test;
import sum.Sum;

public class SumTest {

  static final String ERROR_NEGATIVE = "Elements of array mustn't be negative.";

  @Test
  public void testNegative() {
    Assert.assertEquals(ERROR_NEGATIVE, Sum.test(new int[] {1, -2, 4, 3}));
  }

  @Test
  public void testNegative1() {
    Assert.assertEquals("OK", Sum.test(new int[] {100, 200, 400, 300}));
  }

  @Test
  public void testSumHighestBits() {
    Assert.assertEquals(9, Sum.sumHighestBits(new int[] {1, 2, 4, 3, 0}));
    Assert.assertEquals(0, Sum.sumHighestBits(new int[] {0, 0}));
  }

  @Test
  public void testSumEmpty() {
    Assert.assertEquals(0, Sum.sumHighestBits(new int[] {}));
  }
}