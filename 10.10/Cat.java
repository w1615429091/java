import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat {
    void zh() throws ParseException {
        String str = "2003-08-08 10:10:12"; // 修改字符串格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);  // 解析字符串
        System.out.println(date); // 输出解析后的日期
    }