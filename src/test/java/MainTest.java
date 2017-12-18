import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  static double delta = 1e-7;

  @Test
  public void testChain1() {
    Assert.assertEquals(1, ((new Main()).chainFrac(new int[]{1})), delta);
  }

  /*@Test
  public void testChain2() {
    Assert.assertEquals(2, (new Main()).chainFrac(new int[]{3, -1, 1}), delta);
  }*/

  @Test
  public void testChain3() {
    Assert.assertEquals(3.4, (new Main()).chainFrac(new int[]{3, 2, 2}), delta);
  }

  @Test
  public void testChain4() {
    Assert.assertEquals(-5.0 / 3, (new Main()).chainFrac(new int[]{-1, -1, -1, -1}), delta);
  }

  @Test
  public void testChain5() {
    Assert.assertEquals(3.0 + 1.0 / 3, (new Main()).chainFrac(new int[]{3, 2, 1}), 0);
  }

  @Test
  public void testChain6() {
    Assert.assertEquals(1.6180904, (new Main()).chainFrac(new int[]{1, 1, 1, 1, 1,
                                                                    1, 1, 1, 1, 1, 3}), delta);
  }
}
