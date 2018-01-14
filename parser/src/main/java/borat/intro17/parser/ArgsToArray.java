package borat.intro17.parser;

public class ArgsToArray {
  /**
   *convert.
  **/
  public static double[] get(String[] args) {
    double[] mas = new double[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        mas[i] = Double.parseDouble(args[i]);
      } catch (NumberFormatException ex) {
          System.out.println("Wrong input data");
          return new double[]{};
      }
    }
    return mas;
  }
}
