import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  /**
   *tests.
  **/  
  @Test
  public void simpleTest1() {
    Assert.assertEquals("4.0", Main.doit(new String[]{"1", "1", "1", "1"}));
  }

  @Test
  public void testCorrectInput1() {
    Assert.assertEquals("Wrong input data!", Main.doit(new String[]{"1", "4", "ups"}));
  }

}