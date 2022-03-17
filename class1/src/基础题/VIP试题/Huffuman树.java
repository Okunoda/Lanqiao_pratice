package 基础题.VIP试题;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Okunoda
 * @date 2022年03月17日10:25
 */
public class Huffuman树 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            ls.add(scanner.nextInt());
        }
        int min1, min2;
        int cost = 0;
        int point1, point2;
        boolean num2_has_value = false;
        while (ls.size() > 1) {
            min1 = ls.getLast();
            min2 = ls.getFirst();
            num2_has_value = false;
            point1 = ls.size() - 1;
            point2 = 0;
            for (int i = 0; i < ls.size(); i++) {
                if (ls.get(i) < min1) {
                    min2 = min1;
                    point2 = point1;
                    min1 = ls.get(i);
                    num2_has_value = true;
                    point1 = i;
                } else if (num2_has_value && ls.get(i) <= min2) {
                    min2 = ls.get(i);
                    point2 = i;
                }

            }
            if (!num2_has_value) {
                for (int i = 0; i < ls.size(); i++) {
                    if (ls.get(i) <= min2 && i != point1) {
                        point2 = i;
                        min2 = ls.get(i);
                    }
                }
            }
            ls.add(ls.get(point1) + ls.get(point2));
            cost = cost + ls.get(point1) + ls.get(point2);
            if (point1 > point2) {
                ls.remove(point1);
                ls.remove(point2);
            } else {
                ls.remove(point2);
                ls.remove(point1);
            }


        }
        System.out.println(cost);
    }
}

