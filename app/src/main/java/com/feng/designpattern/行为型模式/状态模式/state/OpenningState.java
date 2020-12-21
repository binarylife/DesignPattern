package com.feng.designpattern.行为型模式.状态模式.state;

import com.feng.designpattern.行为型模式.状态模式.Lift;
import com.feng.designpattern.行为型模式.状态模式.LiftState;

/**
 * Created by fengbei
 * on 20-12-18
 */
public class OpenningState extends LiftState {

    public OpenningState(Lift lift) {
        super(lift);
    }

    @Override
    public void open() {
        System.out.println("执行开门动作");
    }

    @Override
    public void close() {
        //  执行关门动作
        mLift.setmCurstate(mLift.getCloseState());
        mLift.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
