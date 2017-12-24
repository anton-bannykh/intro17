package arimon.intro17.console;

import arimon.intro17.summul.SumMul;

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
        return ("Incorrect input: one of the arguments is not int");
      }
    }
    return SumMul.sumOfMul(arr);
  }
}
