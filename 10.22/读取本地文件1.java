import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 读取本地文件1 {
    public static void main(String[] args) {
        File file = new File("D:/code/1.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            int n = fis.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fis.read();
            }
            fis.close();

        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件读取失败");
        }

    }
}
