package 基础题.VIP试题;

import java.util.Scanner;


public class 皇后问题 {
    //2n皇后问题

    //记录总数
    public static int count;
    //棋盘大小
    public static int size;
    //定义的棋盘
    public static int chess[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        chess = new int[size][size];
        //设定什么位置可放置皇后 1表示可放 0表示不可放
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                chess[i][j] = sc.nextInt();
            }
        }
        put(0, 2);
        System.out.println(count);
    }

    //定义将皇后棋放入棋盘的方法 2表示白皇后 3表示黑皇后
    // 1.先判断棋盘位置是否为1 因为只有1才能放棋
    // 2.判断棋子是否不满足处于同一行 同一列 同一对角线
    // 3.先放白皇后棋，当白皇后棋放好后，再放置黑色棋
    //row 表示行 chess表示皇后棋
    public static void put(int row, int queen) {
        if (row == size) {
            if (queen == 2) {
                put(0, 3);
            }
            //这里不加else 回溯一次 加一次
            else {
                count++;
            }
            return;
        } else {
            for (int i = 0; i < size; i++) {
                if (chess[row][i] != 1) continue;
                if (judge(row, i, queen)) {
                    chess[row][i] = queen;
                } else {
                    continue;
                }
                //当一行放置了皇后后，就跳入下一行
                put(row + 1, queen);
                //每次递归返回结果时要将此步的皇后位置重新变为1
                chess[row][i] = 1;
            }
            //递归回溯
            return;
        }
    }

    //定义判断棋子是否不满足处于同一行 同一列 同一对角线的方法
    //传回的参数是当前行，当前列，和当前的皇后名
    public static boolean judge(int row, int column, int queen) {
        //因为数组的右边 以及下方没有元素所以不用考虑
        //先判断同一列的上方
        for (int i = row - 1; i >= 0; i--) {
            if (queen == chess[i][column])
                return false;
        }
        //考虑左上方
        for (int i = row - 1, w = column - 1; i >= 0 && w >= 0; i--, w--) {
            if (queen == chess[i][w]) {
                return false;
            }
        }
        //考虑右上方
        for (int i = row - 1, w = column + 1; i >= 0 && w < size; i--, w++) {
            if (queen == chess[i][w]) {
                return false;
            }
        }
        return true;
    }
}

