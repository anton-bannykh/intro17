import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testSum() {
    assertEquals(6, Main.sum(new int[] {1, 2, 3}));
    assertEquals(0, Main.sum(new int[] {0, 0, 0}));
  }
  
  @Test
  public void testSumEmpty() {
    assertEquals(0, Main.sum(new int[] {}));
  }
  
  @Test
  public void testSumNegative() {
    assertEquals(-666, Main.sum(new int[] {-111, -222, -333}));
  }

  static final String ERROR_TEXT_1 = "Cannot parse integer at position 0";
  static final String ERROR_TEXT_2 = "Cannot parse integer at position 4";

  @Test
  public void testSumString() {
    assertEquals("0", Main.getSumOrError(new String[] {"1", "2", "-3"}));
  }

  @Test
  public void testSumError() {
    assertEquals(ERROR_TEXT_1, Main.getSumOrError(new String[] {"a"}));
    assertEquals(ERROR_TEXT_2, Main.getSumOrError(new String[] {"0", "17", "34", "51", "hello"}));
  }
}
