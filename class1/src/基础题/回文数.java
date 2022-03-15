package 基础题;


/**
 * @author Okunoda
 * @date 2022年03月15日15:49
 */
public class 回文数 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            char[] ch = String.valueOf(i).toCharArray();
            if(ch[0]==ch[3] && ch[1]==ch[2]){
                System.out.println(i);
            }
        }
    }
}
