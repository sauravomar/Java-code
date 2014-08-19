package Arrays;

/**
 * Created by saurav on 7/7/14.
 */
public class MajorityElements {

    public  static void find(int a[]){
        int count = 1;
        int index = 0;

        for(int i=0;i<a.length;i++){
            if(a[index] == a[i] ){
                count++;
            }else if(count == 0){
                index = i;
            }else {
                count -- ;
            }
        }
        System.out.println("maximum element is " + a[index]);
    }
    public static void main(String args[]){
        int arr[] = {3, 3 ,4 ,2, 4, 4, 2, 4, 4};
        find(arr);
    }
}
