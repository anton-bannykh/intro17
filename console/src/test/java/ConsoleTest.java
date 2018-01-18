import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ConsoleTest {

  @Test
  public void testConsole1_empty() {
    String[] arr = {};
    int[] res = {1};
    assertEquals(true, Arrays.equals((new Console()).parse(arr), res));
  }

  @Test
  public void testConsole2_complexint() {
    String[] arr = {"215784", "298404", "73872", "39852", "104328", "118584", "6480"};
    int[] res = {215784, 298404, 73872, 39852, 104328, 118584, 6480, 1};
    assertEquals(true, Arrays.equals((new Console()).parse(arr), res));
  }

  @Test
  public void testConsole3_complexnegandpos() {
    String[] arr = {"215784", "-298404", "73872", "-39852", "104328", "118584", "-6480"};
    int[] res = {215784, -298404, 73872, -39852, 104328, 118584, -6480, 1};
    assertEquals(true, Arrays.equals((new Console()).parse(arr), res));
  }

  @Test
  public void testConsole4_wronginput() {
    String[] arr = {"abc", "123f", "fff3", ".lk"};
    int[] res = {-1};
    assertEquals(true, Arrays.equals((new Console()).parse(arr), res));
  }

  @Test
  public void testConsole5_wronginput2() {
    String[] arr = {"123", "1234", "563", "12e98", "123"};
    int[] res = {-1};
    assertEquals(true, Arrays.equals((new Console()).parse(arr), res));
  }
}