package com.company;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/11.
 */
public class A implements Serializable{
    String num;

    public ArrayList<String> getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(ArrayList<String> picUrl) {
        this.picUrl = picUrl;
    }

    ArrayList<String> picUrl=new ArrayList<>();
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
