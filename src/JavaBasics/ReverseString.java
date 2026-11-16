package JavaBasics;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Women";

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(str);

        String reverseString = sb.reverse().toString();

        System.out.println("Original String: " + str);
        System.out.println("Reversed using StringBuilder: " + reverseString);

        // Without StringBuilder
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed without StringBuilder: " + reverse);
    }
}
