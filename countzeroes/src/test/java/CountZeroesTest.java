package frostreaper.intro17.countzeroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountZeroesTest {
  @Test
  public void testForZeroes() {
    assertEquals(5, CountZeroes.countTotalZeroes(new int[] {0, 0, 0, 0, 0}));
  }

  @Test
  public void testForEmptyArray() {
    assertEquals(0, CountZeroes.countTotalZeroes(new int[] {}));
  }

  @Test
  public void testForNoZeroes() {
    assertEquals(0, CountZeroes.countTotalZeroes(new int[] {1, 3, 7, 15, 31}));
  }
}
