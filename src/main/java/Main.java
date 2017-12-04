public class Main {

  public static void main(String[] args) {
    System.out.println(nekoConsoleGcd(args));
  }

  /**
   * Makes int array from string array. Looks for errors. Makes output string.
   */
  public static String nekoConsoleGcd(String[] args) {
    int[] inputArray = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        inputArray[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        return String.format("Infernal error: wrong input: %s. Ochen zhal.", error.getMessage());
      }
    }
    return Integer.toString(nekogcd(inputArray));
  }

  /**
   * Simple implementation of euclids GCD.
   */
  private static int gcd(int arg1, int arg2) {
    if (arg2 == 0) {
      return arg1;
    } else {
      return gcd(arg2, arg1 % arg2);
    }
  }

  /**
   * This method counts arrays gcd.
   */
  public static int nekogcd(int[] arg) {
    int res = 0;
    for (int i = 0; i < arg.length; i++) {
      res = gcd(res, Math.abs(arg[i]));
    }
    if (res == 0) {
      return Integer.MAX_VALUE;
    }
    return res;
  }
}