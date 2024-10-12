public class 嵌套循环 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.println("洗脸啊啊啊" + i);
            int j = 1;
            while (j <= 5) {
                System.out.println("戳脸" + j);
                j++;
            }
            i++;
        }
    }
}
