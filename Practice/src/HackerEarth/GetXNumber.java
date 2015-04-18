package HackerEarth;

import java.util.*;

/**
 * Created by saurav on 11/4/15.
 */

public class GetXNumber {


    static Set<Long> answers = new TreeSet<Long>();
    static Map<Long,Set<Long>> keyAnswers = new HashMap<Long,Set<Long>>();

    public static boolean isValidNumber(long n,long result){
        long temp=1;
        while(result!=0){
            temp = temp * (result%10);
            result = result / 10;
        }
        if(temp == n) return true;
        return false;
    }

    public static long getXNumber(long n) {
        String result = "";
        long value = -1;
        TreeSet<Long> res = new TreeSet<Long>();

        if(keyAnswers.containsKey(n)){
            res = (TreeSet<Long>) keyAnswers.get(n);
            return res.first();
        }

        for (long i=1;i<=n/2;i++){
            for(long j=1;j<=n/2;j++){
                if(i*j == n){
                    if(j>=10){
                        j = getXNumber(j);
                    }
                    if(i>=10){
                        i = getXNumber(i);
                    }
                    result = String.valueOf(i);
                    result=result+String.valueOf(j);
                    if(i!=-1 && j!=-1 && isValidNumber(n, Integer.parseInt(result))){
                        value = Integer.parseInt(result);
                        if(keyAnswers.containsKey(n)){
                            answers = keyAnswers.get(n);
                        }
                        else{
                            answers = new TreeSet<Long>();
                        }
                        answers.add(value);
                        keyAnswers.put(n, answers);
                    }
                }
            }
        }

        return value;
    }

    public static String getMin(){
        long small = 10000000;
        for(long no : answers){
            if(no < small){
                small = no;
            }
        }
        if(small == 10000000 ) return ""+-1;
        else {
            String sm = small+"";
            Arrays.sort(sm.toCharArray());
            return ""+sm;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long value = in.nextLong();
        getXNumber(value);
        System.out.println(getMin());
    }

}
