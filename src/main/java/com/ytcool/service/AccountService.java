package com.ytcool.service;

/**
 * 转账案例的业务层接口
 */
public interface AccountService {
    /**
     * 转账方法
     *
     * @param out   转出的账户
     * @param in    转入的账户
     * @param money 　交易的钱
     */
    void transfer(String out, String in, Double money);
}
