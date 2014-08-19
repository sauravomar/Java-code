package Arrays;

/**
 * Created by saurav on 18/7/14.
 */
public class MaxSumPath {

    public static  int max(int a, int b){
        return a>b ? a:b;
    }


    public static int find(int a[], int b[]){

        int result = 0,sum1=0,sum2=0,i=0,j=0;
        int n1 = a.length, n2 = b.length;

        while(i<n1 && j <n2){

            if(a[i]<b[j]){
                sum1 = sum1 + a[i++];
            }else if(b[j] <  a[i]){
                sum2 = sum2 + b[j++];
            }else{

                result +=  max(sum1,sum2);
                sum1 = 0; sum2=0;
                while (i < n1 &&  j < n2 && a[i] == b[j])
                {
                    result = result + a[i++];
                    j++;
                }

            }

        }
        while (i < n1){
            sum1  +=  a[i++];
        }

        while (j < n2){
            sum2 +=  b[j++];
        }
        result +=  max(sum1, sum2);
        return result;
    }
    public static void main(String args[]){

        int ar1[]  = {2, 3, 7, 10, 12, 15, 30, 34};
        int ar2[] =  {1, 5, 7, 8, 10, 15, 16, 19};
        System.out.println(find(ar1,ar2));


    }
}
