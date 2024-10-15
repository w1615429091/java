public class G求最值 {
    public static void main(String[] args) {
        double[] score = { 55, 88, 59.5, 68, 75, 96, 79, 66 };
        // 定义变量max，初始值为score[0]
        double max = score[0];
        // 遍历score数组，如果score[i]大于max，则更新max
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("最高分：" + max);
        double min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("最低分：" + min);
    }
}
