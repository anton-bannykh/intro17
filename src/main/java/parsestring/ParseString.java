package parsestring;

public class ParseString {
  /**
  * @param nums Array of integers.
  * @param args Array of arguments from command line.
  */
  public static boolean getNums(int[] nums, String[] args) {
    for (int i = 0; i < args.length; ++i) {
      try {
        nums[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        return false;
      }
    }
    return true;
  }
}