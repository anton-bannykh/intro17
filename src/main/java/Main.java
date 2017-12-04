import java.util.Scanner;

public class Main {
  /**
   * @param args
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
   *
   * @param mas
   * @return boolean
   */
  public static boolean foo(int[] mas) {
    int sum = 0;
    for (int cnt = 0; cnt < mas.length; cnt++) {
      sum ^= mas[cnt];
    }
    return ((sum & 1) == 0);
  }
}
