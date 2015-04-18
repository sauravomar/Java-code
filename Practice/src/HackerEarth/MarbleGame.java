package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 11/4/15.
 */
public class MarbleGame {

    public static  int arr[][];
    public static Scanner in = new Scanner(System.in);

    public static void placeMarb(int noOfMarb){
        int row = 0,col=0;
        for(int i=0;i<noOfMarb;i++){
            row = in.nextInt();
            col = in.nextInt();
            arr[row][col] = 1;
        }
    }

    public static int calculate(){
        int size = arr.length;
        int result = 0;

        for(int i=1;i<size;i++ ){
            for(int j=1;j<size;j++){
                if(arr[i][j] == 1){
                    if(getNo(i,j)){
                        result ++;
                    }
                }
            }
        }
        return result;
    }

    public static boolean getNo(int row, int col){
        int size = arr.length;

        boolean isNorth = false;
        boolean isSouth = false;
        boolean isEast = false;
        boolean isWest = false;

        for(int i=0;i<row-1;i++){
            if(arr[i][col] == 1) {
                isNorth = true;
                break;
            }
        }

        for(int i=row;i<size-1;i++){
            if(arr[i][col] == 1) {
                isSouth = true;
                break;
            }
        }

        for(int i=0;i<col-1;i++){
            if(arr[row][i] == 1) {
                isEast = true;
                break;
            }
        }

        for(int i=col;i<size-1;i++){
            if(arr[row][i] == 1) {
                isWest = true;
                break;
            }
        }

        if(isNorth && isEast && isSouth && isWest) return true;
        else return false;
    }

    public static void main(String[] args) {
        int row = in.nextInt();
        arr = new int[row][row];
        int noOfMarbl = in.nextInt();
        placeMarb(noOfMarbl);
        System.out.println(calculate());
    }

}
