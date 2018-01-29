/**
 * Description:AreaService实现类
 * File Name:AreaServiceimpl
 * Date:2018/1/29
 * Time:17:01
 * Copyright (c) 2018 - Eros_Ian@outlook.com All Rights Reserved.
 */
package hust.rc.o2o.service.impl;

import hust.rc.o2o.dao.AreaDao;
import hust.rc.o2o.entity.Area;
import hust.rc.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaListList() {
        return areaDao.queryArea();
    }
}
