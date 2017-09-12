package com.ytcool.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

//继承JdbcDaoSupport模板类
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /**
     * @param out   转出的账户
     * @param money 转出的金钱
     */
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    /**
     * @param in    转入的账户
     * @param money 转入的金钱
     */
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
