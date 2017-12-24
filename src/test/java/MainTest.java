import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testCountSimple() {
    int[] testArr = {10, 20, 30};
    Assert.assertEquals(3, (new Main()).countZeroes(testArr));
  }

  @Test
  public void testEmptyInput() {
    Assert.assertEquals(0, (new Main()).countZeroes(new int[]{}));
  }

  @Test
  public void testBigInt() {
    int[] testArr = {1000000000, 1000000000, 1000000000, 1000000000, 10000};
    Assert.assertEquals(40, (new Main()).countZeroes(testArr));
  }
}
