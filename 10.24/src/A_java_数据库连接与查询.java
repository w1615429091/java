import java.sql.*;


public class A_java_数据库连接与查询 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World!");

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/test1";
            String user = "root";
            String password = "root";

            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from t1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs);

            boolean flag = rs.next();
            while (flag == true){
                rs.getString("tid");
                String tid = rs.getString("tid");
                String tname = rs.getString("tname");
                int age = rs.getInt("age");
                System.out.println(tid + " " + tname + " " + age);
                flag = rs.next();
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (SQLException e) {

        }
    }
}