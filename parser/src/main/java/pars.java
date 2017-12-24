package Roket132.intro17.parser;

import Roket132.intro17.program.prog;

public class pars {
  /**
   * The function is called if the input data is strings.
   */
  public static String sumOfPower5(String[] args) {
    int[] power = new int[args.length];

    for (int i = 0; i < power.length; i++) {
      try {
        power[i] = Integer.parseInt(args[i]);
      } catch (NumberFormatException error) {
        return "Неверный формат входных данных";
      }
    }
    int result = new prog().sumOfPower5(power);
    return Integer.toString(result);
  }
}
