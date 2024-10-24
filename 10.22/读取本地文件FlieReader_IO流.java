import java.io.*;

public class 读取本地文件FlieReader_IO流 {
    public static void main(String[] args) {
        File file = new File("D:/code/2.txt");
        try {
//            FileReader fr = new FileReader(file);
            FileWriter fr = new FileWriter(file);
            fr.write('5');
            fr.write('A');
            fr.write('b');
            fr.write('张');
            fr.write('n');
            fr.write('不');
            fr.write("咱们这无敌的人\n");
            fr.write("咱们这无敌的人\n");

            fr.close();
            System.out.println("文件写入成功");

        } catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
