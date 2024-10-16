import java.util.Scanner;
@SuppressWarnings("resource")

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        do {
            System.out.println("吃火腿");
            System.out.println("是否愿意付款继续支付");
            str = sc.next();

        } while (str.equals("y"));
        System.out.println("谢谢惠顾");

    }
}
