import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  
  @Test
  public void testFoo() {
    assertEquals(10, (new Main()).foo());
  }
  
  @Test
  public void testSumPrimitive() {
    assertEquals(14, new Main().sumPowersOf2(new int[] {1, 2, 3}));
  }
  
  @Test
  public void testSumEmpty() {
    assertEquals(0, new Main().sumPowersOf2(new int[0]));
  }
  
  @Test
  public void testSumNegative() {
    assertEquals(0, new Main().sumPowersOf2(new int[] {Integer.MIN_VALUE, -3, -2, -1}));
  }
  
  @Test
  public void testSumBig() {
    assertEquals(0, new Main().sumPowersOf2(new int[] {31, 32, 33, Integer.MAX_VALUE}));
  }
  
}
