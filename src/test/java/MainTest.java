import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testNull() {
    String[] arr = {};
    assertEquals(0, (new Main()).parse(arr));
  }

  @Test
  public void testPos() {
    String[] arr = {"6", "6"};
    assertEquals(42, (new Main()).parse(arr));
  }

  @Test
  public void testNeg() {
    String[] arr = {"-8", "-8"};
    assertEquals(56, (new Main()).parse(arr));
  }

  @Test
  public void testZero() {
    String[] arr = {"0", "0"};
    assertEquals(0, (new Main()).parse(arr));
  }

  @Test
  public void testShort() {
    String[] arr = {"6", "-3", "10"};
    assertEquals(1015, (new Main()).parse(arr));
  }

  @Test
  public void testLong() {
    String[] arr = {"-3", "-2", "-8", "3", "5", "0", "1", "-1"};
    assertEquals(2697, (new Main()).parse(arr));
  }
  
  @Test
  public void testDouble() {
    String[] arr = {"-3", "0", "-8", "4.5", "228"};
    assertEquals("Format isn't correct: \"4.5\" must be integer", (new Main()).parse(arr));
  }
  
  @Test
  public void testText() {
    String[] arr = {"1330", "hardGit"};
    assertEquals("Format isn't correct: \"hardGit\" must be integer", (new Main()).parse(arr));
  }
}