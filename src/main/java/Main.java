import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    System.out.println(max(args));
  }

  static int max(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int ans = arr[0];
    for (int v : arr) {
      ans = Math.max(ans, v);
    }
    return ans;
  }

  static String max(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < arr.length ; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException er) {
        return "Oops";
      }
    }
    return Integer.toString(max(arr));
  }
}
