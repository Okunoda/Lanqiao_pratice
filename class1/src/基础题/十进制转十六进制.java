package 基础题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日14:04
 */
public class 十进制转十六进制 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long input = s.nextLong();
        StringBuilder output = new StringBuilder();
        if (input == 0) {
            System.out.println(0);
        } else {


            while (input != 0) {
                int temp = (int) (input % 16);
                switch (temp) {
                    case 10:
                        output.insert(0, 'A');
                        break;
                    case 11:
                        output.insert(0, 'B');
                        break;
                    case 12:
                        output.insert(0, 'C');
                        break;
                    case 13:
                        output.insert(0, 'D');
                        break;
                    case 14:
                        output.insert(0, 'E');
                        break;
                    case 15:
                        output.insert(0, 'F');
                        break;
                    default:
                        output.insert(0, input % 16);
                }
                input /= 16;
            }
            System.out.println(output);
        }
    }
}
