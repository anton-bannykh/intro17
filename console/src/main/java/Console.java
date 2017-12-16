public class Console {

  /**
   * Makes int array from string array. Looks for errors.
   */
  public static int[] parse(String[] args) {
    int[] inputArray = new int[args.length + 1];
    inputArray[args.length] = 1;
    for (int i = 0; i < args.length; i++) {
      try {
        inputArray[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        String buf = "Infernal error: wrong input: %s. Ochen zhal.";
        System.out.println(String.format(buf, error.getMessage()));
        int[] res = {-1};
        inputArray = res;
        break;
      }
    }
    return inputArray;
  }
}