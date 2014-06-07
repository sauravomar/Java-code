package CareerCup;

/**
 * Created by saurav on 1/6/14.
 */
public class MsExcelPattern {

    public String calculate(int no){

        StringBuilder sb = new StringBuilder();
        int n = no;

        while(n>0){
            if(n%26 == 0) {
                sb.append("Z");
                n=n-1;
            }
            else sb.append((char)((n%26)-1+'A'));
            n=n/26;
        }
        return sb.reverse().toString();
    }
    public static void main(String args[]){

        MsExcelPattern obj = new MsExcelPattern();
        System.out.println(obj.calculate(700));
    }

}
