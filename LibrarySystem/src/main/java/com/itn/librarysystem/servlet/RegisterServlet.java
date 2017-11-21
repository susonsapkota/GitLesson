/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.librarysystem.servlet;

import com.itn.libraryclass.Dao.AccountDaoImpl;
import com.itn.libraryclass.Dao.AcountDao;
import com.itn.libraryclass.entity.Account;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Paudel
 */
@WebServlet(name = "register", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet{
    
    AcountDao accountDao = new AccountDaoImpl();
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String accountName = req.getParameter("account_name");
    String userName = req.getParameter("user_name");
    String email = req.getParameter("email");
    String password = req.getParameter("password");
    try{
    int result = accountDao.insert(new Account (accountName, userName, password, email));
    if(result == 1){
        resp.sendRedirect("/LibrarySystem");
    }
    
    }catch(SQLException | ClassNotFoundException ex){
        System.out.println("Error "+ ex.getMessage());
    }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher("WEB-INF/views/register.jsp").forward(req, resp);
    }
    
    
    
    
    
}
