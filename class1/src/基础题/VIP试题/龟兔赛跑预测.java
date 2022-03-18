package 基础题.VIP试题;
import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月18日19:10
 */


public class 龟兔赛跑预测 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed_rabbit = sc.nextInt();
        int speed_turtle = sc.nextInt();
        int lead_min = sc.nextInt();
        int break_time = sc.nextInt();
        int track = sc.nextInt();

        int rabbit_now = 0;
        int turtle_now = 0;

        boolean break_flag = false;
        int i = 0;
        int time = 0;
        for (i = 0; rabbit_now < track && turtle_now < track; i++) {
            if (rabbit_now - turtle_now >= lead_min) {
                break_flag = true;
            } else {
                break_flag = false;
            }

            if (!break_flag) {
                rabbit_now += speed_rabbit;
                turtle_now += speed_turtle;
                time++;
            } else {
//				turtle_now = turtle_now + speed_turtle*break_time;
                for (int j = 0; j < break_time && turtle_now < track; j++) {
                    time++;
                    turtle_now += speed_turtle;
                }
                continue;
            }
        }
        if (rabbit_now >= track && turtle_now >= track)
            System.out.println("D");
        else if (rabbit_now > turtle_now)
            System.out.println("R");
        else
            System.out.println("T");
        System.out.println(time);

    }
}
