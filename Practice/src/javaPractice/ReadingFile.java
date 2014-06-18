package javaPractice;

/**
 * Created by saurav on 14/6/14.
 */

import java.io.*;
import java.rmi.server.ServerRef;
import java.util.StringTokenizer;


public class ReadingFile {


    public static void main(String args[]){
        File file =  new File("/home/saurav/check.sh");
        if(file.exists()){
            System.out.println(file.compareTo(new File("/home/saurav/e.txt")));
        }
//        FileReader fileReader = new FileReader();
//        fileReader.

        try{
            BufferedReader bf = new BufferedReader(new FileReader("/home/saurav/e.txt"));
            while (bf.readLine()!=null){
                System.out.println(bf.readLine());
            }
        }catch (IOException ex ){
            System.err.println("Sorry File not Found");
        }
    }


}
