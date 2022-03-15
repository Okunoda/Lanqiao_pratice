package 基础题.VIP试题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日19:07
 */
public class 高精度加法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder A = new StringBuilder(scanner.next());
        StringBuilder B = new StringBuilder(scanner.next());
        //位数较少的需要高位补零
        int gap = Math.abs(A.length() - B.length());
        if (A.length() > B.length()) {
            for (int i = 0; i < gap; i++) {
                B.insert(0, '0');
            }
        } else {
            for (int i = 0; i < gap; i++) {
                A.insert(0, '0');
            }
        }
        char[] a = A.toString().toCharArray();
        char[] b = B.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int temp;
        for (int i = a.length - 1; i >= 0; i--) {
            temp = a[i] + b[i] - 48 * 2;
            result.insert(0, (temp + carry) % 10);
            carry = (temp + carry) / 10;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }
        System.out.println(result);
    }
}
