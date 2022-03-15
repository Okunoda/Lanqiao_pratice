package 基础题;

import java.util.Scanner;
/**
 * @author Okunoda
 * @date 2022年03月15日14:38
 */
public class 特殊回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 10000; i < 1000000; i++) {
            String s1 = String.valueOf(i);
            char[] ch = s1.toCharArray();
            if (ch.length == 5 && ch[0] == ch[4] && ch[1] == ch[3]) {
                //减去48是char数字0对应的ASCII码为48，减去则可以代表数字真正的值，否则就是数字对应的ASCII码值
                int ss = ch[0] + ch[1] + ch[2] + ch[3] + ch[4] - 48 * 5;
                if (a == ss) {
                    System.out.println(ch);
                }
            } else if (ch.length == 6 && ch[0] == ch[5] && ch[1] == ch[4] && ch[2] == ch[3]) {
                int ss1 = ch[0] + ch[1] + ch[2] + ch[3] + ch[4] + ch[5] - 48 * 6;
                if (a == ss1)
                    System.out.println(ch);
            }
        }
    }

}
