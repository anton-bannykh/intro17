package kek.intro17.console;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

  @Test
  public void testIncorrectInput() {
    assertEquals("Zachem?", Main.parse(new String[] {"0","Zatem","1"}));
  }

  @Test
  public void testCorrectInput() {
    assertEquals( "13", Main.parse(new String[] {"0","1","2"}));
  }
}