package SingleTon;

/**
 * Created by 99210 on 2016/10/12.
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }
}
