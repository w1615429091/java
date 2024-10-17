public class AB_Monkey {
    // 计算
    void calculate(int a, int b, int c ,int d){
        System.out.println("结果是：" + (a + b + c + d));
    }
    void calculate(int a, int b, int c){
        System.out.println("结果是：" + (a + b + c));
    }
    void calculate(int a, int b){
        System.out.println("结果是：" + (a + b));
    }
    void calculate(double a, double b){
        System.out.println("结果是：" + (a + b));
    }
    void calculate(String a, String b){
        System.out.println("结果是：" + (a + b));
    }
    void calculate(String a, int b){
        System.out.println("结果是：" + (a + b));
    }
    void calculate(int a, String b){
        System.out.println("结果是：" + (a + b));
    }
}
