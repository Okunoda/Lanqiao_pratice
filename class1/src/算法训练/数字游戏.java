package 算法训练;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月18日19:42
 */
public class 数字游戏 {
//    static int n;        //题目的n
//    static int sum;    //题目的sum
//    static int b = 0;    //用来判断是否找到符合题目的要求的答案，如果找到就不用运行了
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        sum = sc.nextInt();
//        int[] arr = new int[n];            //定义数组来保存1-n的全排序
//        int[] vis = new int[n + 1];        //1-n的全排序求的过程用到
//        dfs(0, arr, vis);                    //递归寻找答案
//
//
//    }
//
//    private static void dfs(int step, int[] arr, int[] vis) {
//        if (b == 0) {                                            //如果没有找到答案继续寻找
//            if (step == n) {
//                int[] arr1 = new int[n];                //留着用来如果找到符合的序列，用于输出
//                for (int i = 0; i < n; i++) {
//                    arr1[i] = arr[i];
//                }
//                for (int i = 0; i < n - 1; i++)                //按题目的要求计算这个1-n的排序是否符合题目的sum
//                {
//                    for (int j = 0; j < n - 1; j++) {
//                        arr1[j] = arr1[j] + arr1[j + 1];
//                    }
//                }
//                if (arr1[0] == sum)                //如果符合就结束了
//                {
//                    for (int i = 0; i < n; i++) {
//                        System.out.print(arr[i] + " ");
//                    }
//                    b = 1;
//                }
//
//                return;
//
//            }
//            for (int i = 1; i <= n; i++)            //这个循环就是用来找1-n的全排序，也可以自己写一个
//            {
//                if (vis[i] == 0) {
//                    arr[step] = i;
//                    vis[i] = 1;    //代表这个数列里面i值已经存在，不能再次出现，这是全排列和不能重复的全排列
//                    dfs(step + 1, arr, vis);
//                    vis[i] = 0;    //回溯，上面的i已经取了，因为循环原因，下一次vis是没有取的
//                }
//
//
//            }
//        }
//
//    }


}
