package Yar.intro17.Console;

import Yar.intro17.Yaroslav239.yaroslav239;

public class console {
  public static void main(String[] in) {
    System.out.println(yaroslav239.fun(strToInt(in)));
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
