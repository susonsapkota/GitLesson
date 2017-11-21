/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.librarysystem.servlet;

import com.itn.libraryclass.Dao.AccountDaoImpl;
import com.itn.libraryclass.Dao.AcountDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

/**
 *
 * @author Paudel
 */
@WebServlet(name = "login", urlPatterns = "/login")
public class LoginServlet extends HttpServlet{
    
    AcountDao accDao = new AccountDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String email = req.getParameter("email");
      String password = req.getParameter("password");
      if(accDao.checkPassword(email, password)){
          resp.sendRedirect("/LibrarySystem/home");
      }
      else{
          resp.sendRedirect("/LibrarySystem/error");
      }
      
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
    }
    
    
    
    
    
}
