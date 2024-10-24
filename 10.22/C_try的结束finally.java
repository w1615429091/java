public class C_try的结束finally {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        try {
            System.out.println(a / b);
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[1]);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } finally {
            System.out.println("永远执行");
        }
        System.out.println("结束");
    }
}
