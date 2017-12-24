public class Main {
    public static void main(String[] args) {
        System.out.println(consoleOr(args));
    }
    public static String consoleOr(String[] args) {
        int[] input = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                input[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException error) {
                return String.format("Infernal error: string %d not a number", i);
            }
        }
        return Integer.toString(rangeOr(input));
    }
    public static int rangeOr(int[] arg) {
        int ans = 0;
        for (int i = 0; i < arg.length; i++) {
            ans = (ans | arg[i]);
        }
        return ans;
    }
}
