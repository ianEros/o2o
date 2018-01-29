/**
 * Description:AreaService测试类
 * File Name:AreaServiceTest
 * Date:2018/1/29
 * Time:17:05
 * Copyright (c) 2018 - Eros_Ian@outlook.com All Rights Reserved.
 */
package hust.rc.o2o.service;

import hust.rc.o2o.BaseTest;
import hust.rc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest{
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area>areaList=areaService.getAreaListList();
        assertEquals("北门",areaList.get(0).getAreaName());
    }
}
