import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testMax1() {
    Assert.assertEquals(5, (new Main()).max(new int[] {1,2,3,4,5}));
  }

  @Test
  public void testMax2() {
    Assert.assertEquals(3, (new Main()).max(new int[] {1,-2,3,-4,-5}));
  }

  @Test
  public void testMaxEmpty() {
    Assert.assertEquals(0, (new Main()).max(new int[] {}));
  }

}
