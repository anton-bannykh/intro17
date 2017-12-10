public class Main {
  int ssum(int[] arr) { // sum of numbers in index pow
    int ans = 0;
    for (int i = 1; i <= arr.length; i++) {
      double pp = Math.pow((double)(arr[i - 1]),(double)i);
      ans += (int)pp;
    }
    return ans;
  }
}