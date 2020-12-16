package com.feng.designpattern.行为型模式.备忘录模式;

import com.feng.designpattern.行为型模式.命令模式.XiaoEr;
import com.feng.designpattern.行为型模式.命令模式.cook.impl.GuangDongCook;
import com.feng.designpattern.行为型模式.命令模式.cook.impl.JiangSuCook;
import com.feng.designpattern.行为型模式.命令模式.cuisine.impl.GuangDongCuisine;
import com.feng.designpattern.行为型模式.命令模式.cuisine.impl.JiangSuCuisine;
import com.feng.designpattern.行为型模式.备忘录模式.bean.HeroState;
import com.feng.designpattern.行为型模式.备忘录模式.bean.SceneState;

import java.util.Date;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class Test {
    public static void main(String[] args) {


        System.out.println("============方法一=============");

        Game game = new Game();
        HeroState heroState = new HeroState();
        heroState.setHP(100);
        heroState.setMP(88);
        heroState.setStateDate(new Date());
        SceneState sceneState = new SceneState();
        sceneState.setCoin(99);
        sceneState.setWood(88);
        sceneState.setMapName("中国");
        game.setHeroState(heroState);
        game.setSceneState(sceneState);
        System.out.println("游戏状态备份开始");

        //  开启备份
        GameMemento memento = game.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setGameMemento(memento);
        System.out.println("游戏状态备份完成");
        System.out.println("开始游戏，当前英雄生命值：" + game.getHeroState().getHP());
        game.palyGame();
        System.out.println("游戏结束，当前英雄生命值：" + game.getHeroState().getHP());
        System.out.println("游戏状态还原开始");

        game.restore(caretaker.getGameMemento());

        System.out.println("游戏状态还原结束");
        System.out.println("当前英雄生命值：" + game.getHeroState().getHP());


    }
}
