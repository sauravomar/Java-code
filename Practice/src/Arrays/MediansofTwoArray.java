package Arrays;

/**
* Created by saurav on 7/7/14.
*/
public class MediansofTwoArray {

    public static int find(int []a,int b[]){

        int left_1 = 0,right_1 = a.length-1;
        int mid_1 = (left_1+right_1)/2;

        int left_2 = 0,right_2 = b.length-1;
        int mid_2 = (left_2+right_2)/2;

        while((left_1 + 1 < right_1 && left_1 < right_1 + 1) && (left_2 + 1 < right_2 && left_2 < right_2 + 1 )){
            if(a[mid_1] == b[mid_2]) return a[mid_1];

            if(a[mid_1]>b[mid_2]){
                 right_1 = mid_1;
                 left_2 = mid_2;
            }else{
                left_1 = mid_1;
                right_2 = mid_2;
            }
            mid_1 = (left_1+right_1)/2;
            mid_2 = (left_2+right_2)/2;
        }
        return (max(a[left_1],b[left_2]) + min(b[right_2],a[right_1]))/2;
    }

    public static int max(int a,int b){
        return a>b ? a :b;
    }

    public static int min(int a,int b){
        return a>b ? b :a;
    }

    public static void main(String arsg[]){

        int a[]= {1, 12, 15, 26, 38};
        int b[] = {2, 13, 17, 30, 45};
        System.out.println(find(a,b));
    }

}
