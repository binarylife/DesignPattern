package com.feng.designpattern.适配器模式;

/**
 * Created by fengbei
 * on 20-10-28
 */
public class AC110 implements AC {
    public final int output = 110;

    @Override
    public int outputAC() {
        return output;
    }
}
