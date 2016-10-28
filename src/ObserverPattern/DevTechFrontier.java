package ObserverPattern;

/**
 * 被观察者
 */

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 99210 on 2016/10/26.
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content){
        //标识状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
