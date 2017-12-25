public class Main {

    public static void main(String[] in) {
        System.out.println(sumDec(in));
    }

    static String sumDec(String[] in) {
        int[] arr = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            try {
                arr[i] = Integer.parseInt(in[i]);
            } catch (NumberFormatException ex) {
                return ("Bad numbers!");
            }
        }
        return "";
    }
  int fun(int[] arr) {
    if (arr.length == 0) {
      System.out.println(0);
      System.exit(0);
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      String str = arr[i] + "";
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == '0') {
          sum++;
        }
      }
    }
    return sum;
  }

}
