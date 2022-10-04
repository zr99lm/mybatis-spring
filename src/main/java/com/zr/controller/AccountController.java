package com.zr.controller;

import com.zr.entity.Account;
import com.zr.service.AccountService;
import com.zr.service.impl.AccountServiceImpl;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;
@Controller
public class AccountController {

    AccountService accountService=new AccountServiceImpl();
    public void findAllAccounts(){

        try {
            List<Account> all = accountService.findAll();
            System.out.println(all.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
