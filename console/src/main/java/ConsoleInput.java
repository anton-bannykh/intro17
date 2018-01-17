import java.util.Arrays;

public class ConsoleInput {
  static int[] createArray(String[] str) {
    int[] array = new int[str.length];
    try {
      for (int ind = 0; ind < str.length; ++ind) {
        array[ind] = Integer.parseInt(str[ind]);
      }
      return array;
    } catch (NumberFormatException exception) {
      throw new CreateArrayException("Incorrect arguments", exception);
    }
  }
}
