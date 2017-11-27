public class Main {
  int getMinimum(int[] inputArray) {
    int mininmum = Integer.MAX_VALUE;
    for (int i = 0; i < inputArray.length; i++) {
      mininmum = Math.min(mininmum, inputArray[i]);
    }
    return mininmum;
  }
  
  public static int main(String[] args) {
    return 0;
  }
}
