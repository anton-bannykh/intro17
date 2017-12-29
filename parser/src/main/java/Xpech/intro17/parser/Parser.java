package Xpech.intro17.parser;

public class Parser {
  /**
   * Parsing an input string to run countZeroes()
   * @param args If it's not integers, then exception caught.
   * @return Output string.
   */
  public static int[] parse(String[] args) {
    int[] parsedArgs = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        parsedArgs[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException ex) {
        System.out.println("Error: it doesn't look like numbers, try something else.");
        return new int[]{};
      }
    }
    return parsedArgs;
  }
}
