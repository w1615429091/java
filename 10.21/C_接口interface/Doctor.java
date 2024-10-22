package C_接口interface;

public class Doctor implements Worker{
    public void speak(){
        System.out.println("我是医生，我可以为你解答你的任何问题");
    }
    public void doThing(){
        System.out.println("我是医生，我可以为你做任何手术");
    }
}
