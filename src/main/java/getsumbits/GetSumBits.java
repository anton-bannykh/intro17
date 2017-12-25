package getsumbits;

public class GetSumBits {
  /**
  * @param arr Array of integers.
  * @return int Sum of lowest bits of numbers..
  */
  public static int sumLowestBits(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += Integer.lowestOneBit(arr[i]);
    }
    return ans;
  }
}