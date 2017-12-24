import argstoarray.ArgsToArray;
import checksum.CheckSum;

public class Main {
  /**
   * @param args Array of strings given from console.
   */
  public static void main(String[] args) {
    int[] mas = new int[args.length];
    if (ArgsToArray.get_args(mas, args) == false) {
      System.out.println("Wrong input data!");
    } else if (CheckSum.foo(mas)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
