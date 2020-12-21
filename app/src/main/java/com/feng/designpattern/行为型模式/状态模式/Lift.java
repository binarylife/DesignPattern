package com.feng.designpattern.行为型模式.状态模式;

import com.feng.designpattern.行为型模式.状态模式.state.CloseState;
import com.feng.designpattern.行为型模式.状态模式.state.OpenningState;
import com.feng.designpattern.行为型模式.状态模式.state.RunningState;
import com.feng.designpattern.行为型模式.状态模式.state.StoppingState;

/**
 * Created by fengbei
 * on 20-12-18
 * <p>
 * 电梯实体类
 */
public class Lift {

    //  定义出电梯的所有状态
    private LiftState openningState;
    private LiftState closingState;
    private LiftState runningState;
    private LiftState stoppingState;


    //  当前的状态
    private LiftState mCurstate;

    public Lift() {
        openningState = new OpenningState(this);
        closingState = new CloseState(this);
        runningState = new RunningState(this);
        stoppingState = new StoppingState(this);
    }

    public void setmCurstate(LiftState mCurstate) {
        this.mCurstate = mCurstate;
    }

    public LiftState getOpenningState() {
        return openningState;
    }

    public LiftState getCloseState() {
        return closingState;
    }

    public LiftState getRunningState() {
        return runningState;
    }

    public LiftState getStoppingState() {
        return stoppingState;
    }

    public void open() {
        mCurstate.open();
    }

    public void close() {
        mCurstate.close();
    }

    public void run() {
        mCurstate.run();
    }

    public void stop() {
        mCurstate.stop();
    }
}
