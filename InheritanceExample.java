class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
public class InheritanceExample{
    public static void main(String[] args) {
        Animal pet = new Animal();
        pet.makeSound();  
        Dog dog = new Dog();
        dog.makeSound();  
    }
}
