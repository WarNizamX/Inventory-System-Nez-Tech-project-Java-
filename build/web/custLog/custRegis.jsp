
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Registration</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <img class="avatar" src="../img/boys.svg">
                <br>
                <br>
                <h1>Register Account</h1>
                <form action="../RegisterServletCust" method="post">
                    
                    <p>Customer Name</p>
                    <input type="text" placeholder="Customer Name" name="custo_name" required>
                    <p>Customer Email</p>
                    <input type="text" placeholder="Customer Email" name="custo_email" required>
                    <p>Password</p>
                    <input type="password" placeholder="Password" name="custo_password" required>
                    <input type="submit" value="Register">
                    <a href="../custLog/index.jsp">Already have Account?</a>
                </form>
            </div>
        </div>
    </body>
</html>
