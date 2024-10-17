
public class D_package多层目录引用运行 {
    public static void main(String[] args) {
        a.b.Dog dog = new a.b.Dog();
        a.Cat cat = new a.Cat();
        cat.climb();
        dog.eat();
    }
} 