import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
  @Test
  public void testSimple(){
    assertEquals(30, Main.sum_of_power5(new int[]{1,2}));
  }

  @Test
  public void testIgnoreLargeNumbers(){
    assertEquals(30, Main.sum_of_power5(new int[]{11, 1, 13, 2}));
  }

  @Test
  public void testAllNumbersIs0(){
    assertEquals(3, Main.sum_of_power5(new int[]{0, 0, 0}));
  }

  @Test
  public void testSingleNumber(){
    assertEquals(25, Main.sum_of_power5(new int[]{2}));
  }

  @Test
  public void testEmptyInput(){
    assertEquals(0, Main.sum_of_power5(new int[]{}));
  }

  @Test
  public void allCasesTogether(){
    assertEquals(3256, Main.sum_of_power5(new int[]{3, 0, 5, 14, 1, 15}));
  }

  @Test
  public void speakingName(){
    assertEquals(78380, Main.sum_of_power5(new int[]{1, 3, 3, 7}));
  }

  @Ignore
  @Test(timeout = 1000)
  public void speedTest(){
    assertEquals(12207030,Main.sum_of_power5(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }

}
