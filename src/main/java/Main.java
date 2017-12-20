public class Main {
  int foo() { 
    return 10;
  }

  static int getMin(int[] array) {
    if (array.length == 0) {
      return Integer.MAX_VALUE;
    } else {
      int value = Integer.MAX_VALUE;
      for (int i = 0; i < array.length; i++) {
        if (array[i] < value) {
          value = array[i];
        }
      }
      return value;
    }
  }

  static String printMinOrError(String[] args) {
    int[] curArray = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        curArray[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException exc) {
        return new String(args[i] + " is not a number");
      }
    }
    return Integer.toString(getMin(curArray));
  }

  public static void main(String[] args) {
    printMinOrError(args);    
  }

}
