package argstoarray;

public class ArgsToArray {
  /**
   *convert.
  **/
  public static double[] get(String[] args) {
    double[] mas = new double[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        mas[i] = Double.parseDouble(args[i]);
      } catch (Exception exception) {
        return null;
      }
    }
    return mas;
  }
}