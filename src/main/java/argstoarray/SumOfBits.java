package sumofbits;

public class SumOfBits {
  /**
    *find sum of 1-bits.
  **/

  public static int makeSumOfBits(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += Integer.bitCount(arr[i]);
    }
    return sum;
  }
}
