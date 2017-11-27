import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MainTest {
  @Test
  public void testSumDecEmpty() {
    assertEquals(0, (new Main()).sumDec(new int[]{}));
  }
  
  @Test
  public void testSumDecPositive() {
    assertEquals(6, (new Main()).sumDec(new int[]{5, 6, 7}));
  }
  
  @Test
  public void testSumDecNegative() {
    assertEquals(-3, (new Main()).sumDec(new int[]{-2, -6, -7}));
  }
  
  @Test
  public void testSumDecCombine() {
    assertEquals(-22, (new Main()).sumDec(new int[]{3, 5, -8, 12}));
  }
}
