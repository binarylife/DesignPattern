package com.feng.designpattern.行为型模式.备忘录模式.bean;

import java.util.Date;

/**
 * Created by fengbei
 * on 20-12-16
 */
public class HeroState implements Cloneable {

    // 英雄生命值
    private int HP;
    //  英雄魔法值
    private int MP;

    //  状态保存时间
    private Date stateDate;


    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public Date getStateDate() {
        return stateDate;
    }

    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
    }

    public HeroState clone() throws CloneNotSupportedException {
        HeroState heroState = (HeroState) super.clone();
        heroState.setStateDate((Date) heroState.getStateDate().clone());
        return heroState;
    }
}
