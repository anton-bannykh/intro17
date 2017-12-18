public class Main {

  public static void main(String[] args) {
    System.out.println(parse(args));
  }

  /**
   *
   * @param args array from input.
   * @return result of programm.
   */
  public static String parse(String[] args) {
    int[] numbers = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        numbers[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        return "Incorrect input data";
      }
    }
    return Integer.toString(xor(numbers));
  }

  /**
   *
   * @param arr array of numbers.
   * @return xor of numbers.
   */
  public static int xor(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans ^= arr[i];
    }
    return ans;
  }
}
