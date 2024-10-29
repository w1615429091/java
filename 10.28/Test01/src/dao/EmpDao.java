package dao;
import entity.Emp;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EmpDao {
    public void  addEmp(Emp emp)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql="insert into emp values('"+emp.eid+"','"+emp.ename+"','"+emp.sex+"',"+emp.salary+",'"+sdf.format(emp.hiredate)+"')";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            conn.close();
            stmt.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}