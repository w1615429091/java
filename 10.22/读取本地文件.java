import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 读取本地文件 {
    public static void main(String[] args) {
        File file = new File("D:/code/1.txt");
        try {
            try {
                FileInputStream fis = new FileInputStream(file);
                int n = fis.read();
                System.out.println(n + ":" + (char) n + " ");
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
