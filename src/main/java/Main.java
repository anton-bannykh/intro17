public class Main {
  public static int rangeOr(int[] arg) {
    int ans;
    ans = 0;
    for (int i = 0; i < arg.length; i++) {
       ans = (ans | arg[i]);
    }
    return ans;
  }
}
