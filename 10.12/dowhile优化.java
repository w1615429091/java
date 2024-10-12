import java.util.Scanner;

public class dowhile优化 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        do {
            System.out.print("吃火腿");
            System.out.println("是否继续付款吃(y/n)?");
            str = sc.next();
        } while (str.equals("y"));
        System.out.println("谢谢光临!");
    }
}
