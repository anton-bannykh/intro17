package argstoarray;

public class ArgsToArray {
  /**
   * @param mas Array of integers.
   * @param args Array of arguments from command line.
   */
  public static boolean get_args(int[] mas, String[] args) {
    for (int i = 0; i < args.length; i++) {
      try {
        mas[i] = Integer.parseInt(args[i]);
      } catch (Exception exception) {
        return false;
      }
    }
    return true;
  }
}
