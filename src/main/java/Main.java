public class Main {
  int foo() {
    return 10;
  }
  
  int sum(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += arr[i];
    }
    return ans;
  }
}
