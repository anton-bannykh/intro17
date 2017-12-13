import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  
  @Test
  public void testEmpty() {
    String[] arr = {};
    assertEquals("0", (new Main()).sumOfMul(arr));
  }
  
  @Test
  public void testSingleNumber() {
    String[] arr = {"228"};
    assertEquals("228", (new Main()).sumOfMul(arr));
  }
  
  @Test
  public void testSomeMumbers() {
    String[] arr = {"2", "4", "18", "98"};
    assertEquals("1772", (new Main()).sumOfMul(arr));
  }
  
  @Test
  public void testOnes() {
    String[] arr = {"1", "1", "1", "1", "1"};
    assertEquals("3", (new Main()).sumOfMul(arr));
  }
 
  @Test
  public void testSomeEqualNumbers() {
    String[] arr = {"123", "123", "123"};
    assertEquals("15252", (new Main()).sumOfMul(arr));
  }
  
  @Test
  public void testZeros() {
    String[] arr = {"0", "0", "0", "0"};
    assertEquals("0", (new Main()).sumOfMul(arr));
  }
  
  @Test
  public void testPermutation() {
    String[] arr = {"1", "2", "3", "4", "5", "7"};
    assertEquals("49", (new Main()).sumOfMul(arr));
  }
  
  @Test
  public void noNumbers() {
    String[] arr = {"1", "2", "t", "4", "5", "7"};
    assertEquals("Incorrect input: one of the arguments is not int", (new Main()).sumOfMul(arr));
  }
}