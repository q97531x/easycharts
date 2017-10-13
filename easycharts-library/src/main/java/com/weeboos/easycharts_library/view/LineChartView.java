package com.weeboos.easycharts_library.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.weeboos.easycharts_library.R;
import com.weeboos.easycharts_library.bean.LineChartData;
import com.weeboos.easycharts_library.bean.PointValue;
import com.weeboos.easycharts_library.renderer.LineAxisRender;
import com.weeboos.easycharts_library.renderer.LineChartRender;
import com.weeboos.easycharts_library.util.DensityUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bo.wei on 2017/9/20.
 */

public class LineChartView extends AbstractChartView {

    public static final float DEFAULT_PADDING_VALUE = 20f;

    //轴渲染器
    private LineAxisRender axisRender;
    //轴数据
    private com.weeboos.easycharts_library.bean.Axis axis;

    private LineChartRender lineChartRender;

    private LineChartData lineChartData;

    private List<PointValue> pointValueList = new ArrayList<>();

    private float padding;

    public LineChartView(Context context) {
        this(context,null);
    }

    public LineChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LineChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        axis = new com.weeboos.easycharts_library.bean.Axis();
        padding = DEFAULT_PADDING_VALUE;
        axisRender = new LineAxisRender();

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.LineChartView);
        int axisColor = ta.getColor(R.styleable.LineChartView_axis_color, Color.BLACK);
        int axisWidth = ta.getInteger(R.styleable.LineChartView_axis_width, LineAxisRender.DEFAULT_AXIS_WIDTH);
        ta.recycle();  //注意回收
        axisRender.setAxisPaintColor(axisColor);
        axisRender.setAxisPaintWidth(axisWidth);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        axis.setXY(width,height, DensityUtil.dip2px(getContext(),padding));
        axisRender.setAxis(axis);
        axisRender.draw(canvas);

        lineChartData = new LineChartData(pointValueList);
        lineChartRender = new LineChartRender(lineChartData,axis);

    }

    /**
     * set padding value
     * @param padding
     */
    public void setPadding(float padding) {
        this.padding = padding;
        invalidate();
    }
}
