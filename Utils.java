import java.util.Arrays;

public class Utils {
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

  static int rangeOr(int[] args) {  //битовое ИЛИ всех чисел массива
    int ans = 0;
    for (int i = 0; i < args.length; i++) {
      ans = ans | args[i];
    }
    return ans;
  }
}
