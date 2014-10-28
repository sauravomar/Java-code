package String;

/**
 * Created by saurav on 24/8/14.
 */
public class KnuthMorrisPrat {

    private char [] search ;
    private int [] pre;
    public KnuthMorrisPrat(String srch){
        search = srch.toCharArray();
        pre =  new int[srch.length()];
    }

    public void preCompute(){

        int len = search.length;
        int i=1,j=0;
        pre[0] = 0;
        while (len>i){
            if(search[i] == search[j]){
                pre[i] = j+1;
                i++;
                j++;
            }else {
                if(j>0){
                    j = pre[j-1];
                }else{
                    pre[j] = 0;
                    i++;
                }

            }
        }
    }

    public String search(String str){

        preCompute();
        char st[] = str.toCharArray();
        int len = st.length;
        int i=0,j=0;
        while (len>i){
            if(st[i] == search[j]){
                if(j == pre.length -1){
                    return "found";
                }
                i++;
                j++;
            }else {
                if(j>0){
                    j = pre[j-1];
                }else{
                    i++;
                }

            }
        }
        return "Not Found";
    }

    public static void main(String args[]){
        String str = "bacbabababacaca" ;
        String search = "ababaca";
        KnuthMorrisPrat obj = new KnuthMorrisPrat(search);

        System.out.println(obj.search(str));
    }
}
