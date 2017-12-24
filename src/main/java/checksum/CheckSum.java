package checksum;

public class CheckSum {
  /**
   * @param mas Array of integers.
   * @return boolean True if sum of integers is even.
   */
  public static boolean foo(int[] mas) {
    int sum = 0;
    for (int cnt = 0; cnt < mas.length; cnt++) {
      sum ^= mas[cnt];
    }
    return ((sum & 1) == 0);
  }
}
