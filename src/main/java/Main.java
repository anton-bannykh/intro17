public class Main {

  public static void ssum(String[] arr) { // sum of numbers in index pow
    System.out.println(new Main().calc(new Main().parse(arr)));
  }

  int[] parse(String[] arr) {
    int[] numArr = new int [arr.length];
    for (int i = 0; i <= arr.length; i++) {
      try {
        numArr[i] = Integer.parseInt(arr[i]);
      } catch (NumberFormatException nfe) {
        System.out.println("Format isn't correct: \"" + arr[i] + "\" must be integer");
        System.exit(0);
      }
    }
    return numArr;
  }
  
  int calc(int[] arr) {
    int ans = 0;
    for (int i = 1; i <= arr.length; i++) {
      double pp = Math.pow((double)(arr[i - 1]),(double)i);
      ans += (int)pp;
    }
    return ans;
  }
}