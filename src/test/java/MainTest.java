import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }
}
