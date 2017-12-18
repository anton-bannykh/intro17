public class Main {
  double chainFrac(int[] arr) {
    if (arr.length == 0) {
      System.out.println("Dude, you need numbers");
      System.exit(0);
    }
    double denom = arr[arr.length - 1];
    int cur = arr.length - 2;
    while (cur >= 0) {
      if (denom == 0) {
        System.out.print("We have a zero in denominator, wrong sequence, it happened at ");
        System.out.println(cur + 1 + " position, or at least nearby");
        System.exit(0);
      }
      denom = arr[cur] + 1 / denom;
      cur--;
    }
    return denom;
  }
}
