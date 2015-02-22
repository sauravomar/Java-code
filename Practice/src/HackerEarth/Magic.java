package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 22/2/15.
 */
public class Magic {

    public static int calculate(int no){

        int temp = 0;

        while(no !=0){
            if(no %2 == 1){
                no = no-1;
                temp = temp +1;
            }else{
                no = no/2;
            }
        }

    return temp;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int notTestCase = scanner.nextInt();
        //factorial();
        for(int i=0;i<notTestCase;i++ ){
            System.out.println(calculate(scanner.nextInt()));
        }
        scanner.close();
    }
}
