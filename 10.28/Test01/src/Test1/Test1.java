package Test1;
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        List<Student> list = dao.getAll();

        for (int i = 0; i < list.size(); i++){
            Student stu = (Student) list.get(i);
            System.out.println(stu.sid + stu.sname + stu.age);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        for (Student stu:list){
            System.out.println(stu.sid + stu.sname + stu.age);
        }


    }
}
