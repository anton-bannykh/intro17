public class Main {

  static int sumLowestBits(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += Integer.lowestOneBit(arr[i]);
    }
    return ans;
  }

  static String getSumOrError(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; ++i) {
      try {
        nums[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        return String.format("Your array is incorrect");
      }
    }
    return Integer.toString(sumLowestBits(nums));
  }

  public static void main(String[] args) {
    System.out.println(getSumOrError(args));
  }
}
