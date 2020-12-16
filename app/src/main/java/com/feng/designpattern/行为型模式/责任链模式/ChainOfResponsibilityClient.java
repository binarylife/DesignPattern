package com.feng.designpattern.行为型模式.责任链模式;

import com.feng.designpattern.行为型模式.责任链模式.impl.DepartmentHeader;
import com.feng.designpattern.行为型模式.责任链模式.impl.GroupLeader;
import com.feng.designpattern.行为型模式.责任链模式.impl.Manager;
import com.feng.designpattern.行为型模式.责任链模式.impl.RealChain;

import java.util.ArrayList;

/**
 * Created by fengbei
 * on 20-11-19
 */
public class ChainOfResponsibilityClient {


    private ArrayList<Ratify> ratifies = new ArrayList<>();


    public ChainOfResponsibilityClient() {

    }

    public void addRatifys(Ratify ratify) {

        ratifies.add(ratify);
    }


    public Result execute(Request request) {
        ArrayList<Ratify> arrayList = new ArrayList<>();
        arrayList.addAll(ratifies);
        arrayList.add(new GroupLeader());
        arrayList.add(new Manager());
        arrayList.add(new DepartmentHeader());
        RealChain realChain = new RealChain(arrayList, request, 0);
        return realChain.prceed(request);

    }

}
