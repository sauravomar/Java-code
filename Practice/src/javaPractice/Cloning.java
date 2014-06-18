package javaPractice;

/**
 * Created by saurav on 11/6/14.
 */

//By default, java cloning is ‘field by field copy’ i.e. as the Object class does not have idea about the structure of class on which clone() method will be invoked. So, JVM when called for cloning, do following things:
//
//        1) If the class has only primitive data type members then a completely new copy of the object will be created and the reference to the new object copy will be returned.
//
//        2) If the class contains members of any class type then only the object references to those members are copied and hence the member references in both the original object as well as the cloned object refer to the same object.

public class Cloning implements Cloneable {

   final public Integer no;
    static  int count  ;
    Cloning(int i){
        no = i;
        count++;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException {

        Cloning obj1 = new Cloning(200);
        Cloning obj2 = (Cloning)obj1.clone();
        System.out.println(obj1.no.equals(obj2.no));
        System.out.println(Cloning.count+" "+ obj2.no);
        float f = 9.9f, m = 3.3f;
        float c = f % m;
        System.out.println(c);

    }
}
