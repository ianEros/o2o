package hust.rc.o2o.dao;

import hust.rc.o2o.entity.Shop;

public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return shop
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     * @param shop
     * @return shop
     */
    int updateShop(Shop shop);
}
