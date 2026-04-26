public class Problem08ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String input = "This   is   an   example   with   multiple   spaces.";
        String output = input.replaceAll("\\s+", " ");

        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
