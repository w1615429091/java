public class test02 {
    /* 第一个Java程序
     * 它将输出字符串 Hello World*/
    public static void main(String[] args) {
        // 整数变量装整数
        int a = 5;
        System.out.println(a);
        // 小数变量装整数
        double b = 5; 
        System.out.println(b);
        // 字符变量装字符
        char c = '张';
        System.out.println(c);
        // 布尔变量装布尔值
        boolean d = false;
        System.out.println(d);
        // 字符串变量装字符串
        String e = "这是字符串";
        System.out.println(e);
        // 任意类型变量var
        var f = "这是var变量";
        System.out.println(f);
        // f = 8.8; // 错误：不能将double赋给var转化为字符串变量
    }
}
