<%-- 
    Document   : LoginScrean.
    Created on : 13 thg 2, 2023, 20:40:10
    Author     : 84384
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Login</title>
    </head>
    <body>
        <form action="CheckLogin">
            <table>
                <tr>
                    <td>User</td>
                    <td>: <input type="text" name="user" value="${user}"></td>
                </tr>
                <tr>
                    <td>PassWord</td>
                    <td>: <input type="password" name="pass" value="${pass}"></td>
                </tr>
            </table>
                <input type="submit" value="login">
                <p name="status" style="color: ${color};">${status}</p>
        </form>
         <button>
             <a  s href="CreateAccount.jsp"  style="text-decoration: none;">create account</a>
         </button>
        
        
    </body>
</html>
