/**
 * EA_Class_this的运用
 */
public class EA_Class_this的运用 {

    public static void main(String[] args) {
        EB_Bird bird1 = new EB_Bird();
        EB_Bird bird2 = new EB_Bird();
        
        bird2.color = "白色";
        bird1.fly();
        bird2.fly();
    }
}