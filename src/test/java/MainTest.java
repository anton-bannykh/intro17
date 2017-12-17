import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testSum() {
    assertEquals(4, Main.sumLowestBits(new int[] {1, 2, 3}));
    assertEquals(7, Main.sumLowestBits(new int[] {10, 12, 3}));
    assertEquals(10, Main.sumLowestBits(new int[] {101, 1, 0, 12, 4}));
  }

  @Test
  public void testSumEmpty() {
    assertEquals(0, Main.sumLowestBits(new int[] {}));
  }

  @Test
  public void testSumNegative() {
    assertEquals(4, Main.sumLowestBits(new int[] {-1, 2, -3}));
    assertEquals(7, Main.sumLowestBits(new int[] {10, -12, 3}));
    assertEquals(10, Main.sumLowestBits(new int[] {-101, 1, 0, -12, 4}));
  }

  @Test
  public void testSumString() {
    assertEquals("4", Main.getSumOrError(new String[] {"1", "-2", "3"}));
  }

  @Test
  public void testSumError() {
    assertEquals("Your array is incorrect", Main.getSumOrError(new String[] {"23", "-gs", "3"}));
    assertEquals("Your array is incorrect", Main.getSumOrError(new String[] {"2", "-2", "3kek"}));
  }
}
