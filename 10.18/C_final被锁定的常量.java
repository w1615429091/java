
public class C_final被锁定的常量 {
    public static void main(String[] args) {
        C_Student student = new C_Student();
        System.out.println(student.sid);
        // student.sid = "s002"; 
        // final 表示 sid 不能被修改
        // System.out.println(student.sid);
    }
    
}