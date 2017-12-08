package me.BrilZliaN.intro17.algo;

public class Algorithm {
  
  /**
   * A method that returns the sum of numbers of power of 2, 
   * given in the array of ints.
   * @param args An array of integers
   * @return     The sum
   */
  public int sumPowersOf2(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      if (number >= 0 && number < 31) {
        sum += 1 << number;
      }
    }
    return sum;
  }
  
}
