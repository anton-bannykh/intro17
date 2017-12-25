import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testSumString() {
    Assert.assertEquals("32", Main.makeSumOfBits(new String[] {"-1"}));
    Assert.assertEquals("5", Main.makeSumOfBits(new String[] {"1", "2", "2", "10"}));
  }

  @Test
  public void testStringError() {
    Assert.assertEquals("Can't parse integer", 
        Main.makeSumOfBits(new String[] {"1", "lol2", "qwe", "222"}));
    Assert.assertEquals("Can't parse integer", 
        Main.makeSumOfBits(new String[] {"-----1", "2", "+", "10"}));
  }

  @Test
  public void testSumEmpty() {
    Assert.assertEquals("0", Main.makeSumOfBits(new String[] {}));
  }
}
