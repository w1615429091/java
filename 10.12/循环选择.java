import java.util.Scanner;

public class 循环选择 {
    public static void main(String[] args) {
        System.out.println("给我干哪来了，这特么还是国内吗？");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        while(!str.equals("yes")){
            str=sc.next();
        }
        System.out.println("好好好");
        }
    }


