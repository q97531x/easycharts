package com.weeboos.easycharts_library.view;

import com.weeboos.easycharts_library.renderer.LineAxisRender;
import com.weeboos.easycharts_library.renderer.ChartRender;

/**
 * Created by bo.wei on 2017/10/12.
 */

public interface Chart {

    public ChartRender getChartRender();

    public void setChartRender(ChartRender render);

    public LineAxisRender getAxisRender();

    public void setAxisRender();
}
