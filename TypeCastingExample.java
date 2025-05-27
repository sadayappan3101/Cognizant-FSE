public class TypeCastingExample {
    public static void main(String[] args) {
        double a = 8.15;
        int x = (int) a;
        System.out.println("Original double value: " + a);
        System.out.println("After casting to int: " + x);
        int y = 31;
        double b = y;
        System.out.println("Original int value: " + y);
        System.out.println("After casting to double: " + b);
    }
}
