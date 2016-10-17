package Builder;

/**
 * Created by 99210 on 2016/10/17.
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder){
        mBuilder=builder;
    }

    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
