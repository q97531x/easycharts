package com.weeboos.easycharts_library;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.weeboos.easycharts_library.bean.Axis;
import com.weeboos.easycharts_library.renderer.AxisRenderer;

/**
 * Created by bo.wei on 2017/9/20.
 */

public class LineChartView extends AbstractChartView {

    //轴渲染器
    private AxisRenderer axisRenderer;

    //轴数据
    private Axis axis;

    public LineChartView(Context context) {
        this(context,null);
    }

    public LineChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LineChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        axisRenderer = new AxisRenderer();
        axis = new Axis();
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        axisRenderer.setAxis(axis);
        axisRenderer.draw(canvas);
    }
}
