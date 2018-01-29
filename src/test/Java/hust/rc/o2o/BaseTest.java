/**
 * Description:配置Spring，Junit整合，Junit启动时加载springIOC容器
 * File Name:BaseTest
 * Date:2018/1/29
 * Time:16:38
 * Copyright (c) 2018 - Eros_Ian@outlook.com All Rights Reserved.
 */
package hust.rc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉Junit spring配置文件位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {
}
