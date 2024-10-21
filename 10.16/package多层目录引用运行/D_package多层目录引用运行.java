
public class D_package多层目录引用运行 {
    public static void main(String[] args) {
        a.b.Dog dog = new a.b.Dog();
        a.Cat1 cat1 = new a.Cat1();
        cat1.climb();
        dog.eat();
    }
} 