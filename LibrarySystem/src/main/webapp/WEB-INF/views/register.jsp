<%-- 
    Document   : register.jsp
    Created on : Nov 19, 2017, 5:43:35 PM
    Author     : Paudel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container"></div>
        <h1>Sign up</h1>
      
        <form method="POST" action="">
            <div class="form-group">
                <label>Full name</label>
                <input class="form-control" name="account_name" type="text" placeholder="Enter full name">
            </div>        
            
             <div class="form-group">
                <label>User Name</label>
                <input class="form-control" name="user_name" type="text" placeholder="Enter User name">
            </div>            
             <div class="form-group">
                <label>Email</label>
                <input class="form-control" name="email" type="email" placeholder="Enter email">
            </div>            
             <div class="form-group">
                <label>password</label>
                <input class="form-control" name="password" type="password" placeholder="Enter Password">
            </div>
            <button class="btn btn-danger">Back</button>
            <button type="submit" class="btn btn-success">Sign Up</button>
        </form>
      
    </body>
</html>
