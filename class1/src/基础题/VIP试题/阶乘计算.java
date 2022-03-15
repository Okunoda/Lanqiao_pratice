package 基础题.VIP试题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日18:16
 */
public class 阶乘计算 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] result = new int[102400000];
        result[0] = 1;
        int length = 1;
        int carry = 0;
        int tempResult;
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < length; ++j) {

                tempResult = result[j]*i;
                result[j] = (tempResult+carry)%10;
                carry = (tempResult+carry)/10;
                if(carry>0&&j==length-1){
                    length++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<length ; i++){
            sb.insert(0,result[i]);
        }
        System.out.println(sb);
//        for(int i = 0 ; i<sb.length();i++){
//            if(sb.charAt(i)!='0'){
//                System.out.println(sb.substring(i));
//                break;
//            }
//        }
    }
}
