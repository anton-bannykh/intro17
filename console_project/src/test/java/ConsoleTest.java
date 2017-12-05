import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConsoleTest {

  @Test
  public void testOddPos() {
    String[] arr = {"5", "2", "1", "4", "3"};
    int[] check = {5, 2, 1, 4, 3};
    Assert.assertEquals(true, Arrays.equals((new Console()).parse(arr), check));
  }

  @Test
  public void testEvenPos1() {
    String[] arr = {"5", "2", "1", "4", "3", "6"};
    int[] check = {5, 2, 1, 4, 3, 6};
    Assert.assertEquals(true, Arrays.equals((new Console()).parse(arr), check));
  }

  @Test
  public void testEvenPos2() {
    String[] arr = {"5", "2", "1", "7", "3", "6"};
    int[] check = {5, 2, 1, 7, 3, 6};
    Assert.assertEquals(true, Arrays.equals((new Console()).parse(arr), check));
  }

  @Test
  public void testOddNeg() {
    String[] arr = {"-5", "-2", "-1", "-4", "-3"};
    int[] check = {-5, -2, -1, -4, -3};
    Assert.assertEquals(true, Arrays.equals((new Console()).parse(arr), check));
  }

  @Test
  public void testEvenNeg() {
    String[] arr = {"-5", "-2", "-1", "-4", "-3", "-6"};
    int[] check = {-5, -2, -1, -4, -3, -6};
    Assert.assertEquals(true, Arrays.equals((new Console()).parse(arr), check));
  }

  @Test
  public void testWrong() {
    String[] arr = {"5", "4", "kek", "-5"};
    int[] check = {};
    Assert.assertEquals(true, Arrays.equals((new Console()).parse(arr), check));
  }
}