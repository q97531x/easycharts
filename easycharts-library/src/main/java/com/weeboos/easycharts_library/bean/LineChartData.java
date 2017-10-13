package com.weeboos.easycharts_library.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bo.wei on 2017/10/9.
 *
 */

public class LineChartData extends AbstractChartData{

    //axis min value
    private float minValue = 0;
    //axis max value
    private float maxValue = 100;

    private float offsetValue = 5;
    //difference from axis bottom or not
    private boolean isFromBottom = true;

    private List<PointValue> pointValues = new ArrayList<>();

    public LineChartData(List<PointValue> pointValues) {
        if(pointValues != null){
            this.pointValues.clear();
            this.pointValues.addAll(pointValues);
        }
    }

    public float getMinValue() {
        return minValue;
    }

    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }

    public float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }

    public float getOffsetValue() {
        return offsetValue;
    }

    public void setOffsetValue(float offsetValue) {
        this.offsetValue = offsetValue;
    }

    public boolean isFromBottom() {
        return isFromBottom;
    }

    public void setFromBottom(boolean fromBottom) {
        isFromBottom = fromBottom;
    }

    public List<PointValue> getPointValues() {
        return pointValues;
    }
}
