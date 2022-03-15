package 基础题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日12:47
 */
public class 十六进制转十进制 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        long output = 0;
        for (int i = input.length() - 1, j = 0; i >= 0; i--, j++) {
            switch (input.charAt(i)){
                case 'A': output += 10*Math.pow(16,j);break;
                case 'B': output += 11*Math.pow(16,j);break;
                case 'C': output += 12*Math.pow(16,j);break;
                case 'D': output += 13*Math.pow(16,j);break;
                case 'E': output += 14*Math.pow(16,j);break;
                case 'F': output += 15*Math.pow(16,j);break;
                default:
                    output += Long.parseLong(String.valueOf(input.charAt(i)))*Math.pow(16,j);
            }
        }
        System.out.println(output);
    }
}
