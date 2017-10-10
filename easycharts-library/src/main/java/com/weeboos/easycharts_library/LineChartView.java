package com.weeboos.easycharts_library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;

import com.weeboos.easycharts_library.bean.Axis;
import com.weeboos.easycharts_library.renderer.AxisRenderer;
import com.weeboos.easycharts_library.util.DensityUtil;

/**
 * Created by bo.wei on 2017/9/20.
 */

public class LineChartView extends AbstractChartView {

    public static final float Default_Padding_Value = 20f;

    //轴渲染器
    private AxisRenderer axisRenderer;

    //轴数据
    private Axis axis;

    private float padding;

    public LineChartView(Context context) {
        this(context,null);
    }

    public LineChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LineChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        axis = new Axis();
        padding = Default_Padding_Value;
        axisRenderer = new AxisRenderer();
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.LineChartView);
        int axisColor = ta.getColor(R.styleable.LineChartView_axis_color, Color.BLACK);
        int axisWidth = ta.getInteger(R.styleable.LineChartView_axis_width, AxisRenderer.Default_Axis_Width);
        ta.recycle();  //注意回收
        axisRenderer.setAxisPaintColor(axisColor);
        axisRenderer.setAxisPaintWidth(axisWidth);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        axis.setXY(width,height, DensityUtil.dip2px(getContext(),Default_Padding_Value));
        axisRenderer.setAxis(axis);
        axisRenderer.draw(canvas);
    }

    /**
     * set padding value
     * @param padding
     */
    public void setPadding(float padding) {
        this.padding = padding;
    }
}
