package C_接口interface;

public class test {

    public static void main(String[] args) {
        System.out.println("~~~~~~~");
        Worker worker = new Doctor();
        worker.speak();
        worker.doThing();
        System.out.println("~~~~~~~");
    }
}