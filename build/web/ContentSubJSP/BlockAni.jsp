<%-- 
    Document   : BlockAni
    Created on : 4 thg 2, 2023, 14:33:08
    Author     : 84384
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../bootstrap-5.0.2-dist/css/bootstrap.min.css"/>
        <style>
            .ani-block{
                width: 100%;

            }
            .content h5{
                bottom: 0;
                background-color: rgb(135, 112, 70);
                opacity: 70%;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <%String img_link = request.getParameter("img_link");
          String price = request.getParameter("price");
          String name = request.getParameter("name");
        %>
        <div class=".ani-block">
            <img class="img-responsive img-fluid" src=" <%=img_link%>" 
                 alt="alt"/>
            <div class="content">
                <h5> <%=name%> - <%=price%></h5>
            </div>
        </div>
    </body>
</html>
