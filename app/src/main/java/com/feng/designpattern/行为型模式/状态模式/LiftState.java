package com.feng.designpattern.行为型模式.状态模式;

/**
 * Created by fengbei
 * on 20-12-18
 */
public abstract class LiftState {

    //  持有一个电梯的状态，用于更新电梯当前的状态
    protected Lift mLift;

    public LiftState(Lift lift) {

        mLift = lift;
    }

    /**
     * 行为：打开电梯门
     */

    public abstract void open();
    /**
     * 行为：关闭电梯门
     */

    public abstract void close();

    /**
     * 行为：电梯运行
     */
    public abstract void run();

    /**
     * 行为：电梯停止运行
     */
    public abstract void stop();
}
