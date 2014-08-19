package winni;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saurav on 19/8/14.
 */
public class AlphabetSoup {

    private Map<Character,Integer>countMap ;
    private ArrayList<Integer>lineNo;

    public void init(String comp){

        for(int i=0;i<comp.length();i++){
            countMap.put(comp.charAt(i),0);
        }
    }

    public AlphabetSoup(){
        countMap = new HashMap<Character, Integer>();
        lineNo = new ArrayList<Integer>();
    }

    public  void calculate(String str){
        char arr[] = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i],countMap.get(arr[i])+1);
            }
        }
        lineNo.add(getNoOfString());
    }

    public void  process(String fileName, String comp){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int testCase = Integer.parseInt(br.readLine().trim());

            for(int i=0;i<testCase;i++){
                line = br.readLine();
                if(line!=null && line.length() > 0  && line.length() < 1000 ){
                    init(comp);
                    calculate(line.trim());
                }else{
                    break;
                }
            }

            print();

        }catch (Exception ex){
            System.err.println("Error : " + ex.getCause());
            ex.printStackTrace();
        }
    }

    public void print(){
        if(lineNo.size() == 0){
            System.err.println("list is zero");
            throw new NullPointerException("line list is zero");
        }else{
            for(int i=0;i< lineNo.size();i++ ){
                System.out.println("Case#"+(i+1) + " " + lineNo.get(i));
            }
        }

    }

    public int getNoOfString(){
        int min = 10;

        for(Map.Entry<Character,Integer>entry : countMap.entrySet()){
            if(min > entry.getValue()){
                min = entry.getValue();
            }
        }
        return min;
    }

//    public static void main(String args[]){
//
//        AlphabetSoup alpha = new AlphabetSoup();
//        alpha.process("/home/saurav/Java-code/Practice/src/winni/input.txt", "WORLDCUP");
//
//    }

}
