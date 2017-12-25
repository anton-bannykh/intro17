import argtoar.ArgToAr;
import getmin.GetMin;
import org.junit.Assert;
import org.junit.Test;


public class MainTest {
  /**
  *why do u need these docs?.
  **/
  @Test
  public void okTest() {
    Assert.assertEquals(2, GetMin.getMin(new int[] {2, 6, 14}));
  }
}
