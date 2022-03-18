package 基础题.VIP试题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月18日16:49
 */
public class FJ的字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        for(int i=1;i<num;i++) {
            String temp = sb.toString();
            sb.append((char)(65+i));
            sb.append(temp);
        }
        System.out.println(sb.toString());
    }
}
