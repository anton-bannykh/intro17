public class Console {
  /**
   * The entery point of the program.
   *
   * @param  args  arguments
   */
  public static void main(String[] args) {
    try {
      int sum = Utils.fibonacciSum(Utils.createArray(args));
      System.out.println(sum);
    } catch (CreateArrayException exception) {
      System.out.println(exception.getMessage());
    }
  }
}
