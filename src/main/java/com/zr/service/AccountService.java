package com.zr.service;

import com.zr.entity.Account;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
public interface AccountService {
    public List<Account> findAll() throws IOException;
}
