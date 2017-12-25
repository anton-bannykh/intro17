package spolutrean.intro17.sum;

public class Sum {
  /**
   *Add even position with plus
   *and odd position with minus.
  **/
  public static String sumOf(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) { 
        ans += arr[i];
      } else { 
        ans -= arr[i];
      }
    }
    return Integer.toString(ans);
  }
}
