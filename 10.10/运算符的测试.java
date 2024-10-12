public class 运算符的测试 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 算术运算符
        System.out.println(3+5-2);
        System.out.println(3*5);
        System.out.println(3/5);
        System.out.println(3%5);
        int a = 3;
        a++;
        System.out.println(a);
        a--;
        a--;
        System.out.println(a);
        System.out.println();
        
        // 比较运算符
        System.out.println(3<5);
        System.out.println(3>5);
        System.out.println(3==5);
        System.out.println(3!=5);
        System.out.println();
        // 逻辑运算符
        System.out.println(true&&false);
        System.out.println(true||false);
        System.out.println(true&&true);
        System.out.println(false||false);
        System.out.println(!true);
    }
}
