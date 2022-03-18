package 基础题.VIP试题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月18日16:31
 */
public class 完美的代价 {
    static int count = 0;
    static char[] str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        str = sc.next().toCharArray();
        int[] words = new int[26];
        int odd = 0;
        /**
         * 进行奇数字符判断，如果超过一个，则该字符绝对不是回文字符串
         */
        for (int i = 0; i < len; i++) {
            words[str[i] - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (words[i] % 2 == 1)
                odd++;
            if (odd > 1) {
                System.out.println("Impossible");
                return;
            }
        }

        for (int i = 0; i < len / 2; i++) {
            change(finLastIndex(i), len - 1 - i);
        }
        System.out.println(count);

    }

    private static void change(int start, int end) {
        if (str[start] == str[end] || start == end) {
            return;
        }
        char temp = str[start];
        str[start] = str[start + 1];
        str[start + 1] = temp;
        count++;
        change(start + 1, end);

    }

    private static int finLastIndex(int cur) {
        for (int i = str.length - 1 - cur; i > cur; i--) {
            if (str[i] == str[cur]) {
                return i;
            }
        }
        /**
         * 程序进行到此处则表明当前的字符为那个唯一的奇数字符
         * 处理方法则为：将这个奇数字符与他下一个进行交换
         * 	交换后查找当前cur指示的位置（就是原先奇数字符的下一个字符）
         */
        change(cur, cur + 1);
        return finLastIndex(cur);
    }
}
