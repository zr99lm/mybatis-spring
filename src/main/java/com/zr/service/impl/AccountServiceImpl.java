package com.zr.service.impl;

import com.zr.dao.AccountDao;
import com.zr.entity.Account;
import com.zr.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    SqlSession sqlSession = null;

    @Override
    public List<Account> findAll() {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = build.openSession();
            AccountDao mapper = sqlSession.getMapper(AccountDao.class);
            List<Account> accounts = mapper.selectAll();
            return accounts;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
