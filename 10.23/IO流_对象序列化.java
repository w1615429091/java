import java.io.*;

public class IO流_对象序列化 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();


        File file = new File("1.txt");
        try{
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(cat1);
            oos.close();
            os.close();

        }catch (FileNotFoundException e ){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
