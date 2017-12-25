import org.junit.Assert;
import org.junit.Test;
import parser.Parser;
import sum.Sum;

public class MainTest {

  static final String ERROR_NEGATIVE = "Elements of array mustn't be negative.";

  @Test
  public void testIncorrectEnter() {
    Assert.assertEquals(null, Parser.makeIntArr(new String[] {"1", "2", "4", "s"}));
  }

  @Test
  public void testString() {
    Assert.assertEquals(-1, Sum.sumHighestBits(
        Parser.makeIntArr(new String[] {"100", "-2"}))
    );
  }

  @Test
  public void testNegative() {
    Assert.assertEquals(-1, Sum.sumHighestBits(new int[] {1, -2, 4, 3}));
  }

  @Test
  public void testSumHighestBits() {
    Assert.assertEquals(9, Sum.sumHighestBits(new int[] {1, 2, 4, 3}));
    Assert.assertEquals(0, Sum.sumHighestBits(new int[] {0, 0}));
  }

  @Test
  public void testSumEmpty() {
    Assert.assertEquals(0, Sum.sumHighestBits(new int[] {}));
  }
}
