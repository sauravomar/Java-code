package javaPractice;

/**
 * Created by saurav on 4/6/14.
 */
public class Regex {

    public static void main(String args[]){

        String xml = "<root>" +
                        "<employee> saurav</employee>" +
                        "<employee> Omar</employee>" +
                        "<employee> dude</employee>" +
                     "</root>";

        String op[] = xml.split("<*>");
        System.out.println(op);
        System.out.println("testing");

    }


}
