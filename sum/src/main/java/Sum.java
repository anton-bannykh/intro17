package sum;

public class Sum {

  /**
    * Calculates sum of highest bits of integer array.
  **/
  public static int sumHighestBits(int[] arr) throws NumberFormatException {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        throw new NumberFormatException();
      } else {
        ans += Integer.highestOneBit(arr[i]);
      }
    }
    return ans;
  }

  /**
    * Function for chechking.
  **/
  public static String test(int[] arr) {
    try {
      sumHighestBits(arr);
    } catch (NumberFormatException exc) {
      return "Elements of array mustn't be negative.";
    }
    return "OK";
  }
}