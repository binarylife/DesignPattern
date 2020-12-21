package com.feng.designpattern.行为型模式.状态模式.state;

import com.feng.designpattern.行为型模式.状态模式.Lift;
import com.feng.designpattern.行为型模式.状态模式.LiftState;

/**
 * Created by fengbei
 * on 20-12-18
 */
public class CloseState extends LiftState {

    public CloseState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        mLift.setmCurstate(mLift.getOpenningState());
        mLift.open();
    }

    @Override
    public void close() {
        //  执行关门动作
        System.out.println("执行关门动作");
    }

    @Override
    public void run() {
        // 运行动作
        // 1、运行状态
        this.mLift.setmCurstate(mLift.getRunningState());
        // 2、运行动作
        this.mLift.run();
    }

    @Override
    public void stop() {
        // 停止动作
        // 1、转化为停止状态
        this.mLift.setmCurstate(mLift.getStoppingState());
        // 2、停止
        this.mLift.stop();
    }
}
