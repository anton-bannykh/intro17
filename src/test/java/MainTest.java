import org.junit.Assert;
import org.junit.Test;

public class MainTest {
<<<<<<< HEAD
<<<<<<< HEAD

=======
  double eps = 1e-9;
  
>>>>>>> parent of be61d31... Task 3
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
<<<<<<< HEAD
    String[] arr = {};
    Assert.assertEquals("0", (new Main()).median(arr));
  }

  @Test
  public void testWrong() {
    String[] arr = {"5", "4", "kek", "-5"};
    Assert.assertEquals("You wrote not a number!", (new Main()).median(arr));
=======
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
>>>>>>> parent of d398f61... Resolved algorithm
=======
    int[] arr = {};
    Assert.assertEquals(0, (new Main()).median(arr), eps);
>>>>>>> parent of be61d31... Task 3
  }
}
