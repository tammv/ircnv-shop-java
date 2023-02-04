<%-- 
    Document   : Spider
    Created on : 4 thg 2, 2023, 14:52:47
    Author     : 84384
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="row">
            <%for(int i= 0; i<= 4 ; i++){%>
            <div class="row col-md-3">
                <%@include file="ContentSubJSP/BlockAni.jsp" %>
            </div>
            <%}%>
        </div>
    </body>
</html>
