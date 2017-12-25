package spolutrean.intro17.sum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {
  
  @Test
  public void testEmpty() {
    int[] arr = {};
    assertEquals("0", (new Sum()).sumOf(arr));
  }
  
  @Test
  public void testSingleNumber() {
    int[] arr = {228};
    assertEquals("228", (new Sum()).sumOf(arr));
  }
  
  @Test
  public void testSomeMumbers() {
    int[] arr = {2, 4, 8, 5};
    assertEquals("1", (new Sum()).sumOf(arr));
  }
  
  @Test
  public void testOnes() {
    int[] arr = {1, 1, 1, 1, 1};
    assertEquals("1", (new Sum()).sumOf(arr));
  }
 
  @Test
  public void testSomeEqualNumbers() {
    int[] arr = {123, 123, 123};
    assertEquals("123", (new Sum()).sumOf(arr));
  }
  
  @Test
  public void testZeroes() {
    int[] arr = {0, 0, 0, 0};
    assertEquals("0", (new Sum()).sumOf(arr));
  }
  
  @Test
  public void testPermutation() {
    int[] arr = {1, 2, 3, 4, 5, 7};
    assertEquals("-4", (new Sum()).sumOf(arr));
  }
}