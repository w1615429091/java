public class 打印5行三角形 {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
