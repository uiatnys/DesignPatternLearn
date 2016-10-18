package Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 99210 on 2016/10/18.
 * 原型模式   通过clone拷贝对象不会执行构造函数
 * 此种方法是浅拷贝，也称为影子拷贝，实际上是将clone类指向当前地址，原型与克隆对象指向的是同一个地址
 */
public class WordDocument_QianKaoBei implements Cloneable {
    @Override
    public Object clone() {
        try {
            WordDocument_QianKaoBei document= (WordDocument_QianKaoBei) super.clone();
            document.mText=this.mText;
            document.mImages=this.mImages;
            return document;
        }catch (Exception e){
        }
        return null;
    }

    private String mText;
    private ArrayList<String> mImages=new ArrayList<>();

    public WordDocument_QianKaoBei(){
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
