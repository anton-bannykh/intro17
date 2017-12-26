package yz.intro17.console;

import static yz.intro17.yaroslav239.Yaroslav239.fun;

public class Console {
  public static void main(String[] in) {
    System.out.println(fun(strToInt(in)));
  }

  static int[] strToInt(String[] arr) {
    int[] ans = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      try {
        ans[i] = Integer.parseInt(arr[i]);
      } catch (NumberFormatException err) {
        System.out.println("Error");
        System.exit(0);
      }
    }
    return ans;
  }
}
