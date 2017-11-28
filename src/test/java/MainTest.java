import org.junit.Assert;
import org.junit.Test;

public class MainTest {
<<<<<<< HEAD

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
=======
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
>>>>>>> parent of d398f61... Resolved algorithm
  }
}
