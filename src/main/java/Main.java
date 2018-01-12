import parser.Parser;
import sum.Sum;

public class Main {

  /**
    * Calculates sum of highest bits of given array.
    * Checks for errors.
  **/
  public static void main(String[] args) {
    int[] arr;
    try {
      arr = Parser.makeIntArr(args);      
    } catch (NumberFormatException exc) {
      System.out.println("Can't parse integer.");
      return;
    }
    try {
      int ans = Sum.sumHighestBits(arr);
      System.out.println(Integer.toString(ans));  
    } catch (NumberFormatException exc) {
      System.out.println("Elements of array mustn't be negative.");
      return;
    }
  }
}
