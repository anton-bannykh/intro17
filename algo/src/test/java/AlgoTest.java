import Xpech.intro17.algo.Algo;
import org.junit.Assert;
import org.junit.Test;

public class AlgoTest {
  @Test
  public void testSimple() {
    int[] testArgs = {10, 20, 30};
    Assert.assertEquals(3, Algo.countZeroes(testArgs));
  }

  @Test
  public void testBigInt() {
    int[] testArgs = {1000000000, 1000000000, 1000000000, 1000};
    Assert.assertEquals(30, Algo.countZeroes(testArgs));
  }

  @Test
  public void testEmpty() {
    int[] testArgs = {};
    Assert.assertEquals(0, Algo.countZeroes(testArgs));
  }

  @Test
  public void testZeroesInMiddle() {
    int[] testArgs = {101, 10};
    Assert.assertEquals(2, Algo.countZeroes(testArgs));
  }
}
