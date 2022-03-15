package 基础题;

/**
 * @author Okunoda
 * @date 2022年03月15日15:56
 */
public class 特殊数字 {
    public static void main(String[] args) {
        int[] single = new int[3];
        for (int i = 100; i < 1000; i++) {
            int currentNum = i;
            for(int j = 0 ; j < 3 ; j++){
                single[j] = currentNum%10;
                currentNum=currentNum/10;
            }
            if(i==Math.pow(single[0],3)+Math.pow(single[1],3)+Math.pow(single[2],3)){
                System.out.println(i);
            }
        }
    }
}
