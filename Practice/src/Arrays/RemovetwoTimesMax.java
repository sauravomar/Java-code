package Arrays;

/**
 * Created by saurav on 11/7/14.
 */
public class RemovetwoTimesMax {

    public static int max(int a[], int start, int end){

        int max = 0;
        for(int i=start;i<end;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int a[], int start, int end){

        int min = 10000;
        for(int i=start;i<end;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }

   public static int min(int one, int two){
    return one < two ? one : two;
   }

    public static int remove(int a[],int start,int end){

        if(start>=end){
            return 0;
        }
        int min =  min(a,start,end);
        int max =  max(a,start,end)  ;

        if((2*min) > max){
            return 0;
        }else{
          return (min(remove(a,start+1,end),remove(a,start,end-1))+1);
        }
    }
    public static void main(String args[]){
        int a[] = {4, 5, 100, 9, 10, 11, 12, 15, 200};
        System.out.println(remove(a,0,a.length));
    }
}
