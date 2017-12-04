import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void CorrectSum() {
    Assert.assertEquals(13, (new Main()).SumOfPowers(new int[] {0,1,2}));
  }

  @Test
  public void TestSmallArgs() {
    Assert.assertEquals(1, (new Main()).SumOfPowers(new int[] {-1,0,-2,-345}));
  }

  @Test
  public void TestBigArgs() {
    Assert.assertEquals(3, (new Main()).SumOfPowers(new int[] {1,16,17,999}));
  }
}
