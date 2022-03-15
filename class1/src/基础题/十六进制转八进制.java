package 基础题;

import java.util.Scanner;

public class 十六进制转八进制 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];
        StringBuilder[] OXbin = new StringBuilder[num];
        StringBuilder[] result = new StringBuilder[num];
        for(int i = 0 ; i < num ; i++){
            String item = scanner.next();
            OXbin[i] = new StringBuilder();
            result[i] = new StringBuilder();
            for(int j = 0 ; j < item.length() ; j++){
                switch (item.charAt(j)){
                    case '0': OXbin[i].append("0000");break;
                    case '1': OXbin[i].append("0001");break;
                    case '2': OXbin[i].append("0010");break;
                    case '3': OXbin[i].append("0011");break;
                    case '4': OXbin[i].append("0100");break;
                    case '5': OXbin[i].append("0101");break;
                    case '6': OXbin[i].append("0110");break;
                    case '7': OXbin[i].append("0111");break;
                    case '8': OXbin[i].append("1000");break;
                    case '9': OXbin[i].append("1001");break;
                    case 'A': OXbin[i].append("1010");break;
                    case 'B': OXbin[i].append("1011");break;
                    case 'C': OXbin[i].append("1100");break;
                    case 'D': OXbin[i].append("1101");break;
                    case 'E': OXbin[i].append("1110");break;
                    case 'F': OXbin[i].append("1111");break;
                    default:
                }
            }//for结束，OXbin中装入某16进制数的二进制形式
            if(OXbin[i].length()%3==1) {
                OXbin[i].insert(0,"00");
            }
            if(OXbin[i].length()%3==2){
                OXbin[i].insert(0,"0");
            }
            //至此，获得十六进制的二进制表示，并且可以每三个转化为一个八进制，接下来就是从头至尾转为八进制
            int j = 3;
            if(OXbin[i].substring(0,3).equals("000")){
                j=6;
            }
            for(; j <= OXbin[i].length() ;j+=3){
                switch(OXbin[i].substring(j-3,j)){
                    case "000": result[i].append(0);break;
                    case "001": result[i].append(1);break;
                    case "010": result[i].append(2);break;
                    case "011": result[i].append(3);break;
                    case "100": result[i].append(4);break;
                    case "101": result[i].append(5);break;
                    case "110": result[i].append(6);break;
                    case "111": result[i].append(7);break;
                    default:
                }
            }

        }//最外层for
        for(StringBuilder item : result){
            System.out.println(item);
        }
    }
}
