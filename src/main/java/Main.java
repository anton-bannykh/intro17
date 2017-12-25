import argstoarray.ArgsToArray;
import sumofbits.SumOfBits;

public class Main {
  int foo() {
    return 10;
  }

  /**
    *Calculates sum of numbers of 1 bits.
    *Check for errors.
  **/
  
  public static String makeSumOfBits(String[] args) {
    try {
      int[] arr = ArgsToArray.makeIntArray(args);
      int ans = SumOfBits.makeSumOfBits(arr);
      return Integer.toString(ans);
    } catch (NumberFormatException exc) {
      return "Can't parse integer";
    }
  }

  public static void main(String[] args) {
    System.out.println(makeSumOfBits(args));
  }

}
