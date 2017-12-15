import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testCorrect() {
    assertArrayEquals(new int[] {1, 2, -3}, Main.parseArgs(new String[] {"1", "2", "-3"}));
  }

  @Test
  public void testError() {
    assertArrayEquals(new int[] {}, Main.parseArgs(new String[] {"a"}));
    assertArrayEquals(new int[] {}, Main.parseArgs(new String[] {"1", "2", "3", "aaaa"}));
  }
}
