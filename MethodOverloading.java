public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int s1 = add(2, 3);
        double s2 = add(3.1, 8.5);
        int s3 = add(1, 2, 3);
        System.out.println("Sum of two integers: " + s1);
        System.out.println("Sum of two doubles: " + s2);
        System.out.println("Sum of three integers: " + s3);
    }
}
