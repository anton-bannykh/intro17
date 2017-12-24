package Andryyr.intro17.parser;

import Andryyr.intro17.xor.Xor;

public class Parser {
    /**
     *
     * @param args array from input.
     * @return result of programm.
     */
    public static String parse(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException error) {
                return "Incorrect input data";
            }
        }
        return Integer.toString(new Xor().xor(numbers));
    }

}
