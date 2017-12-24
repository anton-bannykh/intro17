import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void test1_empty() {
    int[] arr = {};
    Assert.assertEquals(0, (new Main()).rangeOr(arr));
  }
  public void test2_oneNumber() {
    int[] arr = {1};
    Assert.assertEquals(1, (new Main()).rangeOr(arr));
  }
  public void test3_allBitIsOne() {
    int[] arr = {-2, 1};
    Assert.assertEquals(-1, (new Main()).rangeOr(arr));
  }
  public void test4_or() {
    int [] arr = {1, 3};
    Assert.assertEquals(3, (new Main()).rangeOr(arr));
  }
  public void testConsoleInput1_emptyInput() {
    string [] arr = {};
    Assert.assertEquals(0, (new Main()).consoleOr(arr));
  }
  public void testConsoleInput2_normalInput() {
    string [] arr = {"1", "2"};
    Assert.assertEquals(3, (new Main()).consoleOr(arr));
  }
  public void testConsoleInput3_wrongInput() {
    string [] arr = {"1", "a"};
    Assert.assertEquals("Infernal error: string number 1 not a number", (new Main()).consoleOr(arr));
  }
}
