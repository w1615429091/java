public class B_受保护的类 {
    public static void main(String[] args) {
        B_ChinaPeople p = new B_ChinaPeople();
        p.speak();
        System.out.println(p.bigName);
        System.out.println(p.sname);
//        System.out.println(p.smallName);
    }
}
//总结：
//private：最严格的访问控制，仅限于定义它的类内部。
//默认（无修饰符）：对同一个包内的类可见。
//protected：对同一个包内的类和所有子类可见。
//public：最宽松的访问控制，对所有类都可见。