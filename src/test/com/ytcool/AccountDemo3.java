package com.ytcool;

import com.ytcool.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 声明式事务管理方式二:基于AspectJ的xml方式配置测试类
 */
@ContextConfiguration(locations= "classpath:applicationContext3.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountDemo3 {


    @Resource(name = "service3")
    private AccountService accountService;


    //测试业务层的类
    @Test
    public void demo(){
        accountService.transfer("aaa", "bbb", 200d);
    }
}
