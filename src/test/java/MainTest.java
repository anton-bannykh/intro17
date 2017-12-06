import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(true, (new Main()).foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
    Assert.assertEquals(false, (new Main()).foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    Assert.assertEquals(false, (new Main()).foo(new int[]{1}));
    Assert.assertEquals(true, (new Main()).foo(new int[]{2}));
    Assert.assertEquals(false, (new Main()).foo(new int[]{2147483647, 2147483646,
	2147483645, 2147483644, 2147483643, 2147483642}));
    Assert.assertEquals(false, (new Main()).foo(new int[]{-2147483648, -2147483647,
	-2147483646, -2147483645, -2147483644, -2147483643}));
    Assert.assertEquals(true, (new Main()).foo(new int[]{-2147483648, 2147483647, -2147483647,
	2147483646, -2147483646, 2147483645, -2147483645, 2147483644, -2147483644, 2147483643, -2147483643, 2147483642}));
  }
}
