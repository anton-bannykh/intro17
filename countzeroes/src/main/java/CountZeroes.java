package frostreaper.intro17.countzeroes;

public class CountZeroes {

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
   * @param arr array of integers
   * @return      total amount of zeroes in numbers in the given array
   */
  public static int countTotalZeroes(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += countZeroes(arr[i]);
    }

    return total;
  }

}
