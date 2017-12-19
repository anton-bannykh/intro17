import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }
  @Test
  public void testSumOfBits() {
    Assert.assertEquals(0, Main.sumOfBits(new int[] {0, 0}));
    Assert.assertEquals(5, Main.sumOfBits(new int[] {1, 2, 3, 4}));
    Assert.assertEquals(3, Main.sumOfBits(new int[] {1, 1, 2}));
  }
}