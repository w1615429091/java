import java.util.Scanner;
public class scannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行n");
        int n = sc.nextInt();
        System.out.println("请输入符号");
        String ch = sc.next();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            

        }

    }
}
