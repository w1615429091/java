public class EA_父类与子类 {
    public static void main(String[] args) {
        EC_Cat cat = new EC_Cat();
        ED_Dog dog = new ED_Dog();
        dog.eat();
        dog.bark();
        dog.breathe();
        cat.eat();
        cat.meow();
        cat.breathe();
    }
}