import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            int n = (int)(Math.random() * 100) + 1;
            int guess;
            System.out.println("Guess the number between 1 and 100!");
            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                
                if (guess > n) {
                    System.out.println("Too high! Try again.");
                } else if (guess < n) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            } while (guess != n);
    }
}
