package E_接口的团队继承;

public class DaoShi implements Output,Doctor {
    public void attack(){
        System.out.println("道士攻击");
    }
    public void add(){
        System.out.println("道士加血+");
    }

}
