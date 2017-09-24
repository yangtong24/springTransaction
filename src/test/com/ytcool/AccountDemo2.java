package com.ytcool;

import com.ytcool.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 声明式事务管理的方式测试类
 */
@ContextConfiguration(locations= "classpath:applicationContext2.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountDemo2 {

    //@Resource(name = "service2")
    //注入代理类,因为代理类进行的增强操作
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;


    //测试业务层的类
    @Test
    public void demo(){
        accountService.transfer("aaa", "bbb", 200d);
    }
}
