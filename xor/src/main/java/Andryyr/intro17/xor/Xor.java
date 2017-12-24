package Andryyr.intro17.xor;

public class Xor {
    /**
     *
     * @param arr array of numbers.
     * @return xor of numbers.
     */
    public static int xor(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
}
