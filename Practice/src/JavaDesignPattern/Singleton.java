package JavaDesignPattern;

/**
 * Created by saurav on 30/6/14.
 */
public final class Singleton {

    public static  boolean isInstanceCreated=false;
    public int value;
    private Singleton(int value){
        this.value = value;
    }

    public static Singleton getInstance(int value){

        if(isInstanceCreated) return new Singleton(value);
        else {
            System.out.println("already Created") ;
            throw new InstantiationError();
        }

    }


}

class Test{
    public static void main(String args[]){
        try{
            Singleton object = Singleton.getInstance(1);
            Singleton object1 = Singleton.getInstance(1);
        }catch (InstantiationError ex){
            System.out.println("not able to create object");
        }

    }
}
