import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testSumTrailingZeroes() {
    Assert.assertEquals(4, Main.sumTrailingZeros(new int[] {10, 8}));
  }

  @Test
  public void testSumZero() {
    Assert.assertEquals(0, Main.sumTrailingZeros(new int[] {0, 7, 15, 127}));
  }

  @Test
  public void testSumTrailingZeroes2() {
    Assert.assertEquals(7, Main.sumTrailingZeros(new int[] {7, 8, 9, 10, 11, 12, 13, 14, 15}));
  }

  @Test
  public void testSumZero2() {
    Assert.assertEquals(0, Main.sumTrailingZeros(new int[] {3, 31, 63, 255}));
  }

  static final String ERROR_TEXT = "Some elements are not integer";

  @Test
  public void testSumString() {
    Assert.assertEquals("7", Main.sumOrError(new String[] {"8", "10", "11", "12", "13", "14"}));
  }

  @Test
  public void testSumError() {
    Assert.assertEquals(ERROR_TEXT, Main.sumOrError(new String[] {"7", "8", "9", "a"}));
  }
}
