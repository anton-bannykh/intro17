import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }
  
  @Test
  public void testRandom() {
    int[] randomArray = {1, 4, -2, 15};
    Assert.assertEquals(-2, (new Main()).getMin(randomArray));
  }

  @Test
  public void testNull() {
    int[] nullArray = new int[0];
    Assert.assertEquals(Integer.MAX_VALUE, (new Main()).getMin(nullArray));
  }
}
