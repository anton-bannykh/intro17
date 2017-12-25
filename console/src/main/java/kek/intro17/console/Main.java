package kek.intro17.console;

import kek.intro17.sop.Sop;

public class Main {

  public static void main(String[] args) {
    System.out.println(parse(args));
  }

  /**
   * Method returns sum of powers of 3 if string is correct array
   * or "Zachem?" otherwise.
   */
  static String parse(String[] args) {
    int[] arr = new int[args.length];

    for (int i = 0;i < arr.length; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        return "Zachem?";
      }
    }

    return Integer.toString(Sop.sumOfPows(arr));
  }
}