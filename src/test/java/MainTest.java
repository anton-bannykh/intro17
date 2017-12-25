import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testCountSimple() {
    String[] testArr = {"10", "20", "30"};
    Assert.assertEquals("3", (Main.getAnswer(testArr)));
  }

  @Test
  public void testEmptyInput() {
    Assert.assertEquals("0", (Main.getAnswer(new String[]{})));
  }

  @Test
  public void testBigInt() {
    String[] testArr = {"1000000000", "1000000000", "1000000000", "1000000000", "10000"};
    Assert.assertEquals("40", (Main.getAnswer(testArr)));
  }

  @Test
  public void testNotEndZeroes() {
    String[] testArr = {"101", "10"};
    Assert.assertEquals("2", (Main.getAnswer(testArr)));
  }

  @Test
  public void testIfWeTypeSomethingIncorrect() {
    String[] testArr = {"42", "24", "55", "Rick'n'Morty is the best anime ever Rick is my waifu"};
    Assert.assertEquals("Error: it doesn't look like numbers, try something else.",
        (Main.getAnswer(testArr)));
  }
}
