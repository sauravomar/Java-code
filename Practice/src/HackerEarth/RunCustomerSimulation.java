package HackerEarth;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RunCustomerSimulation
{
    public static void main (String[] args) throws java.lang.Exception
    {
//        int count = RunCustomerSimulation.runCustomerSimulation(1, "ABCBCA");
//       int count = RunCustomerSimulation.runCustomerSimulation (2, "ABBAJJKZKZ");
//        int count = RunCustomerSimulation.runCustomerSimulation(3, "GACCBDDBAGEE");
        int count = RunCustomerSimulation.runCustomerSimulation(3, "GACCBGDDBAEE");
        System.out.println("Count:"+count);
    }

    public static int runCustomerSimulation(int n, String s)
    {
        int count = n;
        boolean  array [] = new boolean[256];
        int numberKhali = 0;
        List<Character>listWaiting = new ArrayList<Character>();


        for(int i=0;i<s.length();i++)
        {
            if(!array[s.charAt(i)]){
                if(count>0){
                    count--;
                    array[s.charAt(i)] = true;
                }
                else {
                    if(listWaiting.contains(s.charAt(i))){
                        listWaiting.remove(listWaiting.indexOf(s.charAt(i)));
                        numberKhali++;
                    }else {
                        listWaiting.add(s.charAt(i));
                    }

                }

            }else{
                count++;
                array[s.charAt(i)] = false;
                if(listWaiting.size()>0){
                    count--;
                    array[listWaiting.get(0)] = true;
                    listWaiting.remove(0);

                }
            }

        }
        return numberKhali;
    }

}