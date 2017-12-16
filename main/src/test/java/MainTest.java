import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void testGcd1_empty() {
    int[] arr = {};
    assertEquals(Integer.MAX_VALUE, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd2_allzero() {
    int[] arr = {0, 0, 0, 0, 0};
    assertEquals(Integer.MAX_VALUE, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd3_singlenumber() {
    int[] arr = {228};
    assertEquals(228, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd4_onesimple() {
    int[] arr = {2, 4, 18, 98};
    assertEquals(2, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd5_complex() {
    int[] arr = {3072, 72, 15984};
    assertEquals(24, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd6_complexbig() {
    int[] arr = {215784, 298404, 73872, 39852, 104328, 118584, 6480};
    assertEquals(324, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd7_singlenegative() {
    int[] arr = {-38};
    assertEquals(38, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd8_somenegatives() {
    int[] arr = {-99, -27, -18};
    assertEquals(9, (new Main()).nekogcd(arr));
  }

  @Test
  public void testGcd9_negativeandpositive() {
    int[] arr = {215784, -298404, 73872, -39852, 104328, 118584, -6480};
    assertEquals(324, (new Main()).nekogcd(arr));
  }
}