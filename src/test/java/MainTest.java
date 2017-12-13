import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  
  @Test
  public void testEmpty() {
    int[] arr = {};
    assertEquals(0, (new Main()).xor(arr));
  }
  
  @Test
  public void testSingleNumber() {
    int[] arr = {42};
    assertEquals(42, (new Main()).xor(arr));
  }
  
  @Test
  public void testTwoNumbers() {
    int[] arr = {216, 38};
    assertEquals(254, (new Main()).xor(arr));
  }
  
  @Test
  public void testEvenCountOfOneNumber() {
    int[] arr = {6, 6, 6, 6, 6, 6};
    assertEquals(0, (new Main()).xor(arr));
  }
 
  @Test
  public void testOddCountOfOneNumber() {
    int[] arr = {3, 3, 3};
    assertEquals(3, (new Main()).xor(arr));
  }
  
  @Test
  public void testZeros() {
    int[] arr = {0, 0, 0, 0, 0};
    assertEquals(0, (new Main()).xor(arr));
  }
  
  @Test
  public void testMaxInt() {
    int[] arr = {Integer.MAX_VALUE, 0};
    assertEquals(Integer.MAX_VALUE, (new Main()).xor(arr));
  }
  
  @Test
  public void testIntBorders() {
    int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
    assertEquals(-1, (new Main()).xor(arr));
  }
}