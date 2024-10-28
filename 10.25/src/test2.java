public class test2 {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();


        dao.addStudent("t007","王石龙",21);
        dao.deleteStudent("t007");
    }
}
