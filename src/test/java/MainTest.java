import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
  @Test
  public void testMax_randomarray1() {
    assertEquals(5, (new Main()).max(new int[] {1,2,3,4,5}));
  }

  @Test
  public void testMax_randomarray2() {
    assertEquals(3, (new Main()).max(new int[] {1,-2,3,-4,-5}));
  }

  @Test
  public void testMax_Empty() {
    assertEquals(0, (new Main()).max(new int[] {}));
  }

  @Test
  public void testMax_Negative() {
    assertEquals(-5, (new Main()).max(new int[] {-5, -35, -100, -12}));
  }

  @Test
  public void testInputIncorrect() {
    assertEquals("Oops",(new Main()).max(new String[] {"0","2","32","NAN"}));
  }

  @Test
  public void testInputCorrect() {
    assertEquals("32",(new Main()).max(new String[] {"0","2","32","1"}));
  }

}
