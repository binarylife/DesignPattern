package com.feng.designpattern.行为型模式.备忘录模式.bean;

import java.util.Date;

/**
 * Created by fengbei
 * on 20-12-16
 */
public class SceneState implements Cloneable {


    //  金币数量
    private int coin;
    //  木材数量
    private int wood;
    //   地图名称
    private String mapName;

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public SceneState clone() throws CloneNotSupportedException {
        SceneState heroState = (SceneState) super.clone();
        return heroState;
    }
}
