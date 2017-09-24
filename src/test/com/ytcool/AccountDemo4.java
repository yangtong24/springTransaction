package com.ytcool;

import com.ytcool.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 声明式事务管理方式三:基于注解
 */
@ContextConfiguration(locations= "classpath:applicationContext4.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountDemo4 {

    //注入代理类,因为代理类进行的增强操作
    @Resource(name = "service4")
    private AccountService accountService;


    //测试业务层的类
    @Test
    public void demo(){
        accountService.transfer("aaa", "bbb", 200d);
    }
}
