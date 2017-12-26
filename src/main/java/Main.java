public class Main {
  
  static String getSum(int[] arr) {
    if (arr.length == 0) {
      return "Imput is empty";
    } else {
      int ans = 0;
      for (int i = 0; i < arr.length; i++) {
        ans += arr[i];
      }
      return Integer.toString(ans);
    }
  }

  static String getArgs(String[] args) {
    int[] ourArgs = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        ourArgs[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        return new String(args[i] + " is not a number");
      }
    }
    return getSum(ourArgs);
  }
  
  /**
    *calculates sum of given array.
    *checks for incorrect imput.
  **/


  public static void main(String[] args) {
    System.out.println(getArgs(args));    
  }

}
