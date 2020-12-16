package com.feng.designpattern.行为型模式.备忘录模式;

import com.feng.designpattern.行为型模式.备忘录模式.bean.HeroState;
import com.feng.designpattern.行为型模式.备忘录模式.bean.SceneState;

/**
 * Created by fengbei
 * on 20-12-16
 * 游戏备份管理类
 */
public class GameMemento {
    // 备份游戏状态
    private HeroState heroState;
    // 备份场景状态
    private SceneState sceneState;

    /**
     * 构造方法
     */
    public GameMemento(HeroState state, SceneState sceneState) {
        try {
            heroState = state.clone();
            this.sceneState = sceneState.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public HeroState getHeroState() {
        return heroState;
    }

    public SceneState getSceneState() {
        return sceneState;
    }
}
