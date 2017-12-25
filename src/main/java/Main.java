import java.math.BigInteger;

public class Main {

  /**
   * Checkstyle wanted to punch me without it.
   * @param args It's integers (maybe).
   */
  public static void main(String[] args) {
    System.out.println(getAnswer(args));
  }

  /**
   * Parsing an input string to run countZeroes()
   * @param args If it's not integers, then exception caught.
   * @return Output string.
   */
  public static String getAnswer(String[] args) {
    int[] parsedArgs = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        parsedArgs[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException ex) {
        return "Error: it doesn't look like numbers, try something else.";
      }
    }
    return Integer.toString(countZeroes(parsedArgs));
  }

  /**
   * Main algo method: counting zeroes in an product of array's numbers.
   * @param arr Parsed int[].
   * @return Number of zeroes in product of these numbers.
   */
  private static int countZeroes(int[] arr) {

    if (arr.length == 0) {
      return 0;
    }

    BigInteger result = BigInteger.ONE;
    BigInteger buffer;
    for (int i : arr) {
      buffer = BigInteger.valueOf(i);
      result = result.multiply(buffer);
    }

    int answer = 0;

    BigInteger ten = BigInteger.valueOf(10);
    for (;!result.equals(BigInteger.ZERO);result = result.divide(ten)) {
      if (result.mod(ten).equals(BigInteger.ZERO)) {
        answer++;
      }
    }

    return answer;

  }
}
