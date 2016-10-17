package Builder;

/**
 * Created by 99210 on 2016/10/17.
 * 具体Builder类
 */
public class MacBookBuilder extends  Builder{
    private Computer mComputer = new MacBook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
