package G_集合;
import java.util.ArrayList;

public class test1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(6);
        // list.add(2.5);
        // list.add("hello");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
        
    }
}