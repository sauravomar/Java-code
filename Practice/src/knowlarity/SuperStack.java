package Practice.src.knowlarity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * Created by saurav on 17/12/14.
 */
public class SuperStack {

    public  static Stack<Integer>stack =new Stack<Integer>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input =  "";
        int n = in.nextInt();
        String[] ar = new String[n];
        for(int i=0;i<n;i++){
           input = in.next();
            checkIns(input,in);
        }
    }

    public static void checkIns(String input,Scanner in){

        String exp = input.substring(0,2);

        if(exp.equals("po")){
            if(stack.size() == 1){
               stack.pop();
                System.out.println("EMPTY");
                return;
            }else{
                stack.pop();
                System.out.println(stack.peek());
            }
        }else if(exp.equals("pu")){
            stack.push(in.nextInt());
            System.out.println(stack.peek());
        }else{
            int add = in.nextInt();
            int val = in.nextInt();
            for(int i=0;i<add;i++){
                int insert = stack.get(i)+val;
                stack.remove(i);
                stack.add(i,insert);
            }
            System.out.println(stack.peek());
        }

    }
}
