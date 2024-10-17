package Guns;

public class HandGun extends Guns {
    public void shoot() {
        System.out.println("手枪射击！！！");
        for (int i = 0; i < 10; i++) {
            System.out.print("biu" + " ");
            
        }
        System.out.println();
    }
}
