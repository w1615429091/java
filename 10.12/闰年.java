public class 闰年 {
    public static void main(String[] args) {
        // 打印1-5000之间的闰年
        int year = 1; // 初始化年份
        while (year <= 5000) {
            // 判断是否为闰年
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
            year++; // 年份加1  1
        }
    }
}
