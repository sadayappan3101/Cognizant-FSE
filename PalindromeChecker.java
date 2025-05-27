import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            boolean isPalindrome = true;
            int length = s.length();
            for (int i = 0; i < length / 2; i++) {
                if (s.charAt(i) != s.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is NOT a palindrome.");
            }
    }
}
