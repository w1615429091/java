public class A_try与catch的异常处理 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("错误处理完毕");

        }
        System.out.println("程序结束");
    }
}
