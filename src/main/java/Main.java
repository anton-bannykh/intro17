public class Main {
  int foo() {
    return 10;
  }
  int SumOfPowers(int[] args){
    int sum=0;
    for (int a:args){
      if (a>=0&&a<=15) {
        sum += Math.pow(3,a);
      }
    }
    return sum;
  }
}
