import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的金额：");
        int money = scanner.nextInt();

        // int money1010 = 1;
        switch (money) {
            case 1:System.out.println("矿泉水");
            break;
            case 2:System.out.println("农夫山泉");
            break;
            case 3:System.out.println("冰红茶");
            break;
            case 4:System.out.println("阿萨姆");
            break;
            case 5:System.out.println("茶π");
            break;
            case 6:System.out.println("外星人电解质水");
            break;
            default:System.out.println("没有喝水");
        }
    }
}
