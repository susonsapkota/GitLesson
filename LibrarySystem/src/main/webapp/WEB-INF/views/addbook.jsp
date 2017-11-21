<%-- 
    Document   : addbook
    Created on : Nov 13, 2017, 5:52:17 PM
    Author     : Paudel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>AddBook</h1>
        
        <form>
            <div>
            <label>Book name</label>
            <input type="text" name="bookName" placeholder="Ennter Book Name">
            </div>
            
            <div>
            <label>Author name</label>
            <input type="text" name="author" placeholder="Ennter Author Name">
            </div>
            
            <div>
            <label>Publisher name</label>
            <input type="text" name="publisher" placeholder="Ennter publisher Name">
            </div>
            
            <input type="submit" value="submit">
            
            </form>
    </body>
</html>
