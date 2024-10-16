public class GA_Ball {
    double pi = 3.14;
    void s(double r){
        System.out.println("表面积"+ 4*r*r*this.pi);
    }
    void v(double r)
    {
        System.out.println("体积"+ 4/3*this.pi*r*r*r);
    }
}
