public class Main {
  int foo() {
    return 10;
  }

  static int sumTrailingZeros(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      int num = Integer.numberOfTrailingZeros(arr[i]);
      ans += (num == 32 ? 0 : num);
    }
    return ans;
  }  

  static String sumOrError(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        nums[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        return String.format("Some elements are not integer");
      }
    }
    return Integer.toString(sumTrailingZeros(nums)); 
  }

  /**
    * Calculates sum of trailing zeros in array and prints it to stdout.
    * Catches NumberFormatException
  **/
  
  public static void main(String[] args) {
    System.out.println(sumOrError(args));
  }
}
