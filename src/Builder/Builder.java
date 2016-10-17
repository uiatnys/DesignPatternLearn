package Builder;

/**
 * Created by 99210 on 2016/10/17.
 * 抽象Builder类
 */
public abstract class Builder {

    public abstract void buildBoard(String board);
    public abstract void buildDisplay(String display);
    public abstract void buildOS();
    public abstract Computer create();
}
