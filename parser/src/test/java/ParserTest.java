import borat.intro17.parser.ArgsToArray;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    @Test
    public void testSimpleInput() {
        String[] testArr = {"10", "20", "30"};
        double[] finArr = {10, 20, 30};
        Assert.assertArrayEquals(finArr, ArgsToArray.get(testArr), 0.0);
    }
    
    @Test
    public void testEmptyInput() {
        String[] testArr = {};
        double[] finArr = {};
        Assert.assertArrayEquals(finArr, ArgsToArray.get(testArr), 0.0);
    }
    
    @Test
    public void testIncorrectInput() {
        String[] testArr = {"10", "20", "30", "Rick and Morty is the best anime Rick is my waifu!"};
        double[] finArr = {};
        Assert.assertArrayEquals(finArr, ArgsToArray.get(testArr), 0.0);
    }
}
