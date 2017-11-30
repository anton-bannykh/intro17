import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void testGcd1() {
    int[] arr = {};
    Assert.assertEquals(Integer.MAX_VALUE, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd2() {
    int[] arr = {0, 0, 0, 0, 0};
    Assert.assertEquals(Integer.MAX_VALUE, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd3() {
    int[] arr = {228};
    Assert.assertEquals(228, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd4() {
    int[] arr = {2, 4, 18, 98};
    Assert.assertEquals(2, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd5() {
    int[] arr = {3072, 72, 15984};
    Assert.assertEquals(24, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd6() {
    int[] arr = {215784, 298404, 73872, 39852, 104328, 118584, 6480};
    Assert.assertEquals(324, (new Main()).nekogcd(arr));
  }
}
