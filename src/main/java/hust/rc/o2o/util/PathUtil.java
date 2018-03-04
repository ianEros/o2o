/*
 * Description:路径工具类
 * File Name:PathUtil
 * Date:2018/3/4
 * Time:14:55
 * Copyright (c) 2018 - Eros_Ian@outlook.com All Rights Reserved.
 */
package hust.rc.o2o.util;

public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image";
        } else {
            basePath = "/Users/baidu/work/image";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/images/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
