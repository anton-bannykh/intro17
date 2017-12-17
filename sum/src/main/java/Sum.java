package ru.nsychev.intro17.sum;

public class Sum {
  /**
    * Calculates sum of given array.
  **/
  public static int sum(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += arr[i];
    }
    return ans;
  }
}

