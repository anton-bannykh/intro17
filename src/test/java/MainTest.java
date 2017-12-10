import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  static final String ERROR_NEGATIVE = "Elements of array mustn't be negative.";
  static final String ERROR_STRING = "Can't parse integer.";

  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testString() {
    Assert.assertEquals(ERROR_STRING, Main.getSumHighestBits(new String[] {"1", "2", "4", "s"}));
  }

  @Test
  public void testNegative() {
    Assert.assertEquals(ERROR_NEGATIVE, Main.getSumHighestBits(new String[] {"1", "-2", "4", "3"}));
  }

  @Test
  public void testSumHighestBits() {
    Assert.assertEquals("9", Main.getSumHighestBits(new String[] {"1", "2", "4", "3"}));
    Assert.assertEquals("0", Main.getSumHighestBits(new String[] {"0", "0"}));
  }

  @Test
  public void testSumEmpty() {
    Assert.assertEquals("0", Main.getSumHighestBits(new String[] {}));
  }
}
