package 异常;

import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄age");
        int age = sc.nextInt();
        try{
            if (age > 160) {
                throw new AgeException();
            }
        }catch (AgeException e){
            System.out.println(e);
        }
        if (age <20) {
            System.out.println("小孩");

        }else {
            System.out.println("大人");
        }
    }
}
