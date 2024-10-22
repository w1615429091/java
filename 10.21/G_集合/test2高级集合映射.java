package G_集合;
import java.util.*;



public class test2高级集合映射 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("张三","雨伞");
        map.put("李四","太阳伞");
        map.put("王五","降落伞");

        System.out.println(map.get("王五"));
    }
}
