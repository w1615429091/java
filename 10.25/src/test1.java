public class test1 {
    public static void main(String[] args) {
        People p1 = People.huoqu();
        People p2 = People.huoqu();
        People p3 = People.huoqu();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1==p2);
        System.out.println(p2==p3);
        System.out.println(p1==p3);
    }

}
