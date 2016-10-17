import Builder.Builder;

import Builder.MacBookBuilder;
import Builder.Director;

public class Main {

    public static void main(String[] args) {
       /* System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());
        System.out.println(StaticInnnerClassSingleton.getInstance());*/

        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("intel","lg");
        System.out.println(builder.create());
    }
}
