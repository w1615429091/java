package Test1;

import java.util.*;
import java.sql.*;
public class StudentDao {
    public void deleteStudent(String sid,String sname,int age){}

    public void updateStudent(String sid,String sname,int age){}


    public List getAll(){
//        创建一个 ArrayList 对象用于存储学生信息。
        ArrayList List = new ArrayList();
        try {
//            使用 Class.forName 加载 MySQL 驱动。
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
//          建立数据库连接，执行 SQL 查询语句 select * from student。
            String sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);
//          遍历查询结果集，将每条记录封装成 Student 对象并添加到列表中。
            boolean flag = rs.next();
            while (flag == true){
                Student student = new Student();
                student.sid = rs.getString("sid");
                student.sname = rs.getString("sname");
                student.age = rs.getInt("age");
                List.add(student);
//              关闭结果集、语句和连接。
                flag = rs.next();
            }
            rs.close();
            stmt.close();
            conn.close();
//          捕获并处理可能的异常。
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }catch (SQLException e){
            System.out.println(e);
        }
        return List;
    }

}
