import main.java.Utils;

public class Main {
  public static void main(String[] args) {
    int sum = Utils.rangeOr(Utils.createArray(args));
    System.out.println(sum);
  }
}
