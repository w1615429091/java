import java.io.*;

public class 读取本地文件FlieReader {
    public static void main(String[] args) {
        File file = new File("D:/code/1.txt");
        try {
            FileReader fr = new FileReader(file);
            int n = fr.read();

            while (n != -1) {
                System.out.print((char) n);
                n = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
