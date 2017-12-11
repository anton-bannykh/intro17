public class Main {
  int foo() {
    return 10;
  }

  static int sumHighestBits(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += Integer.highestOneBit(arr[i]);
    }
    return ans;
  }
  
  /**
    * Calculates sum of highest bits of given array. 
  **/
}
