package Arrays;

/**
 * Created by saurav on 7/7/14.
 */
public class Rotation {

    public static void rotate(int a[],int d){

        int length = a.length;
        int part[] = new int[d];
        int no = 0;
        int start=0,end=0;

        if(d>length/2){
            start = length-d-1;
            end = length-1;
        }else{
            start = 0;
            end = d;
        }
        for(int i=start;i<end;i++){
            part[no++] = a[i];
        }

//        for(int i=0;i<)
    }
}
