import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testForZeroes() {
    assertEquals(5, (new Main()).countTotalZeroes(new int[] {0, 0, 0, 0, 0}));
  }

  @Test
  public void testForEmptyArray() {
    assertEquals(0, (new Main()).countTotalZeroes(new int[] {}));
  }

  @Test
  public void testForNoZeroes() {
    assertEquals(0, (new Main()).countTotalZeroes(new int[] {1, 3, 7, 15, 31}));
  }

  @Test
  public void randomTest() {
    assertEquals(5, (new Main()).countTotalZeroes(new int[] {1, 5, 4, 14, 2}));
  }
}
