package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 99210 on 2016/10/18.
 * 深拷贝，开发时建议使用深拷贝
 */
public class WordDocument_ShenKaoBei implements Cloneable {
    @Override
    public Object clone() {
        try {
            WordDocument_ShenKaoBei document= (WordDocument_ShenKaoBei) super.clone();
            document.mText=this.mText;
            document.mImages= (ArrayList<String>) this.mImages.clone();
            return document;
        }catch (Exception e){
        }
        return null;
    }

    private String mText;
    private ArrayList<String> mImages=new ArrayList<>();

    public WordDocument_ShenKaoBei(){
        System.out.println("============构造函数=============");
    }

    public String getText(){
        return mText;
    }

    public void setText(String text){
        this.mText=text;
    }

    public List<String> getImages(){
        return mImages;
    }

    public void addImage(String img){
        this.mImages.add(img);
    }

    public void showDocument(){
        System.out.println(mText);
        for (String value:mImages){
            System.out.println(value);
        }
        System.out.println("===============END===============");
    }
}
