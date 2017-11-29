import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  double eps = 1e-9;
  
  @Test
  public void testOddPos() {
    int[] arr = {5, 2, 1, 4, 3};
    Assert.assertEquals(3, (new Main()).median(arr), eps);
  }

  @Test
  public void testEvenPos() {
    int[] arr = {5, 2, 1, 4, 3, 6};
    Assert.assertEquals(3.5, (new Main()).median(arr), eps);
  }

  @Test
  public void testOddNeg() {
    int[] arr = {-5, -2, -1, -4, -3};
    Assert.assertEquals(-3, (new Main()).median(arr), eps);
  }

  @Test
  public void testEvenNeg() {
    int[] arr = {-5, -2, -1, -4, -3, -6};
    Assert.assertEquals(-3.5, (new Main()).median(arr), eps);
  }

  @Test
  public void testNull() {
    int[] arr = {};
    Assert.assertEquals(0, (new Main()).median(arr), eps);
  }
}
