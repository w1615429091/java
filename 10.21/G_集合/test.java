package G_集合;
import java.util.ArrayList;

public class test{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2.5);
        list.add("hello");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}