package com.weeboos.easycharts_library.bean;

/**
 * Created by bo.wei on 2017/10/9.
 * 基础图表数据接口
 */

public interface ChartData {

    /**
     * 返回label颜色
     * @return
     */
    public int getValueLabelTextColor();

    /**
     * 设置label颜色
     */
    public void setValueLabelTextColor(int labelTextColor);

    /**
     * 返回labelsize
     * @return
     */
    public int getValueLabelTextSize();

    /**
     * 设置labelsize
     */
    public void setValueLabelTextSize(int labelTextSize);


}
