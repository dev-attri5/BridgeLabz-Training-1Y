public class BitwiseOperators {
    public static void main(String[] args) {

        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println("a & b = " + (a & b)); // 1
        System.out.println("a | b = " + (a | b)); // 7
        System.out.println("a ^ b = " + (a ^ b)); // 6
        System.out.println("~a = " + (~a));       // -6
    }
}
