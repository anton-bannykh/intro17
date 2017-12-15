public class Main {
  static int[] parseArgs(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        nums[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        System.out.println(String.format("Cannot parse integer at position %d", i));
        return new int[0];
      }
    }
    return nums;
  }

  /**
   * Calculates sum of given array and prints it to stdout.
   *
   * @param args Numbers to sum
  **/
  public static void main(String[] args) {
    int[] nums = parseArgs(args);
    if (args.length > 0 && nums.length == 0) {
      return;
    }
    Sum sum = new Sum();
    System.out.println(sum.sum(nums));
  }
}
