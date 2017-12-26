package yz.intro17.yaroslav239;

public class Yaroslav239 {
  /**
   * Returns an Image object that can then be painted on the screen.
  */
  public static int fun(int[] arr) {
    if (arr.length == 0) {
      System.out.println(0);
      System.exit(0);
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      String str = arr[i] + "";
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == '0') {
          sum++;
        }
      }
    }
    return sum;
  }
}
