import getsumbits.GetSumBits;
import parsestring.ParseString;

public class Main {
  /**
  * @param args Array of strings given from console.
  */
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    if (ParseString.getNums(nums, args) == false) {
      System.out.println("Your array is incorrect");
    } else {
      System.out.println(GetSumBits.sumLowestBits(nums));
    }
  }
}
