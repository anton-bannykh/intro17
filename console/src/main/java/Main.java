package spolutrean.intro17.console;

import spolutrean.intro17.sum.Sum;

public class Main {
  
  public static void main(String[] args) {
    System.out.println(check(args));
  }
  
  static String check(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException ex) {
        return ("Incorrect input!");
      }
    }
    return Sum.sumOf(arr);
  }
}
