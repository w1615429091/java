package sleep;

public class wang extends Thread{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("卖菜" + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
