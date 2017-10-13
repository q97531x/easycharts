package com.weeboos.easycharts_library.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.weeboos.easycharts_library.bean.Axis;

/**
 * Created by bo.wei on 2017/9/22.
 * 线图渲染器
 */

public class LineAxisRender extends AbstractRender implements AxisRender{
    public static final int DEFAULT_AXIS_WIDTH = 2;
    private Paint axisPaint;
    private com.weeboos.easycharts_library.bean.Axis axis = new com.weeboos.easycharts_library.bean.Axis();

    public LineAxisRender() {
        axisPaint = new Paint();
        axisPaint.setAntiAlias(true);
        axisPaint.setStyle(Paint.Style.STROKE);
        axisPaint.setColor(Color.BLACK);
        axisPaint.setStrokeWidth(DEFAULT_AXIS_WIDTH);
    }

    /**
     * 设置轴画笔颜色
     * @param axisPaintColor
     */
    public void setAxisPaintColor(int axisPaintColor) {
        axisPaint.setColor(axisPaintColor);
    }

    /**
     * 设置轴画笔宽度
     * @param axisPaintWidth
     */
    public void setAxisPaintWidth(float axisPaintWidth){
        axisPaint.setStrokeWidth(axisPaintWidth);
    }

    public com.weeboos.easycharts_library.bean.Axis getAxis() {
        return axis;
    }

    public void setAxis(com.weeboos.easycharts_library.bean.Axis axis) {
        this.axis = axis;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawLine(axis.getHorizontalStartX(),axis.getHorizontalstartY(),axis.getHorizontalEndX(),axis.getHorizontalEndY(),axisPaint);
        canvas.drawLine(axis.getVerticalStartX(),axis.getVerticalStartY(),axis.getVerticalEndX(),axis.getVerticalEndY(),axisPaint);
    }
}
