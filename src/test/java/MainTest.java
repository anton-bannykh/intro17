import org.junit.Assert;
import org.junit.Test;

public class MainTest {
<<<<<<< HEAD
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
=======

  @Test
  public void testOddPos() {
    String[] arr = {"5", "2", "1", "4", "3"};
    Assert.assertEquals("3", (new Main()).median(arr));
  }

  @Test
  public void testEvenPos1() {
    String[] arr = {"5", "2", "1", "4", "3", "6"};
    Assert.assertEquals("3.5", (new Main()).median(arr));
  }

  @Test
  public void testEvenPos2() {
    String[] arr = {"5", "2", "1", "7", "3", "6"};
    Assert.assertEquals("4", (new Main()).median(arr));
  }

  @Test
  public void testOddNeg() {
    String[] arr = {"-5", "-2", "-1", "-4", "-3"};
    Assert.assertEquals("-3", (new Main()).median(arr));
  }

  @Test
  public void testEvenNeg() {
    String[] arr = {"-5", "-2", "-1", "-4", "-3", "-6"};
    Assert.assertEquals("-3.5", (new Main()).median(arr));
  }

  @Test
  public void testNull() {
    String[] arr = {};
    Assert.assertEquals("0", (new Main()).median(arr));
  }

  @Test
  public void testWrong() {
    String[] arr = {"5", "4", "kek", "-5"};
    Assert.assertEquals("You wrote not a number!", (new Main()).median(arr));
>>>>>>> 16b2a44fe281f77ab94dd85a8d5e752c07e15f20
  }
}
