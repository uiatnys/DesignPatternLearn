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
        WordDocument_ShenKaoBei document=new WordDocument_ShenKaoBei();
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
        System.out.println("===========继续打印原文档=========");
        document.showDocument();
    }
}
