import getmin.GetMin;
import org.junit.Assert;
import org.junit.Test;

public class TestGetMin {

  /**
  * why do u need these docs?.
  **/

  @Test
  public void testRandom() {
    int[] randomArray = {1, 4, -2, 13};
    Assert.assertEquals(-2, (new GetMin()).getMin(randomArray));
  }

  @Test
  public void testNull() {
    int[] nullArray = new int[0];
    Assert.assertEquals(Integer.MAX_VALUE, (new GetMin()).getMin(nullArray));
  }
}
