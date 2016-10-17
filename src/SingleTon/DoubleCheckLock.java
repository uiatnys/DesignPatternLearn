package SingleTon;

/**
 * Created by 99210 on 2016/10/12.
 * DCL实现单例
 */
public class DoubleCheckLock {
    private volatile static DoubleCheckLock doubleCheckLock=null;
    private DoubleCheckLock(){

    }
    public  static DoubleCheckLock getInatance(){
        if (doubleCheckLock==null){
            synchronized (DoubleCheckLock.class){
                if (doubleCheckLock==null){
                    doubleCheckLock=new DoubleCheckLock();
                }
            }
        }
        return doubleCheckLock;
    }
}
