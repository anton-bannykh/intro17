import static org.junit.Assert.assertEquals;

import me.BrilZliaN.intro17.algo.Algorithm;
import me.BrilZliaN.intro17.util.CommandLineHandler;

import org.junit.Test;

public class MainTest {
  
  @Test
  public void testFoo() {
    assertEquals(10, (new Main()).foo());
  }
  
  @Test
  public void testSumPrimitive() {
    assertEquals(14, new Algorithm().sumPowersOf2(new int[] {1, 2, 3}));
  }
  
  @Test
  public void testSumEmpty() {
    assertEquals(0, new Algorithm().sumPowersOf2(new int[0]));
  }
  
  @Test
  public void testSumNegative() {
    assertEquals(0, new Algorithm().sumPowersOf2(new int[] {Integer.MIN_VALUE, -3, -2, -1}));
  }
  
  @Test
  public void testSumBig() {
    assertEquals(0, new Algorithm().sumPowersOf2(new int[] {31, 32, 33, Integer.MAX_VALUE}));
  }
  
  @Test
  public void testInputCorrect() {
    assertEquals("15", new CommandLineHandler().sumPowersOf2(new String[] {"1", "2", "3", "0"}));
  }
  
  @Test
  public void testInputIncorrect() {
    assertEquals("Wrong input format: \"O\" is not an integer!", 
        new CommandLineHandler().sumPowersOf2(new String[] {"1", "2", "3", "O"}));
  }
  
}
