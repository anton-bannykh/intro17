public class Main {
    public static void Main(String[] args) {
    System.out.println(foo(args));
    }
    static String foo(String[] ms) {
        try {
            int sum = 0;
            for (int i = 0; i < ms.length; i++) {
                sum += Integer.parseInt(ms[i]);
            }
            return Integer.toString(sum);
        }
        catch (NumberFormatException ex) {
            return "Input isn't correct...";
        }
    }
}