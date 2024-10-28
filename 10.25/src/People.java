public class People {
    private static People  p = null;
    private People(){

    }
    static People huoqu(){
        if (People.p == null){
            People.p = new People();
        }
        return People.p;
    }
}
