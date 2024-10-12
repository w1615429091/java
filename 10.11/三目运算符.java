public class 三目运算符 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 三目运算符
        // 先判断？前的数据是否成立，如果成立，则执行后面的表达式，否则执行后面的表达式
        // 语法：(表达式1)? 表达式2 : 表达式3
        // 表达式1：布尔表达式，只有true和false两种值
        // 表达式2：当表达式1为true时，执行的表达式
        // 表达式3：当表达式1为false时，执行的表达式
        System.out.println((true? 33 : 55));
        System.out.println((false? 33 : 55));

        int score = 59;
        System.out.println((score >= 60? "及格" : "不及格"));
        score++;
        System.out.println((score >= 60? "及格" : "不及格"));

        int a = 13,b = 5;
        // a和b中的最大值
        System.out.println((a > b? a : b));
        // a和b中的最小值
        System.out.println((a < b ? a : b));

        
        // 运算符的优先级法则
        // 1. 圆括号
        // 2. 乘除法
        // 3. 加减法
        // 4. 关系运算符如 <、<=、>、>=，用于比较两个值。
        // 5. 逻辑运算符
        // 6. 赋值运算符 =：最低优先级，通常在其他运算完成后进行赋值。
        // 7. 条件运算符
        // 单目>双目>三目
        // 算术>比较>逻辑
        // 乘除>加减
        // 逻辑与(&&)>逻辑或(||)
        // 优先级相同从左向右算
        System.out.println(3+2<=6-3 && 4+2>=15/2 || 8+3<=24-(2*3));
    }
}
