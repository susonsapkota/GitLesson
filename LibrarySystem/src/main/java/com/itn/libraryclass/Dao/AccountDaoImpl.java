/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.libraryclass.Dao;

import com.itn.libraryclass.entity.Account;
import com.itn.libraryclass.utils.Dbconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paudel
 */
public class AccountDaoImpl implements AcountDao{
    
    Dbconnection dbconn = new Dbconnection();

    @Override
    public int insert(Account a) throws SQLException, ClassNotFoundException {
    String query = "insert into tbl_account(account_name, user_name,email,password) VALUES(?,?,?,?)";
    dbconn.open();
        PreparedStatement stmt = dbconn.initStatement(query);
        stmt.setString(1, a.getAccountName());
        stmt.setString(2, a.getUserName());
        stmt.setString(3, a.getEmail());
        stmt.setString(4, encryptPassword(a.getPassword()));
        int result = dbconn.executeUpdate();
        dbconn.close();
        return result;
    }

    @Override
    public List<Account> getAll() throws SQLException, ClassNotFoundException {
        List<Account> acclist = new ArrayList<>();
    String query = "select * from tbl_account";
    dbconn.open();
    dbconn.initStatement(query);
        ResultSet rs = dbconn.executeQuery();
        while(rs.next()){
            Account a = new Account();
            a.setAccountId(rs.getInt(1));
            a.setAccountName(rs.getString(2));
            a.setUserName(rs.getString(3));
            a.setEmail(rs.getString(4));
            a.setPassword(rs.getString(5));
            a.setDate(rs.getDate(6));
            acclist.add(a);
            
        }
        return acclist;
    }
    
    private String encryptPassword(String password){
      byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
      System.out.println("encodedBytes " + new String(encodedBytes));
      return new String(encodedBytes);
    }

    @Override
    public boolean checkPassword(String email, String password) {
        try {
            for(Account a : getAll()){
                if(a.getEmail().equals(email) && a.getPassword().equals(encryptPassword(password))){
                    return true;
                }
            }   } catch (SQLException|ClassNotFoundException ex) {
    }
    
     return false;
}
}