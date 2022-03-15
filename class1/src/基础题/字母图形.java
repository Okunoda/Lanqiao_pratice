package 基础题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日16:57
 */
public class 字母图形 {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Scanner sc = new Scanner(System.in);
        //行
        int m = sc.nextInt();
        //列
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //用行数和列数进行位置判断
                int x = Math.abs(i - j);
                System.out.print(ch[x]);
            }
            System.out.println();
        }
    }
}
