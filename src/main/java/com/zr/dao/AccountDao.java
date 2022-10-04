package com.zr.dao;

import com.zr.entity.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select * from account")
    List<Account> selectAll();
}
