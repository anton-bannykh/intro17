import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void testOddPos() {
    int[] arr = {5, 2, 1, 4, 3};
    Assert.assertEquals("3", (new Main()).median(arr));
  }

  @Test
  public void testEvenPos1() {
    int[] arr = {5, 2, 1, 4, 3, 6};
    Assert.assertEquals("3.5", (new Main()).median(arr));
  }

  @Test
  public void testEvenPos2() {
    int[] arr = {5, 2, 1, 7, 3, 6};
    Assert.assertEquals("4", (new Main()).median(arr));
  }

  @Test
  public void testOddNeg() {
    int[] arr = {-5, -2, -1, -4, -3};
    Assert.assertEquals("-3", (new Main()).median(arr));
  }

  @Test
  public void testEvenNeg() {
    int[] arr = {-5, -2, -1, -4, -3, -6};
    Assert.assertEquals("-3.5", (new Main()).median(arr));
  }

  @Test
  public void testWrong() {
    int[] arr = {};
    Assert.assertEquals("", (new Main()).median(arr));
  }

}
