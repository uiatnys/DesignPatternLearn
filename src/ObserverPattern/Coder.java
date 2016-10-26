package ObserverPattern;

/**
 * 观察者
 */

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 99210 on 2016/10/26.
 */
public class Coder implements Observer{

    public String name;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hi,"+name+",订阅更新===="+arg);
    }

    public Coder(String name){
        this.name=name;
    }

    public String toString(){
        return "码农:"+name;
    }
}
