package Tree;

/**
 * Created by saurav on 3/7/14.
 */
public class TreeFromPreandIN {
    public static int preIndex=0;
    public int search(int in[],int val,int start,int end){
        for(int i=start;i<end ;i++){
            if(in[i] == val) return i;
        }
        return  -1;
    }

    public void  convert(int in[],int pre[],int start,int end){

        if(in.length == 0 || pre.length == 0) return;
        if(start >= end) return;

        int root = search(in,pre[preIndex++],start,end);
        if(root > 0){
            convert(in,pre,start,root);
            convert(in,pre,root+1,end);
        }
            System.out.println(in[root]);
    }

    public static void main(String args[]){
        int in[] = {4, 2, 5, 1, 3, 6};
        int  pre[] = {1, 2, 4, 5, 3, 6};
        TreeFromPreandIN obj = new TreeFromPreandIN();
        obj.convert(in,pre,0,in.length);
    }

}
