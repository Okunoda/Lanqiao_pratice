package 基础题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月11日6:37
 */
public class 数组排序 {
    public static void main(String[] args) {
        int n = 0;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 50);
            System.out.print(arr[i] + "\t");
        }
        int temp = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
