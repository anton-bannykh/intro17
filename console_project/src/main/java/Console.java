import java.util.Arrays;

public class Console {

  static int[] parse(String[] args) {

    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; ++i) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        System.out.println("You wrote not a number!");
        arr = new int[0];
        break;
      }
    }

    return arr;
  }
}
