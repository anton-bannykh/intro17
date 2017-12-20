import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }
  
  @Test
  public void testRandom() {
    int[] randomArray = {1, 4, -2, 13};
    Assert.assertEquals(-2, (new Main()).getMin(randomArray));
  }

  @Test
  public void testNull() {
    int[] nullArray = new int[0];
    Assert.assertEquals(Integer.MAX_VALUE, (new Main()).getMin(nullArray));
  }

  @Test
  public void testBadSysFormat() {
    String[] curTest = new String[3];
    curTest[0] = new String("123");
    curTest[1] = new String("ROFL");
    curTest[2] = new String("14");
    Assert.assertEquals("ROFL is not a number", (new Main().printMinOrError(curTest)));
  }
}
