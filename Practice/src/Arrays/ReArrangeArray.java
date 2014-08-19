package Arrays;

/**
 * Created by saurav on 7/7/14.
 */
public class ReArrangeArray {

    public  static int [] convert(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            arr[i] = arr[i] + (arr[arr[i]] %n ) * n;
        }
        for(int i = 0;i<n;i++){
            arr[i] = arr[i]/n;
        }
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {3, 2, 0, 1};
        for(int i : convert(arr)){
            System.out.println(i);
        }
    }
}
