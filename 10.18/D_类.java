/**
 * D_类
 */
public class D_类 {

    public static void main(String[] args) {
        System.out.println(D_Graphic.pi);
        // 静态方法可以直接调用
        D_Graphic.cfx();
        // D_Graphic.sjx(); 非静态方法不能调用静态方法
    }
}