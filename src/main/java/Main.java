import java.math.BigInteger;

public class Main {
  int countZeroes(int[] arr) {

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
