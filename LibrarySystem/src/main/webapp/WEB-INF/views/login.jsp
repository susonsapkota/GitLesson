<%-- 
    Document   : login
    Created on : Nov 19, 2017, 5:59:20 PM
    Author     : Paudel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
               <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <div class="container">
            <form action="" method="POST">
              <div class="form-group">
                <label>Email</label>
                <input class="form-control" name="email" type="email" placeholder="Enter email">
            </div>            
             <div class="form-group">
                <label>password</label>
                <input class="form-control" name="password" type="password" placeholder="Enter Password">
            </div>
                
                <button type="submit" class="btn btn-success">Login </button>
                </form>
            
        </div>
    </body>
</html>
