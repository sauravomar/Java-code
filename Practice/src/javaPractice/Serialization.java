package javaPractice;

import java.io.*;
import java.util.concurrent.CountDownLatch;

/**
 * Created by saurav on 25/7/14.
 */
public class Serialization implements Serializable{



    public int val;
    public  Serialization(){
        System.out.println("inside construtor");
        val = 1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}


class Testing{
    public static void main(String args[]) throws IOException , ClassNotFoundException{

        Serialization serial = new Serialization();
        System.out.println("Serialization done.");
        FileOutputStream fos = new FileOutputStream("serial.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(serial);

        CountDownLatch latch = new CountDownLatch(3);
        latch.countDown();

        FileInputStream fis = new FileInputStream("serial.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Serialization deserializedObj = (Serialization) ois.readObject();
        System.out.println("DeSerialization done. Lion: " + deserializedObj.getVal());

    }
}