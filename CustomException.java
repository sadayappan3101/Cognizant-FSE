import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            try {
                if (age < 18) {
                    throw new InvalidAgeException("You must be at least 18 years old.");
                } else {
                    System.out.println("You are eligible.");
                }
            } catch (InvalidAgeException e) {
                System.out.println("Exception: " + e.getMessage());
            }
    }
}
