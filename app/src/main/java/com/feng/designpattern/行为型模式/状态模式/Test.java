package com.feng.designpattern.行为型模式.状态模式;

import com.feng.designpattern.行为型模式.备忘录模式.Caretaker;
import com.feng.designpattern.行为型模式.备忘录模式.Game;
import com.feng.designpattern.行为型模式.备忘录模式.GameMemento;
import com.feng.designpattern.行为型模式.备忘录模式.bean.HeroState;
import com.feng.designpattern.行为型模式.备忘录模式.bean.SceneState;
import com.feng.designpattern.行为型模式.状态模式.state.CloseState;

import java.util.Date;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class Test {
    public static void main(String[] args) {


        System.out.println("============方法一=============");


        Lift lift = new Lift();
        lift.setmCurstate(new CloseState(lift));
        lift.open();
        lift.close();
        lift.run();
        lift.stop();

    }
}
