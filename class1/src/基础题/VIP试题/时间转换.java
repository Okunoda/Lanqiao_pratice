package 基础题.VIP试题;

/**
 * @author Okunoda
 * @date 2022年03月18日16:32
 */
import java.util.Scanner;

public class 时间转换 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int time = sc.nextInt();
        int sec = time%60;
        int min = time/60%60;
        int hour = time/(3600)%24;
        System.out.println(hour+":"+min+":"+sec);
    }
}
