public class Main { 

  public static void main(String[] args) {
    System.out.println(sumDec(args));
  }

  static String sumDec(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException ex) {
        return ("Bad numbers!");
      }
    }
    int ans = 0;
    for (int i = 0; i < arr.length; i++) { 
      if (i % 2 == 0) { 
        ans += arr[i];
      } else { 
        ans -= arr[i];
      }
    }
    return String.valueOf(ans);
  }
}
