import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(true, (new Main()).foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
    Assert.assertEquals(false, (new Main()).foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    Assert.assertEquals(false, (new Main()).foo(new int[]{1}));
    Assert.assertEquals(true, (new Main()).foo(new int[]{2}));
  }
}
