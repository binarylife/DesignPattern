package com.feng.designpattern.结构型.适配器模式.adapter;

import com.feng.designpattern.结构型.适配器模式.AC;

/**
 * Created by fengbei
 * on 20-10-28
 */
public class ChinaPowerAdapter implements IDC5Adapter {
    public static final int voltage = 220;

    @Override
    public boolean support(AC ac) {
        return ac.outputAC() == voltage;
    }

    @Override
    public int outputDC5V(AC ac) {
        int adapterInput = ac.outputAC();
        //变压器...
        int adapterOutput = adapterInput / 44;
        System.out.println("使用ChinaPowerAdapter变压适配器，输入AC:" + adapterInput + "V" + "，输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
