package com.feng.designpattern.结构型.适配器模式.adapter;

import com.feng.designpattern.结构型.适配器模式.AC;

/**
 * Created by fengbei
 * on 20-10-28
 */
public interface IDC5Adapter {

    /**
     * 判断是否
     *
     * @param ac
     * @return
     */
    boolean support(AC ac);


    /**
     * 适配器装换标准 5v电压
     * @param ac
     * @return
     */
    int outputDC5V(AC ac);
}
