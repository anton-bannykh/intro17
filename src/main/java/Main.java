import argstoarray.ArgsToArray;
import partsum.PartSum;

public class Main {
  /**
   *main func.
  **/
  public static void main(String[] args) {
    double[] mas = new double[args.length];
    if (ArgsToArray.get_args(mas, args) == false) {
      System.out.println("Wrong input data!");
    } else { 
      System.out.println(PartSum.part(mas));
    }
  }
}