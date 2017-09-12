package com.ytcool.service;

import com.ytcool.dao.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账案例业务层的实现类
 */
public class AccountServiceImpl implements AccountService {
    //注入转账的dao
    private AccountDao accountDao;

    //注入事务管理的模板
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    /**
     * 转账方法
     * @param out   转出的账户
     * @param in    转入的账户
     * @param money 　交易的钱
     */
    public void transfer(final String out, final String in, final Double money) {

        //编程式事务管理
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                //同时成功或者同时失败
                accountDao.outMoney(out, money);
                int i = 2 / 0;
                accountDao.inMoney(in, money);

            }
        });
    }
}
