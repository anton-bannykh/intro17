package arimon.intro17.console;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void oneWrong() {
    String[] arr = {"1", "2", "t", "4", "5", "7"};
    assertEquals("Incorrect input: one of the arguments is not int", (new Main()).check(arr));
  } 
  
  @Test
  public void numWithLetter() {
    String[] arr = {"1", "2", "3", "4", "5x", "7"};
    assertEquals("Incorrect input: one of the arguments is not int", (new Main()).check(arr));
  }
  
  @Test
  public void similarToNum() {
    String[] arr = {"O", "2", "3", "4", "5", "7"};
    assertEquals("Incorrect input: one of the arguments is not int", (new Main()).check(arr));
  }
  
  @Test
  public void right() {
    String[] arr = {"1", "2", "3", "4", "5", "7"};
    assertEquals("49", (new Main()).check(arr));
  }
}