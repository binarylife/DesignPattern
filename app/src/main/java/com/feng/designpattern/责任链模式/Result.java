package com.feng.designpattern.责任链模式;

/**
 * Created by fengbei
 * on 20-11-17
 */
public class Result {

    public boolean isRatify;

    public String info;


    public Result(boolean isRatify, String info) {
        this.isRatify = isRatify;
        this.info = info;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean ratify) {
        isRatify = ratify;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isRatify=" + isRatify +
                ", info='" + info + '\'' +
                '}';
    }
}
