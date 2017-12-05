import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void correctSum() {
    Assert.assertEquals(13, (new Main()).sumOfPows(new int[] {0,1,2}));
  }

  @Test
  public void testSmallArgs() {
    Assert.assertEquals(1, (new Main()).sumOfPows(new int[] {-1,0,-2,-345}));
  }

  @Test
  public void testBigArgs() {
    Assert.assertEquals(3, (new Main()).sumOfPows(new int[] {1,16,17,999}));
  }
}
