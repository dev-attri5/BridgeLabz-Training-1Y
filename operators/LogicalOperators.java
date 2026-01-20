public class LogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("(a > b) && (b > 0) : " + ((a > b) && (b > 0))); // true
        System.out.println("(a < b) || (b > 0) : " + ((a < b) || (b > 0))); // true
        System.out.println("!(a > b) : " + (!(a > b))); // false
    }
}
