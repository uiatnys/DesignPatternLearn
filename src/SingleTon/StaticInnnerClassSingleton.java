package SingleTon;

/**
 * Created by 99210 on 2016/10/12.
 * 静态内部类单例模式，推荐使用
 */
public class StaticInnnerClassSingleton {
    private StaticInnnerClassSingleton(){
    }

    public static StaticInnnerClassSingleton getInstance(){
        return SingleTonHolder.sInstance;
    }

    private static class SingleTonHolder{
        private static final StaticInnnerClassSingleton sInstance=new StaticInnnerClassSingleton();
    }
}
