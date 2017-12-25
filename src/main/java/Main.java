import argstoarray.ArgsToArray;
import partsum.PartSum;

public class Main {
  /**
   *main func.
  **/
  public static void main(String[] args) {
    double[] mas = ArgsToArray.get(args);
    if (mas == null) {
      System.out.println("Wrong input data!");
      return;
    }
    double ans = PartSum.part(mas);
    System.out.println(Double.toString(ans));
  }
}