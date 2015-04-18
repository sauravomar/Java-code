package HackerEarth;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by saurav on 28/3/15.
 */
public class MaxDistance {

    static double  maxDistance(double speed[], double distance[],double totalFuel) {

        double result = 0;
        double temp = 0;
        int len = speed.length;
        for(int i=0;i<len;i++){
            double inter = totalFuel / distance[i];
            temp = inter * speed[i] ;
            if(temp > result){
                result = temp;
            }
        }
        return result;
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        double speed[] = new double [testCase];
        double distance[] = new double [testCase];

        for(int i=0;i<testCase;i++){
            speed[i] = scanner.nextDouble();
        }

        for(int i=0;i<testCase;i++){
            distance[i] = scanner.nextDouble();
        }

        double totalFuel = scanner.nextDouble();
        DecimalFormat newFormat = new DecimalFormat("#.###");
        newFormat.setRoundingMode(RoundingMode.FLOOR);
        System.out.println(Double.valueOf(newFormat.format(maxDistance(speed,distance,totalFuel))));
        scanner.close();
    }
}
