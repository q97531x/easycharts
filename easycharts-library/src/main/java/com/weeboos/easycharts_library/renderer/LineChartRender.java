package com.weeboos.easycharts_library.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.weeboos.easycharts_library.bean.Axis;
import com.weeboos.easycharts_library.bean.LineChartData;

/**
 * Created by bo.wei on 2017/10/11.
 */

public class LineChartRender extends AbstractRender {

    private LineChartData lineChartData;

    private Axis axis;

    //分割线画笔
    private Paint splitLinePaint;
    //连接线画笔
    private Paint connectPaint;
    //点画笔
    private Paint pointPaint;

    public LineChartRender(LineChartData lineChartData,Axis axis) {
        this.lineChartData = lineChartData;
        this.axis = axis;
        splitLinePaint = new Paint();
        connectPaint = new Paint();
        pointPaint = new Paint();
    }

    @Override
    public void draw(Canvas canvas) {
        if(lineChartData.isFromBottom()){

        }else {

        }
    }


}
