public class Main {
  
  /**
   * Program entry point.
   * @param args Array of strings containing numbers
   */
  public static void main(String[] args) {
    Main that = new Main();
    
    System.out.println(that.sumPowersOf2(args));
  }

  int foo() {
    return 10;
  }
  
  int sumPowersOf2(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      if (number >= 0 && number < 31) {
        sum += 1 << number;
      }
    }
    return sum;
  }
  
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
    int answer = this.sumPowersOf2(numbers);
    return String.valueOf(answer);
  }
  
}
