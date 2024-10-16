public class K数据类型的转换 {
    public static void main(String[] args) {
        int b = (int) 9.6;
        System.out.println(b);
        double c = (int)9;
        System.out.println(c);
        double d = (double) 5;
        System.out.println(d);
        System.out.println();
        
        // 字符串转int
        int a = Integer.parseInt("5");
        System.out.println(a);
        // 字符串转double
        double e = Double.parseDouble("3.14");
        System.out.println(e);
        // int转字符串
        String f = String.valueOf(5);
        System.out.println(f);
    }
}
