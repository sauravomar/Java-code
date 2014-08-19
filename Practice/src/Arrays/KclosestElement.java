package Arrays;

/**
 * Created by saurav on 7/7/14.
 */
public class KclosestElement {

    public static void printCloseKElements(int a[],int no,int k){

        int pos = BinarySearch.search(a,no);
        if(pos>1){
            int left = pos-1,right = pos+1;
            int count = 0;
            while (left>0 && count <k && right<a.length){
                if(no-a[left] < a[right] -no){
                    System.out.println(a[left]);
                    count++;
                    left--;
                }else{
                    System.out.println(a[right]);
                    count++;
                    right++;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[] ={12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        printCloseKElements(arr, 35, 4);
    }

}
