import argstoarray.ArgsToArray;
import partsum.PartSum;

public class Main {
  /**
   *main func.
  **/
  public static String doit(String[] args) {
    double[] mas = new double[args.length];
    if (ArgsToArray.get_args(mas, args) == false) {
      return "Wrong input data!";
    }
    double ans = PartSum.part(mas);
    return Double.toString(ans);
  }
}