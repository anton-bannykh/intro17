import org.junit.Assert;
import org.junit.Test;
import argstoarray.ArgsToArray;
import checksum.CheckSum;

public class MainTest {
  @Test
  public void simpleTest1() {
    Assert.assertEquals(true, CheckSum.foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
  }

  @Test
  public void simpleTest2() {
    Assert.assertEquals(false, CheckSum.foo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }

  @Test
  public void simpleTest3() {
    Assert.assertEquals(false, CheckSum.foo(new int[]{1}));
  }

  @Test
  public void simpleTest4() {
    Assert.assertEquals(true, CheckSum.foo(new int[]{2}));
  }

  @Test
  public void testOverflow1() {
    Assert.assertEquals(false, CheckSum.foo(new int[]{2147483647, 2147483646,
        2147483645, 2147483644, 2147483643, 2147483642}));
  }

  @Test
  public void testOverflow2() {
    Assert.assertEquals(false, CheckSum.foo(new int[]{-2147483648, -2147483647,
        -2147483646, -2147483645, -2147483644, -2147483643}));
  }

  @Test
  public void testOverflow3() {
    Assert.assertEquals(true, CheckSum.foo(new int[]{-2147483648, 2147483647, -2147483647,
        2147483646, -2147483646, 2147483645, -2147483645, 2147483644, -2147483644, 2147483643,
        -2147483643, 2147483642}));
  }

  @Test
  public void testCorrectInput1() {
    Assert.assertEquals(false, ArgsToArray.get_args(new int[3], new String[]{"1", "4", "ups"}));
  }

  @Test
  public void testCorrectInput2() {
    Assert.assertEquals(true, ArgsToArray.get_args(new int[3], new String[]{"1", "4", "3"}));
  }

  @Test
  public void testCorrectInput3() {
    Assert.assertEquals(true, ArgsToArray.get_args(new int[12], new String[]{"-2147483648",
        "2147483647", "-2147483647", "2147483646", "-2147483646", "2147483645", "-2147483645",
        "2147483644", "-2147483644", "2147483643", "-2147483643", "2147483642"}));
  }

  @Test
  public void testCorrectInput4() {
    Assert.assertEquals(false, ArgsToArray.get_args(new int[12], new String[]{"-2147483648",
        "2147483647", "-2147483647", "2147483646", "-2147483646", "2147483645", "-2I47483645",
        "2147483644", "-2147483644", "2147483643", "-2147483643", "2147483642"}));
  }

  @Test
  public void testCorrectInput5() {
    Assert.assertEquals(false, ArgsToArray.get_args(new int[12], new String[]{"-2147483648",
        "2147483647", "--2147483647", "2147483646", "-2147483646", "2147483645", "-2147483645",
        "2147483644", "-2147483644", "2147483643", "-2147483643", "2147483642"}));
  }

  @Test
  public void testCorrectInput6() {
    Assert.assertEquals(true, ArgsToArray.get_args(new int[12], new String[]{"-2147483648",
        "2147483647", "+2147483647", "2147483646", "-2147483646", "2147483645", "-2147483645",
        "2147483644", "-2147483644", "2147483643", "-2147483643", "2147483642"}));
  }

  @Test
  public void testCorrectInput7() {
    Assert.assertEquals(true, ArgsToArray.get_args(new int[0], new String[0]));
  }
}
