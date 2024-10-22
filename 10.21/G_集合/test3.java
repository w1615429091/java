package G_集合;
import java.text.SimpleDateFormat;
import java.util.*;;
public class test3{
public static void main(String[] args) throws Exception {
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String str = sdf.format(date);
    System.out.println(str);
    System.out.println(date);

    Date date2 = sdf.parse(str);
    System.out.println(date2);

    String str2 = "2004-05-01 12:30:00";
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date3 = sdf2.parse(str2);
    System.out.println(date3);
}
}