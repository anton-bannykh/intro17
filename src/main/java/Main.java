public class Main {
  int foo() { 
    return 10;
  }

  int getMin(int[] array) {
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

}
