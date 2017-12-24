public class Main {
  int foo() { 
    return 10;
  }

  double partSum(double[] ar) {
    double sum = 0;
    for (int i = 0; i < ar.length; i++) {
      sum += 1.0 / ar[i]; 
    }
    return sum;
  }

}