public class HA_对象的引用 {
    public static void main(String[] args) {
        HB_Cat c1 = new HB_Cat("白色", "波斯猫", 5);
        HB_Cat c2 = new HB_Cat("黑色", "咖啡猫", 3);
        HB_Cat c3 = new HB_Cat(null, null, 0);

        System.out.println(c1.color + " " + c1.type + " " + c1.age);
        System.out.println(c2.color + " " + c2.type + " " + c2.age);
        System.out.println(c3.color + " " + c3.type + " " + c3.age);
    }
}
