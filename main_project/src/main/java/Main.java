import java.util.Arrays;

public class Main {
  /**
   *Main method what resolve algorithm
   *
   * @author Valery
   *
   * @version 1.0
   */
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println(0);
    } else {
      Console console = new Console();
      int[] arr = console.parse(args);
      System.out.println(median(arr));
    }
  }

  static String median(int[] arr) {

    Arrays.sort(arr);
    int len = arr.length;
    if (len == 0) {
      return "";
    }
    if (len % 2 == 1) {
      return String.valueOf(arr[len / 2]);
    } else {
      if ((arr[len / 2 - 1] + arr[len / 2]) % 2 == 0) {
        return String.valueOf((arr[len / 2 - 1] + arr[len / 2]) / 2);
      } else {
        return String.valueOf((double) (arr[len / 2 - 1] + arr[len / 2]) / 2);
      }
    }
  }
}
