package 基础题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日16:38
 */
public class 查找整数 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        int i = 0;
        for (; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(i + 1);
                break;
            }
        }
        if(i==n){
            System.out.println("-1");
        }
    }
}
