import org.junit.Assert;
import org.junit.Test;
import main.java.Utils;

public class MainTest {
  @Test
  public void testUtil() {
    int[] array = new int[5];
    String[] str = new String[5];
    for (int ind = 0; ind < str.length; ++ind) {
      str[ind] = ((Integer) ind).toString();
      array[ind] = ind;
    }
    int[] utilsArray = Utils.createArray(str);
    Assert.assertArrayEquals(utilsArray, array);
  }

  @Test
  public void testOr() {
    Assert.assertEquals(Utils.rangeOr(new int[]{1, 2}), 3);
  }

  @Test
  public void testOrWuthNegative() {
    Assert.assertEquals(Utils.rangeOr(new int[]{-2, 1}), -1);
  }
  @Test
  public void testOrWuthZero() {
    Assert.assertEquals(Utils.rangeOr(new int[]{0, 1, 2}), 3);
  }
}