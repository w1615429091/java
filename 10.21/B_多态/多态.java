package B_多态;

public class 多态 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();
        Animal animal = new Dog();
        animal.eat();
        animal = new Cat();
        animal.eat();
        
    }
}
