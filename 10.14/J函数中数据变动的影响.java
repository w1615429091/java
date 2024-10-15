public class J函数中数据变动的影响 {
    static void m1(int x) {
        // 接收到了 x 的值，所以修改 x 的值不会影响到原变量
        x = 6;
    }

    static void m2(int[] x) {
        // 接收到了 x 的地址，所以修改 x 指向的数组中的值也会影响到原数组
        x[0] = 666;
    }

    public static void main(String[] args) {
        int a = 5;
        m1(a);
        System.out.println(a);
        // 输出结果：6
        int[] b = { 1, 2, 3, 4, 5 };
        m2(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
        // 输出结果：666 2 3 4 5
    }
}
