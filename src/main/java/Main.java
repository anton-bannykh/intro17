import Xpech.intro17.algo.Algo;
import Xpech.intro17.parser.Parser;

public class Main {

  /**
   * Checkstyle wanted to punch me without it.
   * @param args It's integers (maybe).
   */
  public static void main(String[] args) {
    int[] parsedArgs = Parser.parse(args);
    System.out.println(Algo.countZeroes(parsedArgs));
  }


}
