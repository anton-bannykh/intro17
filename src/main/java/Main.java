public class Main {
  int foo() { 
    return 10;
  }

  static double partSum(double[] ar) {
    double sum = 0;
    for (int i = 0; i < ar.length; i++) {
      sum += 1.0 / ar[i]; 
    }
    return sum;
  }

  static String checkError(String[] ar) {
    double[] curAr = new double[ar.length];
    for (int i = 0; i < ar.length; i++) {
      try {
        curAr[i] = Double.parseDouble(ar[i]);
      } catch (NumberFormatException exc) {
        return new String(ar[i] + " is not a number");
      }
    }
    return Double.toString(partSum(curAr));
  }

  public static void main(String[] ar) {
    System.out.println(checkError(ar));    
  }

}