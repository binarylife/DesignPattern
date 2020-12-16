package com.feng.designpattern.创建型.建造者模式;

/**
 * Created by fengbei
 * on 20-10-23
 * 装修菜单
 */
public interface IMenu {
    //  吊顶
    IMenu appendCeiling(Matter matter);
    //  涂料
    IMenu appendCoat(Matter matter);
    //  地板
    IMenu appendFloor(Matter matter);
    //   瓷砖
    IMenu appendTile(Matter matter);

    //   明细
    String getDetail();
}
