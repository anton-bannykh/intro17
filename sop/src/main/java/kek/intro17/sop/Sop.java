package kek.intro17.sop;

public class Sop {
  /**
   *  Method returns sum of powers of 3.
   */
  public static int sumOfPows(int[] args) {
    int sum = 0;
    for (int a:args) {
      if (a >= 0 && a <= 15) {
        sum += Math.pow(3,a);
      }
    }
    return sum;
  }
}
