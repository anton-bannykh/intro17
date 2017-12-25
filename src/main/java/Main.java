public class Main {
  int fun (int arr[])
  {
    if (arr.length == 0) {
      System.out.println(0);
      System.exit(0);
    }
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      String a;
      a = arr[i] + "";
      for (int j = 0; j < a.length(); j++) {
          if (a.charAt(j) == '0')
              sum++;
      }


    }


    return sum;
  }

}
