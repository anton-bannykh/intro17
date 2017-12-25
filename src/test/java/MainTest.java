import argstoarray.ArgsToArray;
import org.junit.Assert;
import org.junit.Test;
import partsum.PartSum;

public class MainTest {
  /**
   *tests.
  **/  
  @Test
  public void simpleTest1() {
    Assert.assertEquals(4.0, PartSum.part(new double[]{1, 1, 1, 1}), 0.0);
  }

  @Test
  public void testCorrectInput1() {
    Assert.assertEquals(false, ArgsToArray.get_args(new double[3], new String[]{"1", "4", "ups"}));
  }

}