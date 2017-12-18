import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void simpleTest1() {
    Assert.assertEquals(true, (new Main()).foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
  }

  @Test
  public void simpleTest2() {
    Assert.assertEquals(false, (new Main()).foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }

  @Test
  public void simpleTest3() {
    Assert.assertEquals(false, (new Main()).foo(new int[]{1}));
  }

  @Test
  public void simpleTest4() {
    Assert.assertEquals(true, (new Main()).foo(new int[]{2}));
  }

  @Test
  public void testOverflow1() {
    Assert.assertEquals(false, (new Main()).foo(new int[]{2147483647, 2147483646,
            2147483645, 2147483644, 2147483643, 2147483642}));
  }

  @Test
  public void testOverflow2() {
    Assert.assertEquals(false, (new Main()).foo(new int[]{-2147483648, -2147483647,
            -2147483646, -2147483645, -2147483644, -2147483643}));
  }

  @Test
  public void testOverflow3() {
    Assert.assertEquals(true, (new Main()).foo(new int[]{-2147483648, 2147483647, -2147483647,
        2147483646, -2147483646, 2147483645, -2147483645, 2147483644, -2147483644, 2147483643,
        -2147483643, 2147483642}));
  }
}
