import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testSumHighestBits() {
    Assert.assertEquals(9, Main.sumHighestBits(new int[] {1, 2, 4, 3}));
    Assert.assertEquals(0, Main.sumHighestBits(new int[] {0, 0}));
  }
}
