import static org.junit.Assert.assertEquals;

import Andryyr.intro17.parser.Parser;
import Andryyr.intro17.xor.Xor;

import org.junit.Test;

public class MainTest {
  
  @Test
  public void testEmpty() {
    int[] arr = {};
    assertEquals(0, (new Xor()).xor(arr));
  }
  
  @Test
  public void testSingleNumber() {
    int[] arr = {42};
    assertEquals(42, (new Xor()).xor(arr));
  }
  
  @Test
  public void testTwoNumbers() {
    int[] arr = {216, 38};
    assertEquals(254, (new Xor()).xor(arr));
  }
  
  @Test
  public void testEvenCountOfOneNumber() {
    int[] arr = {6, 6, 6, 6, 6, 6};
    assertEquals(0, (new Xor()).xor(arr));
  }
 
  @Test
  public void testOddCountOfOneNumber() {
    int[] arr = {3, 3, 3};
    assertEquals(3, (new Xor()).xor(arr));
  }
  
  @Test
  public void testZeros() {
    int[] arr = {0, 0, 0, 0, 0};
    assertEquals(0, (new Xor()).xor(arr));
  }
  
  @Test
  public void testMaxInt() {
    int[] arr = {Integer.MAX_VALUE, 0};
    assertEquals(Integer.MAX_VALUE, (new Xor()).xor(arr));
  }
  
  @Test
  public void testIntBorders() {
    int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
    assertEquals(-1, (new Xor()).xor(arr));
  }

  @Test
  public void testNotNumbers() {
    String[] arr = {"Hi!", "I", "am", "a", "bad", "example", "of", "input"};
    assertEquals("Incorrect input data", (new Parser()).parse(arr));
  }
}