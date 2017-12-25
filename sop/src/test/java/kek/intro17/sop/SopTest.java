package kek.intro17.sop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SopTest {

  @Test
  public void correctSum() {
    assertEquals(13, Sop.sumOfPows(new int[] {0,1,2}));
  }

  @Test
  public void testSmallArgs() {
    assertEquals(1, Sop.sumOfPows(new int[] {-1,0,-2,-345}));
  }

  @Test
  public void testBigArgs() {
    assertEquals(3, Sop.sumOfPows(new int[] {1,16,17,999}));
  }

}
