public class Main {

  /**
   * @param power array of power.
   * @return sum of powers 5.
   */
  public static int sumOfPower5(int[] power) {
    int res = 0;
    for (int digit : power) {
      if (digit >= 0 && digit <= 10) {
        res += pow(5, digit);
      }
    }
    return res;
  }

  // Exponentiation function
  private static int pow(int digit, int exp) {
    int res = 1;
    for (int i = 1; i <= exp; ++i) {
      res = res * digit;
    }
    return res;
  }

}