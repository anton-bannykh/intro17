package arimon.intro17.summul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumMulTest {
  
  @Test
  public void testEmpty() {
    int[] arr = {};
    assertEquals("0", (new SumMul()).sumOfMul(arr));
  }
  
  @Test
  public void testSingleNumber() {
    int[] arr = {228};
    assertEquals("228", (new SumMul()).sumOfMul(arr));
  }
  
  @Test
  public void testSomeMumbers() {
    int[] arr = {2, 4, 18, 98};
    assertEquals("1772", (new SumMul()).sumOfMul(arr));
  }
  
  @Test
  public void testOnes() {
    int[] arr = {1, 1, 1, 1, 1};
    assertEquals("3", (new SumMul()).sumOfMul(arr));
  }
 
  @Test
  public void testSomeEqualNumbers() {
    int[] arr = {123, 123, 123};
    assertEquals("15252", (new SumMul()).sumOfMul(arr));
  }
  
  @Test
  public void testZeros() {
    int[] arr = {0, 0, 0, 0};
    assertEquals("0", (new SumMul()).sumOfMul(arr));
  }
  
  @Test
  public void testPermutation() {
    int[] arr = {1, 2, 3, 4, 5, 7};
    assertEquals("49", (new SumMul()).sumOfMul(arr));
  }
}