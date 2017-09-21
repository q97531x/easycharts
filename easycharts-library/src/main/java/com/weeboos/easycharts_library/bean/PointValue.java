package com.weeboos.easycharts_library.bean;

/**
 * Created by bo.wei on 2017/9/20.
 */

public class PointValue {
    private float x;
    private float y;
    private String label;       //说明文字

    public PointValue() {
        setValue(0,0);
    }

    public PointValue(float x,float y){
        setValue(x,y);
    }

    public void setValue(float x,float y){
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
