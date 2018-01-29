/**
 * Description:AreaDaoTest测试
 * File Name:AreaDaoTest
 * Date:2018/1/29
 * Time:16:37
 * Copyright (c) 2018 - Eros_Ian@outlook.com All Rights Reserved.
 */
package hust.rc.o2o.dao;

import hust.rc.o2o.BaseTest;
import hust.rc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;

import java.util.List;



public class AreaDaoTest extends BaseTest{
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }
}
