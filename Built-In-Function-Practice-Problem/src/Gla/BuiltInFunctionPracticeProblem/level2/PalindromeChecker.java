package Gla.BuiltInFunctionPracticeProblem.level2;

import java.util.*;

public class PalindromeChecker {
    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
    }
}
