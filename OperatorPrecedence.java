public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2 = " + a); // Parentheses first: 10 + 5 = 15; then 15 * 2 = 30
        int b = 20 - 6 + 2 * 3;
        System.out.println("Result of 20 - 5 + 2 * 3 = " + b); // 2 * 3 = 6; then 20 - 6 = 14; then 14 + 6 = 20
        int c= 15 / 3 + 5 % 2;
        System.out.println("Result of 18 / 3 + 5 % 2 = " + c); // 15 / 3 = 5; 5 % 2 = 1; then 5 + 1 = 6
    }
}