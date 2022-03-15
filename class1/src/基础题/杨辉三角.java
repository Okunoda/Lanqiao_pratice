package 基础题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日16:05
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (dp[i - 1][j] == -1) {
                    dp[i][j] = dp[i - 1][j - 1];
                    break;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] != -1) {
                    if (j == n - 1 && i == n - 1) {
                        System.out.print(dp[i][j]);
                    } else {
                        if (dp[i][j + 1] == -1) {
                            System.out.print(dp[i][j]);
                        } else {
                            System.out.print(dp[i][j] + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
