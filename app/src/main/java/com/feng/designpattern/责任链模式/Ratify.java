package com.feng.designpattern.责任链模式;

/**
 * Created by fengbei
 * on 20-11-17
 */
public interface Ratify {

    /**
     * 处理请求
     *
     * @param chain
     * @return
     */
    Result deal(Chain chain);

    interface Chain {

        //  获取当前request

        Request requset();

        //  转发request
        Result prceed(Request request);
    }
}
