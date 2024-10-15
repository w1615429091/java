import java.util.Scanner;
public class 根据月份打印该月的天数 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("该月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("该月有30天");
                break;
            case 2:
                System.out.println("该月有28天");
                break;
            default:
                System.out.println("输入的月份有误");
                break;
        }
    }
}
