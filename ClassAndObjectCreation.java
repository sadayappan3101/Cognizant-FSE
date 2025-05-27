class Car {
    String make;
    String model;
    int year;
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ClassAndObjectCreation {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Tata";
        c1.model = "Nexon";
        c1.year = 2023;
        Car c2 = new Car();
        c2.make = "Kia";
        c2.model = "Sonnet";
        c2.year = 2021;
        c1.displayDetails();
        c2.displayDetails();
    }
}
