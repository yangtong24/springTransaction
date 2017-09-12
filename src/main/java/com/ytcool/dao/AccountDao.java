package com.ytcool.dao;

/**
 * 转账案例的dao层的接口
 */
public interface AccountDao {

    /**
     * @param out   转出的账户
     * @param money 转出的金钱
     */
    void outMoney(String out, Double money);

    /**
     * @param in    转入的账户
     * @param money 转入的金钱
     */
    void inMoney(String in, Double money);
}
