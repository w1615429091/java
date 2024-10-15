public class F数组和累加器 {
    public static void main(String[] args) {
        double[] score = { 55, 88, 59.5, 68, 75, 88, 99, 66 };
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("总分：" + sum);
        System.out.println("平均分：" + sum / score.length);
    }
}
