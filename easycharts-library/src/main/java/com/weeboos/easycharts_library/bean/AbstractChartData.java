package com.weeboos.easycharts_library.bean;

import android.graphics.Color;

/**
 * Created by bo.wei on 2017/10/9.
 * base class chartData
 */

public abstract class AbstractChartData implements ChartData{
    public static final int DEFAULT_TEXT_SIZE_SP = 12;

    protected int valueLabelTextColor = Color.WHITE;

    protected int valueLabelTextSize = DEFAULT_TEXT_SIZE_SP;
    @Override
    public int getValueLabelTextColor() {
        return valueLabelTextColor;
    }

    @Override
    public void setValueLabelTextColor(int labelTextColor) {
        this.valueLabelTextColor = labelTextColor;
    }

    @Override
    public int getValueLabelTextSize() {
        return valueLabelTextSize;
    }

    @Override
    public void setValueLabelTextSize(int labelTextSize) {
        this.valueLabelTextSize = labelTextSize;
    }
}
