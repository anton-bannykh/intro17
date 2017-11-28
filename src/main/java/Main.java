public class Main {
<<<<<<< HEAD
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

=======
  double median(int[] arr) {
>>>>>>> parent of be61d31... Task 3
    Arrays.sort(arr);
    int len = arr.length;
    if (len == 0) {
      return 0;
    }
    if (len % 2 == 1) {
      return arr[len / 2];
    } else {
      return ((double) (arr[len / 2 - 1] + arr[len / 2]) / 2);
    }
=======
  int foo() {
    return 10;
>>>>>>> parent of d398f61... Resolved algorithm
  }
}
