package D_接口的父类与子类;

public class test {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Magician m1 = new Magician();
        
        Output output=w1;
        output.attack();

        output = m1;
        output.attack();
    }
}
