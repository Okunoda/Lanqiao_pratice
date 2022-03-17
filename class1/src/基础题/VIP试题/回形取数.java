package 基础题.VIP试题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月17日16:06
 */
public class 回形取数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < col ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int total = row*col;
        int loop_count = row;
        for(int i = 0 ; i <loop_count;i++) {
            if(count>=total) {
                break;
            }
            for(int j = i ; j < row-i ;j++) {
                System.out.print(matrix[j][i]+" ");
                count++;
            }
            for(int j = i+1 ; j < col-i ;j++) {
                if(count>=total)
                    break;
                if(count==total-1) {
                    System.out.print(matrix[row-i-1][j]);
                    count++;
                }
                else {
                    System.out.print(matrix[row-i-1][j]+" ");
                    count++;
                }

            }
            for(int j = row-i-2 ; j >= i ;j--) {
                if(count>=total)
                    break;
                if(count==total-1) {
                    System.out.print(matrix[j][col-i-1]);
                    count++;
                }
                else {
                    System.out.print(matrix[j][col-i-1]+" ");
                    count++;
                }
            }
            for(int j = col-i-1-1 ; j > i ;j--) {
                if(count>=total)
                    break;
                if(count==total-1) {
                    System.out.print(matrix[i][j]);
                    count++;
                }
                else {
                    System.out.print(matrix[i][j]+" ");
                    count++;
                }
            }
        }
        return;
    }
}
