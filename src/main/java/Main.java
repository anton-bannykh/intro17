import argtoar.ArgToAr;
import getmin.GetMin;

public class Main {
  /**
  *why do u need these docs?.
  **/
  public static void main(String[] args) {
    int[] curArray = ArgToAr.get(args);
    if (curArray == null) {
      System.out.println("Wrong data");
      return;
    }
    int answer = GetMin.getMin(curArray);
    System.out.println(Integer.toString(answer));
  }

}
