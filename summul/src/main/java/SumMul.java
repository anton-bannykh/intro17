package arimon.intro17.summul;

public class SumMul {
  /**
    * Calculate sum of multed pairs.
  **/
  public static String sumOfMul(int[] arr) {
    int ans = 0;
    for (int i = 1; i < arr.length; i += 2) {
      ans += arr[i] * arr[i - 1];
    }
    if (arr.length % 2 == 1) {
      ans += arr[arr.length - 1];
    }
    return Integer.toString(ans);
  }
}
