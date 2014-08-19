package Arrays;

/**
 * Created by saurav on 11/7/14.
 */
public class SetMulOfThree{

    public static int noOfSets(int a[]){

        int count = 0;
        int c[] = new int[3] ;

        for(int i=0;i<a.length;i++){
            c[a[i]%3]++;
        }
        count += ((c[0]*(c[0]-1))/2);
        count += c[1] * c[2];
        count += (c[0] * (c[0]-1) * (c[0]-2))/6;
        count += (c[1] * (c[1]-1) * (c[1]-2))/6;
        count += ((c[2]*(c[2]-1)*(c[2]-2))/6);
        count += c[0]*c[1]*c[2];

        return count;
    }

    public static void main(String args[]){
        int a[] = {3, 6, 7, 2, 9};
        System.out.println(noOfSets(a));
    }

}
