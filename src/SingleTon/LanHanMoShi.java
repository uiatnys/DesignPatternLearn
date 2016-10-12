package SingleTon;

/**
 * Created by 99210 on 2016/10/12.
 * 单例模式中的懒汉模式
 */
public class LanHanMoShi {

    private static LanHanMoShi lanHanMoShi;
    private LanHanMoShi(){

    }

    public static synchronized LanHanMoShi getInstance(){
        if (lanHanMoShi == null){
            lanHanMoShi=new LanHanMoShi();
        }
        return lanHanMoShi;
    }
}
