public class PatternMatchingSwitch {

    public static void main(String[] args) {
        printType(42);
        printType("Hello, world!");
        printType(3.14);
        printType(true);
        printType(new Object());
    }

    public static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case Boolean b -> System.out.println("It's a Boolean: " + b);
            default -> System.out.println("Unknown type: " + obj);
        }
    }
}
