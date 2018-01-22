import argtoar.ArgToAr;
import org.junit.Assert;
import org.junit.Test;

public class TestArgToAr {

  /**
  * why do u need these docs?.
  **/

  @Test
  public void testBadSysFormat() {
    String[] curTest = new String[3];
    curTest[0] = new String("123");
    curTest[1] = new String("ROFL");
    curTest[2] = new String("14");
    Assert.assertEquals(null, (new ArgToAr().get(curTest)));
  }
}
