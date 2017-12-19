public class Main {
  int foo() {
    return 10;
  }
  static int sumOfBits(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += Integer.bitCount(arr[i]);
    }
    return sum;
  }
  /**
    *Calculates sum of numbers of 1 bits.
  **/
}