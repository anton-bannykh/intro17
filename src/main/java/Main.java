public class Main {
  int foo() {
    return 10;
  }
  
  static int sum(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += arr[i];
    }
    return ans;
  }

  static String getSumOrError(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        nums[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        return String.format("Cannot parse integer at position %d", i);
      }
    }
    return Integer.toString(sum(nums));
  }

  /**
   * Calculates sum of given array and prints it to stdout.
   *
   * @param args Numbers to sum
  **/
  public static void main(String[] args) {
    System.out.println(getSumOrError(args));
  }
}
