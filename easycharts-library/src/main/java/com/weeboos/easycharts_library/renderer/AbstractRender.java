package com.weeboos.easycharts_library.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by bo.wei on 2017/9/21.
 */

public abstract class AbstractRender implements ChartRender {

    private String label;

    private Paint labelPaint;

    public AbstractRender() {
        labelPaint = new Paint();
    }

    public void setLabelPaint(Paint paint){
        labelPaint = paint;
    }

    public void drawLabel(Canvas canvas,float x,float y){
        canvas.drawText(label,x,y,labelPaint);
    }

}
