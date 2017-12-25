import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFun1() {
    Assert.assertEquals(0, (new Main()).fun(new int[] {1, 2}));
  }
  @Test
  public void testFun2() {
    Assert.assertEquals(3, (new Main()).fun(new int[] {10, 34, 3080}));
  }
  @Test
  public void testFun3() {
    Assert.assertEquals(6, (new Main()).fun(new int[] {10, 100, 1000}));
  }
  @Test
  public void testFun4() {
    Assert.assertEquals(3, (new Main()).fun(new int[] {1010, 239, 228, 0}));
  }
  @Test
  public void testFun5() {
    Assert.assertEquals(10, (new Main()).fun(new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
  }
  @Test
  public void testFun6() {
    Assert.assertEquals(1, (new Main()).fun(new int[] {1, 2,3,4,5,6,30,239,228}));
  }
}


