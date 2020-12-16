package com.feng.designpattern.行为型模式.备忘录模式;

/**
 * Created by fengbei
 * on 20-12-16
 */
public class Caretaker {
    private GameMemento gameMemento;

    public GameMemento getGameMemento() {
        return gameMemento;
    }

    public void setGameMemento(GameMemento gameMemento) {
        this.gameMemento = gameMemento;
    }
}
