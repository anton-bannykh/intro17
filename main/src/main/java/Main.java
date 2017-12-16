public class Main {

  /**
   * Console application method.
   */
  public static void main(String[] args) {
    int[] consoleInput = (new Console()).parse(args);
    if (consoleInput[consoleInput.length - 1] == 1) {
      consoleInput[consoleInput.length - 1] = 0;
      System.out.println(Integer.toString(nekogcd(consoleInput)));
    }
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
   * This method counts arrays gcd. Last item of array equal to 0. It breaks nothing.
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