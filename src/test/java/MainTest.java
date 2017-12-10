import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testNull() {
    int[] arr = {};
    assertEquals(0, (new Main()).ssum(arr));
  }

  @Test
  public void testPos() {
    int[] arr = {6, 6};
    assertEquals(42, (new Main()).ssum(arr));
  }

  @Test
  public void testNeg() {
    int[] arr = {-8, -8};
    assertEquals(56, (new Main()).ssum(arr));
  }

  @Test
  public void testZero() {
    int[] arr = {0, 0};
    assertEquals(0, (new Main()).ssum(arr));
  }

  @Test
  public void testShort() {
    int[] arr = {6, -3, 10};
    assertEquals(1015, (new Main()).ssum(arr));
  }

  @Test
  public void testLong() {
    int[] arr = {-3, -2, -8, 3, 5, 0, 1, -1};
    assertEquals(2697, (new Main()).ssum(arr));
  }
}