package me.BrilZliaN.intro17.util;

import me.BrilZliaN.intro17.algo.Algorithm;

public class CommandLineHandler {
  
  /**
   * A method that returns the sum of numbers of power of 2, 
   * given in the array of strings.
   * @param args An array of strings containing a number
   * @return     The sum
   */
  public String sumPowersOf2(String[] args) {
    //converting strings to integer
    int[] numbers = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      String current = args[i];
      try {
        numbers[i] = Integer.parseInt(current);
      } catch (NumberFormatException nfe) {
        return "Wrong input format: \"" + args[i] + "\" is not an integer!";
      }
    }
    //getting the answer
    int answer = new Algorithm().sumPowersOf2(numbers);
    return String.valueOf(answer);
  }
  
}
