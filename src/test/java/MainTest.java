import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  @Test
  public void testFoo() {
    Assert.assertEquals(10, (new Main()).foo());
  }

  @Test
  public void testOk() {
    double[] array = new double[3];
    array[0] = 1.0;
    array[1] = 1.0;
    array[2] = 1.0;
    System.out.println((new Main()).partSum(array));
    Assert.assertEquals(3.0, (new Main()).partSum(array), 0.0);
  }
}
