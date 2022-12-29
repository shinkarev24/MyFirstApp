package LR5;
public class Example4 {
    public static void main(String[] args) {
        new Example(12, 'A');
        new Example(65.1267);
    }

    static class Example {
        private final int int1;
        Example(int i, char c) {
            this.int1 = i;
            int length = (int) (Math.log10(int1) + 1);
            double result = (double) c + (double) int1 * 1 / Math.pow(10, length);
            System.out.println("result1 = " + result + "; ch = " + (double) c + "; int = " + length + "\n");
        }
        Example(double d) {
            char ch1 = (char) d;
            int1 = (int) ((d - (int) d) * 100);
            System.out.println("ch = " + ch1 + "; int = " + int1 + "\n");
        }
    }
}
