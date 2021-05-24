
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Login</title>
        <style>
            h2 {text-align: center;}
            
            h1 {
                padding: 50px;}
        </style>
    </head>
    <body>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Join Us</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet" type="text/css">
    
    
        <div class="container">
            <div class="box">
                <img class="avatar" src="../img/private-account.svg">
                <h1 style= "background-color:lightgrey; border-radius: 30px;">Nez Technology</h1>
                <h2 style="color:#2F4F4F;">Customer Login</h2>
                
                <a href="http://localhost:8080/Nez_Tech/" style="color:#6B8E23;">Go to Staff Login</a>
                
                <br>
                 <br>
                <form action="../LoginServletCust" method="post">
                    <p>Customer Email User</p>
                    <input type="text" placeholder="Enter Your User Name" name="custo_email" required>
                    <p>Password</p>
                    <input type="password" placeholder="Enter Your Password" name="custo_password" required>
                    <input type="submit" value="Login">
                    <a href="custRegis.jsp">Create New Account</a>
                </form>
            </div>
        </div>
        
        
    </body>
</html>
