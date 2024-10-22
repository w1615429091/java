public class B_不知道啥 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int x = 5;
        int y = 1;
        try {
            System.out.println(x / y);
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[5]);

        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        }
        System.out.println("程序结束");
    }
}
