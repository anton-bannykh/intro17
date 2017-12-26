import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void testSumString() {
    Assert.assertEquals("4", Main.getArgs(new int[] {"2", "2"}));
    Assert.assertEquals("15", Main.getArgs(new String[] {"1", "2", "2", "10"}));
  }

  @Test
  public void testStringError() {
    Assert.assertEquals("string is not a number", 
        Main.getArgs(new String[] {"1","7899", "string", "567", "222"}));
    Assert.assertEquals("+ is not a number", 
        Main.getArgs(new String[] {"1", "2", "+", "10"}));
  }

  @Test
  public void testSumEmpty() {
    Assert.assertEquals("Imput is empty", Main.getArgs(new String[] {}));
  }

}
