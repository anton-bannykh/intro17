package parser;

public class Parser {

  /**
    * Tries to parse array of string to integer array.
  **/
  public static int[] makeIntArr(String[] args) throws NumberFormatException {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }
    return arr;
  }

  /**
    * Function for che  chking.
  **/
  public static String test(String[] args) {
    try {
      makeIntArr(args);
    } catch (NumberFormatException exc) {
      return "Can't parse integer.";
    }
    return "OK";
  }
}