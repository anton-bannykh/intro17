import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void randomTest() {
    int[] randomArray = {17, 3, 5};
    Assert.assertEquals(3, (new Main()).getMinimum(randomArray));
  }

  @Test
  public void randomTestWithNegativeValues() {
    int[] randomArray = {-17, 0, 34};
    Assert.assertEquals(-17, (new Main()).getMinimum(randomArray));
  }

  @Test
  public void testOnSpecifiedCondition() {
    int[] specifiedArray = {};
    Assert.assertEquals(Integer.MAX_VALUE, (new Main()).getMinimum(specifiedArray));
  }

  @Test
  public void oneTokenTest() {
    int[] oneTokenArray = {1337};
    Assert.assertEquals(1337, (new Main()).getMinimum(oneTokenArray));
  }
}
