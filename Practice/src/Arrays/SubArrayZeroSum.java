package Arrays;

import java.util.HashMap;

/**
 * Created by saurav on 7/7/14.
 */
public class SubArrayZeroSum {

    public static boolean  isExist(int a[]){

        HashMap<Integer,Integer> map =  new HashMap<Integer, Integer>();
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];

            if(a[i] == 0 || sum == 0 || map.containsKey(sum)){
                if(map.containsKey(sum)){
                    System.out.println("Found betWeen position " + (map.get(sum)+1) + " and " + i);
                }else if(a[i] == 0){
                    System.out.println(" value is 0 " + i);
                }else{
                    System.out.println("sum become zero 0 " + i);
                }

                return true;
            }
            map.put(sum,i);
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {4, 2, -3, 1, 6};
        isExist(arr);
    }
}
