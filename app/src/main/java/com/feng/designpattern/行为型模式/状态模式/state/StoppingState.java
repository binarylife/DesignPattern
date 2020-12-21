package com.feng.designpattern.行为型模式.状态模式.state;

import com.feng.designpattern.行为型模式.状态模式.Lift;
import com.feng.designpattern.行为型模式.状态模式.LiftState;

/**
 * Created by fengbei
 * on 20-12-18
 */
public class StoppingState extends LiftState {

    public StoppingState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        // 开门动作
        // 1、开门状态
        this.mLift.setmCurstate(mLift.getOpenningState());
        // 2、执行开门动作
        this.mLift.open();
    }

    @Override
    public void close() {
        //  执行关门动作
        mLift.setmCurstate(mLift.getCloseState());
        mLift.close();
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
        System.out.println("电梯停止运行...");
    }
}
