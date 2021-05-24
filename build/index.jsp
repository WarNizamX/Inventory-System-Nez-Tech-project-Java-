

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Login</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
         
    
        <title>Nez Technology</title>
        <style>
            
            h2 {text-align: center;}
            
          
            
            h1 {
                padding: 50px;}
        </style>
    </head>
    <body>
    
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <div class="container">
            <div class="box">
                <img class="avatar" src="img/employee.svg">
                <h1 style= "background-color:lightgrey; border-radius: 30px;">Nez Technology</h1>
                <h2 style="color:#2F4F4F;">Staff Login</h2>
               
                <a style="color:#6B8E23;" href="custLog/index.jsp">Go to Customer Login </a>
                <br>
                <br>
                   
                
                
                <form action="LoginServlet" method="post">
                    <p>Staff Email User</p>
                    <input type="text" placeholder="Enter Your User Name" name="email" required>
                    <p>Password</p>
                    <input type="password" placeholder="Enter Your Password" name="password" required>
                    <input type="submit" value="Login">
                    <a href="register.jsp">Create New Account</a>
                </form>
            </div>
        </div>
    </body>
</html>
