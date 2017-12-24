import java.util.Arrays;

public class Utils {
  static int[] createArray(String[] str) {
    int[] array = new int[str.length];
    for (int ind = 0; ind < str.length; ++ind) {
      array[ind] = Integer.parseInt(str[ind]);
    }
  return array;
  }

  static int fibonacciSum(int[] array) {
    int[] fibonacci = new int[16];
    fibonacci[0] = 1;
    fibonacci[1] = 1;
    for (int ind = 2; ind < fibonacci.length; ++ind) {
      fibonacci[ind] = fibonacci[ind - 1] + fibonacci[ind - 2];
    }
    return Arrays.stream(array).map(elem -> ((elem >= 0 && elem < 15) ? fibonacci[elem] : 0)).sum();
  }
}
