public class Main {
  int foo() {
    return 10;
  }

  int max(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int ans = arr[0];
    for (int i = 0;i < arr.length; i++) {
      if (ans < arr[i]) {
        ans = arr[i];
      }
    }
    return ans;
  }
}
