import Xpech.intro17.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
  @Test
  public void testSimpleInput() {
    String[] testArr = {"10", "20", "30"};
    int[] finArr = {10, 20, 30};
    Assert.assertArrayEquals(finArr, Parser.parse(testArr));
  }

  @Test
  public void testEmptyInput() {
    String[] testArr = {};
    int[] finArr = {};
    Assert.assertArrayEquals(finArr, Parser.parse(testArr));
  }

  @Test
  public void testIncorrectInput() {
    String[] testArr = {"10", "20", "30", "Rick and Morty is the best anime Rick is my waifu!"};
    int[] finArr = {};
    Assert.assertArrayEquals(finArr, Parser.parse(testArr));
  }
}
