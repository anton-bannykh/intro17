import borat.intro17.algo.PartSum;
import org.junit.Assert;
import org.junit.Test;

public class AlgoTest {
    @Test
    public void testSimple() {
        double[] testArgs = {1.0, 1.0, 1.0};
        Assert.assertEquals(3.0, PartSum.part(testArgs), 0.0);
    }
}
