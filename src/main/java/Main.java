import java.lang.Math;

public class Main {
  int foo() {
    return 10;
  }

  int max(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int ans = arr[0];
    for (int v : arr) {
      ans = Math.max(ans, v);
    }
    return ans;
  }
}
