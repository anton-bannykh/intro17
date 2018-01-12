import org.junit.Assert;
import org.junit.Test;
import parser.Parser;

public class ParserTest {

  static final String ERROR_STRING = "Can't parse integer.";

  @Test
  public void testIncorrectEnter() {
    Assert.assertEquals(ERROR_STRING, Parser.test(new String[] {"1", "2", "4", "string"}));
  }

  @Test
  public void testCorrectEnter1() {
    Assert.assertEquals("OK", Parser.test(new String[] {"0", "-22", "234", "-100"}));
  }  

  @Test
  public void testCorrectEnter2() {
    Assert.assertEquals("OK", Parser.test(new String[] {"100", "-2"}));
  }  

  @Test
  public void testCorrectEnter() {
    int[] ans = Parser.makeIntArr(new String[] {"100", "-2"});
    int[] needed = {100, -2};
    for (int i = 0; i < ans.length; ++i)
      Assert.assertEquals(ans[i], needed[i]);
  }
}
