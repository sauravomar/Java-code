package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 7/2/15.
 */
public class ChessTournament {

    public static int getWinner(int array[][]){

        int size = array.length;
        int col = size-2;

        if(size%2 == 1){
            col = size-1;
        }

        for(int i=size-2;i>0;i--){
           if(array[col][i] != 0) {
               col = col-1;
           }
        }

        return col;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int notTestCase = scanner.nextInt();

        int size = ((int) Math.pow(2,notTestCase)) - 1;
        int array [][] = new int [size][size];

        for(int i=0;i<size;i++ ){
            for(int j = 0;j<i+1;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(getWinner(array));
        scanner.close();
    }
}
