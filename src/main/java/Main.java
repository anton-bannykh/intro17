public class Main {
  int foo() {
    return 10;
  }

  static int sumTrailingZeros(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      int num = Integer.numberOfTrailingZeros(arr[i]);
      ans += (num == 32 ? 0 : num);
    }
    return ans;
  }
}
