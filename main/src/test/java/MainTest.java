import org.junit.Assert;
import org.junit.Test;
import main.java.Utils;

public class MainTest {

  @Test
  public void testOr() {
    Assert.assertEquals(Utils.rangeOr(new int[]{1, 2}), 3);
  }

  @Test
  public void testOrWithNegative() {
    Assert.assertEquals(Utils.rangeOr(new int[]{-2, 1}), -1);
  }
  @Test
  public void testOrWithZero() {
    Assert.assertEquals(Utils.rangeOr(new int[]{0, 1, 2}), 3);
  }
}