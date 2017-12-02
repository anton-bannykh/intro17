public class Main {

  /**
   * Simple realisation of euclids GCD.
   */
  private int gcd(int arg1, int arg2) {
    if (arg2 == 0) {
      return arg1;
    } else {
      return gcd(arg2, arg1 % arg2);
    }
  }

  /**
   * This method counts arrays gcd.
   */
  public int nekogcd(int[] arg) {
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