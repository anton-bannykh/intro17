public class Main {

  public static void main(String[] args) {
    System.out.println(sumOfPows(args));
  }

  // Method retruns sum of powers of 3
  static int sumOfPows(int[] args) {
    int sum = 0;
    for (int a:args) {
      if (a >= 0 && a <= 15) {
        sum += Math.pow(3,a);
      }
    }
    return sum;
  }

  /**
   * Method returns sum of powers of 3 if string is correct array
   * or "Zachem?" otherwise.
  */
  static String sumOfPows(String[] args) {
    int[] arr = new int[args.length];

    for (int i = 0;i < arr.length; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        return "Zachem?";
      }
    }

    return Integer.toString(sumOfPows(arr));
  }
}
