import java.util.Arrays;

public class Utils {
  static int[] createArray(String[] str) {
    int[] array = new int[str.length];
    for (int ind = 0; ind < str.length; ++ind) {
      array[ind] = Integer.parseInt(str[ind]);
    }
    return array;
  }

  static int rangeOr(int[] args) {
    int ans = 0;
    for (int i = 0; i < args.length; i++) {
      ans = ans | args[i];
    }
    return ans;
  }
}
