import java.util.Arrays;

public class Utils {

  static int rangeOr(int[] args) {
    int ans = 0;
    for (int i = 0; i < args.length; i++) {
      ans = ans | args[i];
    }
    return ans;
  }
}
