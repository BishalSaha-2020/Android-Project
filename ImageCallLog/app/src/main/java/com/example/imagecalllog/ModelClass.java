package com.example.imagecalllog;

public class ModelClass {
    private  int imageView1;
    private  String textView1;
    private  String textView2;
    private  String textView3;

    ModelClass(int imageview1,String textView1,String textView2,String textView3){
        this.imageView1=imageView1;
        this.textView1=textView1;
        this.textView2=textView2;
        this.textView3=textView3;
    }

    public int getImageview1() {
        return imageView1;
    }

    public String getTextview1() {
        return textView1;
    }

    public String getTextview2() {
        return textView2;
    }

    public String getTextview3() {
        return textView3;
    }
}
