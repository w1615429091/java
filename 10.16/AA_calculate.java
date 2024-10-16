public class AA_calculate {
    // 根据类的属性创造对象
    public static void main(String[] args) {
        AB_Monkey monkey = new AB_Monkey();
        // 控制对象做出不同的行为
        monkey.calculate(3, 5);
        monkey.calculate(3, 5, 7);
        monkey.calculate(3, 5, 7 , 9);
    }
}
