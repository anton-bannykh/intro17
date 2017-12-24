public class Main {
  int foo() {
    return 10;
  }
  
  static int sumOfBits(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += Integer.bitCount(arr[i]);
    }
    return sum;
  }

  static int[] makeIntArray(String[]  args) throws NumberFormatException {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }
    return arr;
  }

  static String makeSumOfBits(String[] args) {
    try {
      int[] arr = makeIntArray(args);
      int ans = sumOfBits(arr);
      return Integer.toString(ans);
    } catch (NumberFormatException exc) {
      return "Can't parse integer";
    }

  }

  public static void main(String[] args) {
    System.out.println(makeSumOfBits(args));
  }

  /**
    *Calculates sum of numbers of 1 bits.
    *Check for errors.
  **/
}
