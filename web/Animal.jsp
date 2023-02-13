<%-- 
    Document   : Spider
    Created on : 4 thg 2, 2023, 14:52:47
    Author     : 84384
--%>

<%@page import="model.Ani"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            .ani-block{
                width: 100%;

            }
        </style>
    </head>
    <body>
        <div class="row">
            <%ArrayList<Ani> std
                        = (ArrayList<Ani>) request.getAttribute("AniListData");
                System.out.println("length: " + std.size());
                //s.getImg_url().get(0)
                //-
//                for (int i = 0; i <= std.size(); i++) {
//                    System.out.println("img: " + std.get(i).getImg_url().get(0));
//                }
                try {

                } catch (Exception e) {
                }
                for (int i = 0; i < std.size(); i++) {%>
            <div class="row col-md-3">

                <div class=".ani-block">
                    <%try {%>
                    <jsp:include page="ContentSubJSP/newjsp.jsp" >
                        <jsp:param name="img_link1" value="<%=std.get(i).getImg_url().get(0)%>" />
                        
                        <jsp:param name="img_link2" value="<%=std.get(i).getImg_url().get(1)%>" />
                        
                        <jsp:param name="price" value="<%=std.get(i).getPrice()[0]%>" />
                        
                        <jsp:param name="name" value="<%=std.get(i).getName_ani()%>" />
                        
                    </jsp:include>
                    <%} catch (Exception e) {
        System.out.println("this is id wrong: " + std.get(1).getId_ani());
    }%>

                </div>
            </div>
            <%}%>
        </div>
    </body>
</html>
