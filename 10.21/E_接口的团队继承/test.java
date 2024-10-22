package E_接口的团队继承;

public class test {
    public static void main(String[] args) {
        MuShi ms =new MuShi();

        Doctor doctor=ms;
        doctor.add();

        DaoShi ds =new DaoShi();
        doctor=ds;
        doctor.add();

        Output output = ds;
        output.attack();
    }
}
