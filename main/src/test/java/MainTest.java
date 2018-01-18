import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void testOr() {
    Assert.assertEquals(Main.rangeOr(new int[]{1, 2}), 3);
  }

  @Test
  public void testOrWithNegative() {
    Assert.assertEquals(Main.rangeOr(new int[]{-2, 1}), -1);
  }
  @Test
  public void testOrWithZero() {
    Assert.assertEquals(Main.rangeOr(new int[]{0, 1, 2}), 3);
  }
}