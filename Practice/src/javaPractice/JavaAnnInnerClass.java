package javaPractice;

/**
 * Created by saurav on 28/7/14.
 */

interface Inner{
    public int value();
}
public class JavaAnnInnerClass{

    public  Inner inner(){
        return new Inner(){
            private int i=1;
            public int value(){
                return i;
            }
        };
    }


}
