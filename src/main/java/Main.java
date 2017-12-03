public class Main {
  public static void main(String[] args) {
    //System.out.println(sum_of_power5());
  }

  public static int sum_of_power5(int[] power){
    final int FIVE = 5;
    int res = 0;
    for(int digit : power){
      if(digit >= 0 && digit <= 10){
        res += pow(FIVE, digit);
      }
    }
    return res;
  }

  private static int pow(int a, int b){
    int res = 1;
    for(int i = 1; i <= b; ++i){
      res = res * a;
    }
    return res;
  }

}
