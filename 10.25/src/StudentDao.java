import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {


    public void addStudent(String xh,String xm,int nl){
        System.out.println("成功进入");
        try    {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/test1";
            String user="root";
            String password="root";
            Connection conn= DriverManager.getConnection(url,user,password);
            Statement stmt=conn.createStatement();

            String sql="insert into student values('"+xh+"','"+xm+"',"+nl+")";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            System.out.println("插入成功");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public void deleteStudent(String xh){
        System.out.println("成功进入");
        try    {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/test1";
            String user="root";
            String password="root";
            Connection conn= DriverManager.getConnection(url,user,password);
            Statement stmt=conn.createStatement();

            String sql="delete from student where sid='"+xh+"'";
            stmt.executeUpdate(sql);
            System.out.println("插入成功");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }catch (SQLException e){
            System.out.println(e);
        }
    }

}