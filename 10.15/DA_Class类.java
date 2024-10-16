public class DA_Class类 {
    public static void main(String[] args) {
        // 根据类来创建对象
        DB_Cat c1 = new DB_Cat();
        DB_Cat c2 = new DB_Cat();
        DB_Cat c3 = new DB_Cat();
        // 控制对象做事情
        c1.color = "黑色";
        c2.color = "花色";
        c3.color = "黄色";
        System.out.println(c1.color);
        System.out.println(c2.color);
        System.out.println(c3.color);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        c1.climb();
        c2.climb();
        c3.climb();
    }
}
