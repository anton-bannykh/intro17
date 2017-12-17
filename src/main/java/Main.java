public class Main {

  /**
  * counts amount of zeroes in a given number.
  * @param number number to count zeroes in
  * @return       amount of zeroes in given number
  */
  public static int countZeroes(int number) {
    if (number == 0) {
      return 1;
    }

    int result = 0;

    while (number > 0) {
      if ((number & 1) == 0) {
        result++;
      }
      number >>= 1;
    }

    return result;
  }

  /**
  * task solution.
  * @param input array of strings
  * @return      total amount of zeroes in numbers in the given array
  */
  public static String countTotalZeroes(String[] input) {
    int[] arr = new int[input.length];

    for (int i = 0; i < input.length; i++) {
      try {
        arr[i] = Integer.parseInt(input[i]);
      } catch (NumberFormatException ex) {
        return ("Error: \"" + input[i] + "\" is not a number");
      }
    }

    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += countZeroes(arr[i]);
    }

    return String.valueOf(total);
  }

  /**
  * program's main class.
  * @param args console string arguments
  */
  public static void main(String[] args) {
    String result = countTotalZeroes(args);
    System.out.println(result);

    return;
  }
}
