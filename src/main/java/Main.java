public class Main {
  int foo() {
    return 10;
  }

  int sumOfMul(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i += 2) {
      ans = arr[i] * arr[i + 1];
    }
    if (arr.length % 2 == 1) {
      ans = arr[arr.length - 1];
    }
    return ans;
  }
}
