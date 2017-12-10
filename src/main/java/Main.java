public class Main {
  int foo() {
    return 10;
  }

  static int sumHighestBits(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += Integer.highestOneBit(arr[i]);
    }
    return ans;
  }

  static int[] makeIntArr(String[] args) throws NumberFormatException {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }
    return arr;
  }

  static String getSumHighestBits(String[] args) {
    try {
      int[] arr = makeIntArr(args);
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
          return "Elements of array mustn't be negative.";
        }
      }
      int ans = sumHighestBits(arr);
      return Integer.toString(ans);
    } catch (NumberFormatException exc) {
      return "Can't parse integer.";
    }
  }
  
  /**
    * Calculates sum of highest bits of given array.
    * Checks for errors.  
  **/

  public static void main(String[] args) {
    System.out.println(getSumHighestBits(args));
  }
}
