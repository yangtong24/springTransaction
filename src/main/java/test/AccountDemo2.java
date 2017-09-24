package test;

import com.ytcool.service.AccountService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@ContextConfiguration(locations="/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountDemo {

    @Resource(name = "service")
    private AccountService accountService;


    //测试业务层的类
    @Test
    public void demo(){
        accountService.transfer("aaa", "bbb", 200d);
    }
}
