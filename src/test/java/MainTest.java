import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testSum() {
    assertEquals(6, (new Main()).sum(new int[] {1, 2, 3}));
    assertEquals(0, (new Main()).sum(new int[] {0, 0, 0}));
  }
  
  @Test
  public void testSumEmpty() {
    assertEquals(0, (new Main()).sum(new int[] {}));
  }
  
  @Test
  public void testSumNegative() {
    assertEquals(-666, (new Main()).sum(new int[] {-111, -222, -333}));
  }

  public static final String ERROR_TEXT = "Cannot parse integer at position %d";

  @Test
  public void testSumError() {
    assertEquals(String.format(ERROR_TEXT, 0), (new Main()).getSumOrError(new String[] {"a"}));
    assertEquals("0", (new Main()).getSumOrError(new String[] {"1", "2", "-3"}));
  }
}
