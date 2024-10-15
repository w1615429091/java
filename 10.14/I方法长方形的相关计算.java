public class I方法长方形的相关计算 {

    static double calculatearea(double a, double b, double c) {
        return 2 * a * b + 2 * b * c + 2 * c * a;
    }

    static double calculatevolume(double a, double b, double c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        
        System.out.println("长方形的面积是" + calculatearea(3, 2, 5));
        System.out.println("长方形的体积是" + calculatevolume(3, 2, 5));
    }
}
