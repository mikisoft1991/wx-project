package com.models.wx.tag;

import java.io.Serializable;

/**
 * Created by admin on 2016/11/28.
 */
public class Tag implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
