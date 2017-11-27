public class Main { 
  int sumDec(int[] arr) { 
    int ans = 0;
    for (int i = 0; i < arr.length; i++) { 
      if (i % 2 == 0) { 
        ans += arr[i];
      } else { 
        ans -= arr[i];
      }
    }
    return ans;
  }
}
