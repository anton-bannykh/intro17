import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void test1_empty() {
    int[] arr = {};
    Assert.assertEquals(0, (new Main()).rangeOr(arr));
  }
  public void test2_oneNumber() {
    int[] arr = {1};
    Assert.assertEquals(1, (new Main()).rangeOr(arr));
  }
  public void test3_allBitIsOne() {
    int[] arr = {-2, 1};
    Assert.assertEquals(-1, (new Main()).rangeOr(arr));
  }
  public void test4_or() {
    int [] arr = {1, 3};
    Assert.assertEquals(3, (new Main()).rangeOr(arr));
  }
}
