import getsumbits.GetSumBits;
import org.junit.Assert;
import org.junit.Test;
import parsestring.ParseString;

public class MainTest {
  @Test
  public void testSum() {
    Assert.assertEquals(4, GetSumBits.sumLowestBits(new int[] {1, 2, 3}));
    Assert.assertEquals(7, GetSumBits.sumLowestBits(new int[] {10, 12, 3}));
    Assert.assertEquals(10, GetSumBits.sumLowestBits(new int[] {101, 1, 0, 12, 4}));
  }

  @Test
  public void testSumEmpty() {
    Assert.assertEquals(0, GetSumBits.sumLowestBits(new int[] {}));
  }

  @Test
  public void testSumNegative() {
    Assert.assertEquals(4, GetSumBits.sumLowestBits(new int[] {-1, 2, -3}));
    Assert.assertEquals(7, GetSumBits.sumLowestBits(new int[] {10, -12, 3}));
    Assert.assertEquals(10, GetSumBits.sumLowestBits(new int[] {-101, 1, 0, -12, 4}));
  }

  int[] current = new int[3];

  @Test
  public void testSumString() {
    Assert.assertEquals(true, ParseString.getNums(current, new String[] {"1", "-2", "3"}));
  }

  @Test
  public void testSumError() {
    Assert.assertEquals(false, ParseString.getNums(current, new String[] {"23", "-gs", "3"}));
    Assert.assertEquals(false, ParseString.getNums(current, new String[] {"2", "-2", "3kek"}));
  }
}
