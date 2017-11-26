import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test public void testFoo() {
        Assert.assertEquals(20, (new Main()).foo());
    }
}
