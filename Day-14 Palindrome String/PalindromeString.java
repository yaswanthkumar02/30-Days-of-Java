import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String s = sc.nextLine();

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println(s + " is a Palindrome.");
        } else {
            System.out.println(s + " is not a Palindrome.\n");
        } System.out.println();
        sc.close();
    }
}
