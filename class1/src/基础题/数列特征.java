package 基础题;

import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月15日16:44
 */
public class 数列特征 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min = s.nextInt();
        int max =min , sum = min ;
        int temp ;
        for(int i = 0 ; i < n-1 ;i ++){ 
            temp = s.nextInt();
            if(temp>max){
                max = temp;
            }
            if(temp<min){
                min = temp;
            }
            sum+=temp;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
