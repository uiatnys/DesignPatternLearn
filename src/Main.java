import SingleTon.LanHanMoShi;
import SingleTon.StaticInnnerClassSingleton;

public class Main {

    public static void main(String[] args) {
        System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());
    }
}
