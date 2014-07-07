package javaPractice;

/**
 * Created by saurav on 29/6/14.
 */
public class Sqrt {

    public static void main(String args[]){

        String val = Double.toString(Math.sqrt(36));
        String values[] = val.split("\\.");

        if(values.length == 2){
            int floatValue = Integer.parseInt(""+values[1].charAt(0));
            int decimalValue = Integer.parseInt(values[0]);
            if(floatValue>5){
                System.out.println(decimalValue+1);
            }else{
                System.out.println(decimalValue);
            }
        }else{
            System.out.println(val);
        }



    }

}
