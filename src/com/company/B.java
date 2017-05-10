package com.company;

/**
 * Created by Administrator on 2017/5/11.
 */
public class B {
    @slowJson("99")
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
