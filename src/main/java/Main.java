import java.util.Scanner;

public class Main {
  /**
   * @param args Array of strings given from console
   */
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int len = scn.nextInt();
    int[] mas = new int[len];
    for (int i = 0; i < len; i++) {
      mas[i] = scn.nextInt();
    }
    if (foo(mas)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  /**
   * @param mas Array of integers
   * @return boolean True if sum of integers is even
   */
  public static boolean foo(int[] mas) {
    int sum = 0;
    for (int cnt = 0; cnt < mas.length; cnt++) {
      sum ^= mas[cnt];
    }
    return ((sum & 1) == 0);
  }
}
