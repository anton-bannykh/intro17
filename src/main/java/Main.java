public class Main {
  /**
   * @param mas Array of integers.
   * @param args Array of arguments from command line.
   */
  public static boolean get_args(int[] mas, String[] args) {
    for (int i = 0; i < args.length; i++) {
      try {
        mas[i] = Integer.parseInt(args[i]);
      } catch (Exception exception) {
        return false;
      }
    }
    return true;
  }

  /**
   * @param args Array of strings given from console.
   */
  public static void main(String[] args) {
    int[] mas = new int[args.length];
    if (get_args(mas, args) == false) {
      System.out.println("Wrong input data!");
    } else if (foo(mas)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

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
