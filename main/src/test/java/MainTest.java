import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void exceptionTest() {
    assertEquals("Error: \"darude-sandstorm\" is not a number", Main
        .getResult(new String[] {"1", "2", "darude-sandstorm", "5"}));
  }

  @Test
  public void randomTest() {
    assertEquals("5", Main.getResult(new String[] {"1", "5", "4", "14", "2"}));
  }
}
