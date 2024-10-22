package G_集合;
import java.util.*;
public class test2{
    public static void main(String[] args) {
        
        Date d1 = new Date();
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(d1);
        System.out.println(d1.getYear()+1900);
        System.out.println(d1.getMonth()+1);
        System.out.println(d1.getDate());
        System.out.println(d1.getHours());
        System.out.println(d1.getMinutes());
        System.out.println(d1.getDate());
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(2));
        System.out.println(Math.pow(6, 13));
        System.out.println((int)(Math.random()*100));
    }
}