import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void correctSum() {
    Assert.assertEquals(13, (new Main()).sumOfPows(new int[] {0,1,2}));
  }

  @Test
  public void testSmallArgs() {
    Assert.assertEquals(1, (new Main()).sumOfPows(new int[] {-1,0,-2,-345}));
  }

  @Test
  public void testBigArgs() {
    Assert.assertEquals(3, (new Main()).sumOfPows(new int[] {1,16,17,999}));
  }

  @Test
  public void testIncorrectInput() {
    Assert.assertEquals("Zachem?", (new Main()).sumOfPows(new String[] {"0","Zatem","1"}));
  }

  @Test
  public void testCorrectInput() {
    Assert.assertEquals( "13", (new Main()).sumOfPows(new String[] {"0","1","2"}));
  }
}
