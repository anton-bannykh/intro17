public class Main {

  /*
  @param number number to count zeroes in
  @return       amount of zeroes in given number
  */
  int countZeroes(int number) {
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

  /*
  @param array array of integers
  @return      total amount of zeroes in numbers in the given array
  */
  int countTotalZeroes(int[] arr) {
    int total = 0;

    for (int i = 0; i < arr.length; i++) {
      total += countZeroes(arr[i]);
    }

    return total;
  }
}
