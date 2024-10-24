import java.io.*;

public class IO流_对象的反序列化 {
    public static void main(String[] args) {
        File file = new File("1.txt");
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            Cat cat1 = (Cat) ois.readObject();
            System.out.println(cat1.type);
            System.out.println(cat1.color);
            ois.close();
            is.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }


}
