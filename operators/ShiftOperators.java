public class ShiftOperators {
    public static void main(String[] args) {

        int a = 8; // 1000

        System.out.println("a << 1 = " + (a << 1));   // 16
        System.out.println("a >> 1 = " + (a >> 1));   // 4

        int b = -8;
        System.out.println("b >>> 1 = " + (b >>> 1)); // unsigned shift
    }
}
