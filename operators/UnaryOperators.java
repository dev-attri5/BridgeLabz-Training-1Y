public class UnaryOperators {
    public static void main(String[] args) {

        int a = 5;

        System.out.println("a = " + a);

        System.out.println("Post Increment a++ = " + (a++)); // 5 then a=6
        System.out.println("After post increment a = " + a); // 6

        System.out.println("Pre Increment ++a = " + (++a));  // 7

        System.out.println("Post Decrement a-- = " + (a--)); // 7 then a=6
        System.out.println("After post decrement a = " + a); // 6

        System.out.println("Pre Decrement --a = " + (--a));  // 5

        boolean isJavaEasy = true;
        System.out.println("Logical NOT (!true) = " + (!isJavaEasy)); // false
    }
}
