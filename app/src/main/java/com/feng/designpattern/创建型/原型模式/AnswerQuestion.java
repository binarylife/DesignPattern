package com.feng.designpattern.创建型.原型模式;

/**
 * Created by fengbei
 * on 20-10-26
 */
public class AnswerQuestion {


    String name;
    String key;

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
