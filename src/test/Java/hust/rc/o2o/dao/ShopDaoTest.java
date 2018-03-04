/**
 * Description:shopDao测试类
 * File Name:ShopDaoTest
 * Date:2018/2/1
 * Time:16:47
 * Copyright (c) 2018 - Eros_Ian@outlook.com All Rights Reserved.
 */
package hust.rc.o2o.dao;

import hust.rc.o2o.BaseTest;
import hust.rc.o2o.entity.Area;
import hust.rc.o2o.entity.PersonInfo;
import hust.rc.o2o.entity.Shop;
import hust.rc.o2o.entity.ShopCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ShopDaoTest extends BaseTest{
    @Autowired
    private ShopDao shopDao;
    @Test
    public void testInsertShop(){
        Shop shop=new Shop();
        PersonInfo owner= new PersonInfo();
        Area area= new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(1);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试店铺");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("10086");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1,effectedNum);
    }
    @Test
    @Ignore
    public void testUpdateShop(){
        Shop shop=new Shop();
        shop.setShopId(1L);
        shop.setShopDesc("测试描述");
        shop.setShopAddr("测试地址");
        shop.setPhone("10086");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectedNum = shopDao.updateShop(shop);
        assertEquals(1,effectedNum);
    }
}

