import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testForZeroes() {
    assertEquals("5", (new Main()).countTotalZeroes(new String[] {"0", "0", "0", "0", "0"}));
  }

  @Test
  public void testForEmptyArray() {
    assertEquals("0", (new Main()).countTotalZeroes(new String[] {}));
  }

  @Test
  public void testForNoZeroes() {
    assertEquals("0", (new Main()).countTotalZeroes(new String[] {"1", "3", "7", "15", "31"}));
  }

  @Test
  public void randomTest() {
    assertEquals("5", (new Main()).countTotalZeroes(new String[] {"1", "5", "4", "14", "2"}));
  }

  @Test
  public void exceptionTest() {
    assertEquals("Error: \"darude-sandstorm\" is not a number", (new Main())
        .countTotalZeroes(new String[] {"1", "2", "darude-sandstorm", "5"}));
  }
}
