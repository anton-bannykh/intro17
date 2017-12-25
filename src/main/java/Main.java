import parser.Parser;
import sum.Sum;

public class Main {
  /**
    * Calculates sum of highest bits of given array.
    * Checks for errors.
  **/
  public static void main(String[] args) {
    int[] arr = Parser.makeIntArr(args);
    if (arr == null) {
      System.out.println("Can't parse integer");
      return;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        System.out.println("Elements of array mustn't be negative.");
        return;
      }
    }
    int ans = Sum.sumHighestBits(arr);
    System.out.println(Integer.toString(ans));
  }
}
