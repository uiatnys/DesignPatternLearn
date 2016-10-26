import ObserverPattern.Coder;
import ObserverPattern.DevTechFrontier;
import Prototype.WordDocument_QianKaoBei;
import Prototype.WordDocument_ShenKaoBei;

public class Main {

    public static void main(String[] args) {

        /**
         * singleton
         */
       /* System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());*/
        /**
         * builder
         */
        /*Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("intel","lg");
        System.out.println(builder.create());*/

        /**
         * prototype
         */
        //浅拷贝
       /* WordDocument_QianKaoBei document=new WordDocument_QianKaoBei();
        document.setText("原型");
        document.addImage("原型image1");
        document.addImage("原型image2");
        document.addImage("原型image3");
        document.showDocument();
        WordDocument_QianKaoBei document1= (WordDocument_QianKaoBei) document.clone();
        System.out.println("===========打印克隆文档=========");
        document1.showDocument();
        System.out.println("===========打印克隆后修改过的文档=========");
        document1.setText("克隆");
        document1.addImage("克隆image1");
        document1.showDocument();
        System.out.println("===========继续打印原文档=========");
        document.showDocument();*/
       //深拷贝
       /* WordDocument_ShenKaoBei document=new WordDocument_ShenKaoBei();
        document.setText("原型");
        document.addImage("原型image1");
        document.addImage("原型image2");
        document.addImage("原型image3");
        document.showDocument();
        WordDocument_ShenKaoBei document1= (WordDocument_ShenKaoBei) document.clone();
        System.out.println("===========打印克隆文档=========");
        document1.showDocument();
        System.out.println("===========打印克隆后修改过的文档=========");
        document1.setText("克隆");
        document1.addImage("克隆image1");
        document1.showDocument();
        System.out.println("===========继续打印原文档==========");
        document.showDocument();*/
       //观察者模式
        DevTechFrontier devTechFrontier=new DevTechFrontier();
        Coder coder1=new Coder("coder1");
        Coder coder2=new Coder("coder2");
        Coder coder3=new Coder("coder3");
        Coder coder4=new Coder("coder4");
        Coder coder5=new Coder("coder5");
        Coder coder6=new Coder("coder6");
        //将观察者注册到可观察对象的观察者列表中
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);
        devTechFrontier.addObserver(coder4);
        devTechFrontier.addObserver(coder5);
        devTechFrontier.addObserver(coder6);
        //发布消息
        devTechFrontier.postNewPublication("测试消息");
    }
}
