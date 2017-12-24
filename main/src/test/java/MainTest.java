import org.junit.Assert;
import org.junit.Test;

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
  public void testFibonacci() {
    Assert.assertEquals(Utils.fibonacciSum(new int[]{0, 1, 3}), 5);
  }

  @Test
  public void testFibonacciWithZero() {
    Assert.assertEquals(Utils.fibonacciSum(new int[]{-1, 0, 1, 3}), 5);
    Assert.assertEquals(Utils.fibonacciSum(new int[]{16, 0, 1, 3}), 5);
  }
}