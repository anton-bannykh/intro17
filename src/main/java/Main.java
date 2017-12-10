public class Main {
  public static void main(String[] args) {
    System.out.println(sumOfPower5(args));
  }

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

  /**
   * The function is called if the input data is strings.
   */
  public static String sumOfPower5(String[] args) {
    int[] power = new int[args.length];

    for (int i = 0; i < power.length; i++) {
      try {
        power[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        return "Неверный формат входных данных";
      }
    }
    return Integer.toString(sumOfPower5(power));
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