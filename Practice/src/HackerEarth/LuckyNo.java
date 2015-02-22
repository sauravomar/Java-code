package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 7/2/15.
 */
public class LuckyNo {

    public static String getNo(String no){
        StringBuilder sb = new StringBuilder();
        int length = no.length();
        int num = 0;
        int loopSize = length;
        char arr[]  = no.toCharArray();
        int count = 0;
        for(int i =0;i<length;i++){
             num = Integer.parseInt("" + arr[i]);
            if(num == 5 || num == 3){
                sb.append(num);
                count ++;
                continue;
            }
            else if(num >5 ){
                sb.append(3);
                add(sb,length - i);
                break;
            }else if(num >3){
                sb.append(5);
                add(sb,length - i-1);
                break;
            }else{
                sb.append(3);
                add(sb,length - i-1);
                break;
            }
        }

     if(length == count) {
         sb.setLength(0);
         count = 0;
         for (int i = length-1; i >=0; i--) {
             num = Integer.parseInt("" + arr[i]);
             if (num == 5) {
                 sb.append(5);
                 count ++;
                 continue;
             }if(num == 3){
                 String st = sb.toString();
                 sb.setLength(0);
                 sb.append(no.substring(0,i));
                 sb.append(5);
                 sb.append(st);
                 break;
             }
         }
     }

    if(length == count){
        sb.setLength(0);
     add(sb,length+1);
    }
    return sb.toString();
    }

    public static void add(StringBuilder no,int size){

        for(int i=0;i<size;i++){
            no.append('3');
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int notTestCase = scanner.nextInt();

        for(int i=0;i<notTestCase;i++ ){
            System.out.println(getNo(scanner.next()));
        }
        scanner.close();
    }
}
