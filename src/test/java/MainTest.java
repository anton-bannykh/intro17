import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals("6", (new Main()).foo(new String[]{"1","2","3"}));
    Assert.assertEquals("0", (new Main()).foo(new String[]{"0"}));
    Assert.assertEquals("0", (new Main()).foo(new String[]{"10000","-10000"}));
    Assert.assertEquals("-12345678", (new Main()).foo(new String[]{"-12345678"}));
    Assert.assertEquals("4", (new Main()).foo(new String[]{"1","-2","3","-4","5","-6","7"}));
    Assert.assertEquals("Input isn't correct...", (new Main()).foo(new String[]{"1","acv","3r5","45"}));
  }
}
