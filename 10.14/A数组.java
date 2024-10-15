public class A数组 {
    public static void main(String[] args) {
        int[] a = new int[5]; // 声明数组
        a[0] = 10; // 给数组元素赋值
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        System.out.println("数组元素为:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
