import java.util.Arrays;

public class Main {
  double median(int[] arr) {
    Arrays.sort(arr);
    int len = arr.length;
    if (len == 0) {
      return 0;
    }
    if (len % 2 == 1) {
      return arr[len / 2];
    } else {
      return ((double) (arr[len / 2 - 1] + arr[len / 2]) / 2);
    }
  }
}
