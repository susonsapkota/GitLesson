/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.libraryclass.entity;

import java.util.Date;

/**
 *
 * @author Paudel
 */
public class Account {
    
    private int accountId;
    private String accountName;
    private String userName;
    private String password;
    private String email;
    private Date date;

    public Account() {
    }

    public Account( String accountName, String userName, String password, String email) {
        
        this.accountName = accountName;
        this.userName = userName;
        this.password = password;
        this.email = email;
       
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
