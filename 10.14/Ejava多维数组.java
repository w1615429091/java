
public class Ejava多维数组 {

    public static void main(String[] args) {
        // 二维数组
        System.out.println("二维数组：");

        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 三维数组
        System.out.println("三维数组：");

        int[][][] c = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    System.out.print(c[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();

        // 四维数组
        System.out.println("四维数组：");
        int[][][][] d = {
                {
                        { { 1, 2, 3 }, { 4, 5, 6 } },
                        { { 7, 8, 9 }, { 10, 11, 12 } } },
                {
                        { { 13, 14, 15 }, { 16, 17, 18 } },
                        { { 19, 20, 21 }, { 22, 23, 24 } }
                }
        };
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                for (int k = 0; k < d[i][j].length; k++) {
                    for (int l = 0; l < d[i][j][k].length; l++) {
                        System.out.print(d[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}