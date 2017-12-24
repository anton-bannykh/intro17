public class Main {
  /**
   * The entery point of the program.
   *
   * @param  args  arguments
   */
  public static void main(String[] args) {
    int sum = Utils.fibonacciSum(Utils.createArray(args));
    System.out.println(sum);
  }
}
