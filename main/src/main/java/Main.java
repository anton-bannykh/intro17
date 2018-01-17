import main.java.Utils;
import console.java.ConsoleInput;

public class Main {
  public static void main(String[] args) {
    int sum = Utils.rangeOr(ConsoleInput.createArray(args));
    System.out.println(sum);
  }
}
