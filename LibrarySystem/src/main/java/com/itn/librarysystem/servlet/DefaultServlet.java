
package com.itn.librarysystem.servlet;

import com.itn.libraryclass.Dao.BookDao;
import com.itn.libraryclass.Dao.BookDaoImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "default", urlPatterns = "/")
public class DefaultServlet extends HttpServlet {

    BookDao bookDao = new BookDaoImpl();
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String viewPage = "index.jsp";
        if(req.getRequestURI().contains("/home")){
            viewPage = "home.jsp";
        }
        else if(req.getRequestURI().contains("/error")){
            viewPage = "error.jsp";
        }
        
        req.getRequestDispatcher("WEB-INF/views/" + viewPage).forward(req,resp);
    }
    
}
