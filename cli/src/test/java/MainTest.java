package ru.nsychev.intro17.cli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testCorrect() {
    assertEquals("0", Main.getSumOrError(new String[] {"1", "2", "-3"}));
  }

  @Test
  public void testError() {
    assertEquals("Cannot parse integer at position 0", Main.getSumOrError(new String[] {"a"}));
    assertEquals(
        "Cannot parse integer at position 3",
        Main.getSumOrError(new String[] {"1", "2", "3", "aaaa"})
    );
  }
}
