package Arrays;

/**
 * Created by saurav on 7/7/14.
 */
public class BinarySearch {

    public static int search(int []a,int no){

        int left = 0,right=a.length;
        int mid = (left+right)/2;

        while(left<=right){

            if(a[mid] == no) return mid+1;

            if(a[mid]>no){
                right = mid-1;
            }else{
                left = mid+1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(a, 10));
    }

}
