package argtoar;

public class ArgToAr {
  /**
  *why do u need these docs?.
  **/
  public static int[] get(String[] args) {
    int[] curArray = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      try {
        curArray[i] = Integer.parseInt(args[i]);
      } catch (Exception exc) {
        return null;
      }
    }
    return curArray;
  }
}