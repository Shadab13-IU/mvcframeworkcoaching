<%-- 
    Document   : afterLogin
    Created on : 23-Oct-2025, 12:00:01 pm
    Author     : shadab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form  action ="Check" method="POST">
            <input type="text" name="fn" placeholder="FirstName"/>
            <input type="text" name="ln" placeholder="LastName"/>
            <button type="submit" class="btn btn-primary">Sign-in</button>
        </form>
    </body>
</html>
