public class Console {
  public static int[] parse(String[] args) {
    int[] inputArray = new int[args.length + 1];
    inputArray[args.length] = 1;
    for (int i = 0; i < args.length; i++) {
      try {
        inputArray[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        String buf = "Infernal error: wrong input: %s.";
        System.out.println(String.format(buf, error.getMessage()));
        int[] res = {-1};
        inputArray = res;
        break;
      }
    }
    return inputArray;
  }
}