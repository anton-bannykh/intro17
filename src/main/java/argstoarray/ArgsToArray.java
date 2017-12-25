package argstoarray;

public class ArgsToArray {

  /**
    *Parse string to int.
  **/

  public static int[] makeIntArray(String[]  args) throws NumberFormatException {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }
    return arr;
  }
}
