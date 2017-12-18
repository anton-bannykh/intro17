public class Main {
  public static void main(String[] args) {
    System.out.println(chainFrac(transStringToInt(args)));
  }

  static int[] transStringToInt(String[] arr) {
    int[] ans = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      try {
        ans[i] = Integer.parseInt(arr[i]);
      } catch (NumberFormatException err) {
        System.out.println("dude, you sucked at input at " + (i + 1) + " position");
        System.exit(0);
      }
    }
    return ans;
  }

  static double chainFrac(int[] arr) {
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
