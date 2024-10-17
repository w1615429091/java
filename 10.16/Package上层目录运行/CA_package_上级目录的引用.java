
public class CA_package_上级目录的引用 {
    public static void main(String[] args) {
        Page_Upper_Directory.CB_Cat cat = new Page_Upper_Directory.CB_Cat(); // 正确的引用方式
        System.out.println(cat.color);
        cat.color = "黄色";
        cat.climb();
        
    }
}
