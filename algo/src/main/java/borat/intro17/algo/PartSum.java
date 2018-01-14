package borat.intro17.algo;

public class PartSum {
  /**
   *process.
  **/
  public static double part(double[] ar) {
    double sum = 0;
    for (int i = 0; i < ar.length; i++) {
      sum += 1.0 / ar[i]; 
    }
    return sum;
  }
}
