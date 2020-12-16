package com.feng.designpattern.行为型模式.备忘录模式;

import com.feng.designpattern.行为型模式.备忘录模式.bean.HeroState;
import com.feng.designpattern.行为型模式.备忘录模式.bean.SceneState;

/**
 * Created by fengbei
 * on 20-12-16
 */
public class Game {
    /**
     * 英雄属性
     */
    private HeroState heroState;

    /**
     * 场景状态属性
     */
    private SceneState sceneState;

    public HeroState getHeroState() {
        return heroState;
    }

    public void setHeroState(HeroState heroState) {
        this.heroState = heroState;
    }

    public SceneState getSceneState() {
        return sceneState;
    }

    public void setSceneState(SceneState sceneState) {
        this.sceneState = sceneState;
    }


    /**
     * 备份数据
     */
    public GameMemento createMemento() {
        return new GameMemento(heroState, sceneState);
    }

    public void palyGame() {
        heroState.setHP(0);
        heroState.setMP(0);
        sceneState.setCoin(0);
        sceneState.setWood(0);
    }

    public void restore(GameMemento gameMemento) {
        heroState = gameMemento.getHeroState();
        sceneState = gameMemento.getSceneState();
    }
}
