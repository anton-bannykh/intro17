import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testSum() {
    Assert.assertEquals(6, (new Main()).sum(new int[] {1, 2, 3}));
    Assert.assertEquals(0, (new Main()).sum(new int[] {0, 0, 0}));
  }
}
