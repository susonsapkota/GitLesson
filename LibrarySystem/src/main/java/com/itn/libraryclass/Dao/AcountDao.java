/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.libraryclass.Dao;

import com.itn.libraryclass.entity.Account;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Paudel
 */
public interface AcountDao {
    
    int insert(Account a ) throws SQLException,ClassNotFoundException;
    List<Account> getAll() throws SQLException, ClassNotFoundException;
    boolean checkPassword(String email, String password);
}
