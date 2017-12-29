public class Console {
  public static void main(String[] args) {
    try {
      int sum = Utils.rangeOr(Utils.createArray(args));
      System.out.println(sum);
    } catch (CreateArrayException exception) {
      System.out.println(exception.getMessage());
    }
  }
}
