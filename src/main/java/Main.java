public class Main {

  int foo() {
    return 10;
  }
  
  int sumPowersOf2(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      if (number >= 0 && number < 31) {
        sum += 1 << number;
      }
    }
    return sum;
  }
  
}
