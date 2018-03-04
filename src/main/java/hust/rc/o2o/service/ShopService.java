package hust.rc.o2o.service;

import hust.rc.o2o.dto.ShopExecution;
import hust.rc.o2o.entity.Shop;

import java.io.File;

public interface ShopService {
    ShopExecution addShop(Shop shop,File shopImg);
}
