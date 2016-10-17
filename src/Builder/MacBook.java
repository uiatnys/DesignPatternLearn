package Builder;

/**
 * Created by 99210 on 2016/10/17.
 * 具体Computer类
 */
public class MacBook extends Computer {

    protected MacBook(){

    }

    @Override
    public void setOS() {
        mOS = "Windows 10";
    }
}
