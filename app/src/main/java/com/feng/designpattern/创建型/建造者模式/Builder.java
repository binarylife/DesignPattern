package com.feng.designpattern.创建型.建造者模式;

import com.feng.designpattern.DecorationPackageMenu;
import com.feng.designpattern.创建型.建造者模式.ceiling.LevelTwoCeiling;
import com.feng.designpattern.创建型.建造者模式.coat.DuluxCoat;
import com.feng.designpattern.创建型.建造者模式.coat.LiBangCoat;
import com.feng.designpattern.创建型.建造者模式.floor.DerFloor;
import com.feng.designpattern.创建型.建造者模式.floor.ShengXiangFloor;
import com.feng.designpattern.创建型.建造者模式.tile.DongPengTile;
import com.feng.designpattern.创建型.建造者模式.tile.MarcoPoloTile;

import java.math.BigDecimal;

/**
 * Created by fengbei
 * on 20-10-23
 */
public class Builder {


    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(new BigDecimal(area), "豪华欧式").
                appendCeiling(new LevelTwoCeiling())
                .appendFloor(new ShengXiangFloor())
                .appendCoat(new DuluxCoat())
                .appendTile(new DongPengTile());
    }


    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(new BigDecimal(area), "北欧风格").appendCeiling(new LevelTwoCeiling())
                .appendFloor(new DerFloor())
                .appendCoat(new LiBangCoat())
                .appendTile(new MarcoPoloTile());
    }
}
