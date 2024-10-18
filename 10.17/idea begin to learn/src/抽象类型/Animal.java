package 抽象类型;
// 抽象类，用于定义动物的基本属性和行为，不能被实例化
public abstract class Animal {
    // 动物的类型
    String type = "动物";

    // 所有动物共有的呼吸行为
    void huxi(){
        System.out.println("huxi!!!");
    }

    // 抽象方法，要求子类必须重写以描述具体动物的进食行为
    abstract void eat();
}
