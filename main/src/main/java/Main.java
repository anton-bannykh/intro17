package fr0streaper.intro17.main;

import fr0streaper.intro17.countzeroes.CountZeroes;

public class Main {

  /**
   * parses input and returns a total number of zeroes in it if it is correct
   * @param input array of strings
   * @return error or result of calculations
   */
  public static String getResult(String[] input) {
    int[] arr = new int[input.length];

    for (int i = 0; i < input.length; i++) {
      try {
        arr[i] = Integer.parseInt(input[i]);
      } catch (NumberFormatException ex) {
        return ("Error: \"" + input[i] + "\" is not a number");
      }
    }

    return String.valueOf(CountZeroes.countTotalZeroes(arr));
  }

  /**
  * program's main class.
  * @param args console string arguments
  */
  public static void main(String[] args) {
    String result = countZeroes.countTotalZeroes(args);
    System.out.println(result);

    return;
  }
}
