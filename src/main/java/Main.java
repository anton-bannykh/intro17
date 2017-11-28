public class Main {
<<<<<<< HEAD

  public static void main(String[] args) {
    System.out.println(median(args));
  }

  static String median(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; ++i) {
      try {
        arr[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        return ("You wrote not a number!");
      }
    }

    Arrays.sort(arr);
    int len = arr.length;
    if (len == 0) {
      return String.valueOf(0);
    }
    if (len % 2 == 1) {
      return String.valueOf(arr[len / 2]);
    } else {
      if ((arr[len / 2 - 1] + arr[len / 2]) % 2 == 0) {
        return String.valueOf((arr[len / 2 - 1] + arr[len / 2]) / 2);
      } else {
        return String.valueOf((double) (arr[len / 2 - 1] + arr[len / 2]) / 2);
      }
    }
=======
  int foo() {
    return 10;
>>>>>>> parent of d398f61... Resolved algorithm
  }
}
