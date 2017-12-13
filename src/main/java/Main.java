public class Main {
  
  public static void main(String[] args) {
    System.out.println(sumOfMul(args));
  }
  
  static String sumOfMul(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException ex) {
        return ("Incorrect input: one of the arguments is not int");
      }
    }
    int ans = 0;
    for (int i = 1; i < arr.length; i += 2) {
      ans += arr[i] * arr[i - 1];
    }
    if (arr.length % 2 == 1) {
      ans += arr[arr.length - 1];
    }
    return Integer.toString(ans);
  }
}
