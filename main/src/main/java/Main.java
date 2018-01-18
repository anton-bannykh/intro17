public class Main {
  public static void main(String[] args) {
    int[] consoleInput = (new Console()).parse(args);
    if (consoleInput[consoleInput.length - 1] == 1) {
      consoleInput[consoleInput.length - 1] = 0;
      System.out.println(Integer.toString(rangeOr(consoleInput)));
    }
  }
  static int rangeOr(int[] args) {
    int ans = 0;
    for (int i = 0; i < args.length; i++) {
      ans = ans | args[i];
    }
    return ans;
  }
}