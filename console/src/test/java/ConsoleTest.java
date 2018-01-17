import org.junit.Assert;
import org.junit.Test;

public class ConsoleTest {
  @Test
  public void testUtils() {
    int[] array = new int[5];
    String[] str = new String[5];
    for (int ind = 0; ind < str.length; ++ind) {
      str[ind] = ((Integer) ind).toString();
      array[ind] = ind;
    }
    int[] utilsArray = ConsoleInput.createArray(str);
    Assert.assertArrayEquals(utilsArray, array);
  }

  @Test(expected = CreateArrayException.class)
  public void testUtilsWithError() {
    String[] str = new String[5];
    for (int ind = 0; ind < str.length; ++ind) {
      str[ind] = ((Integer) ind).toString();
    }
    str[3] = "A";
    int[] utilsArray = ConsoleInput.createArray(str);
  }
}