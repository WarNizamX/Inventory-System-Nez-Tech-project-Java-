
<%@page import="custLogin.custDao"%>
<%@page import="java.util.List"%>
<%@page import="custLogin.custUser"%>
<%@page import="custLogin.custUserDatabase"%>
<%@page import="newpackage.ConnectionPro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!-- To parse info -->

<%
    int custo_id = Integer.parseInt(request.getParameter("custo_id"));
    custDao bkd = new custDao(ConnectionPro.getConnection());
    custUser bk = bkd.getSingleProfile(custo_id);
    request.setAttribute("edit_profile", bk);
%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link href="../css/prod.css" rel="stylesheet" type="text/css"/>
        <title>Edit Customer Profile Data</title>
        <style>
            
            .button {border-radius: 10px;
                     transition-duration: 0.4s;
                     background-color: #008b8b; /* Green */
                     border: none;
                     color: white;
                     padding: 10px 10px;
                     text-align: center;
                     text-decoration: none;
                     display: inline-block;
                     font-size: 16px;
                     margin: 4px 2px;
                     cursor: pointer;
            }

            .button:hover {
                background-color: #212e53 ; /* Green */
                color: white;
            }

            a:link {
                color: white;
                background-color: transparent;
                text-decoration: none;
            }

            a:visited {
                color: white;
                background-color: transparent;
                text-decoration: none;
            }

            a:hover {
                color: whitesmoke;
                background-color: transparent;
                text-decoration: none;
            }

            a:active {
                color: buttonface;
                background-color: transparent;
                text-decoration: none;
            }
            .inner{
                position: relative;
                margin: 0 auto;
                width: 650px;
                display: block;
                padding: 50px 0;
            }
            h3{
                text-align: center;
                border-bottom: 2px solid midnightblue;
                margin-bottom: 20px;
            }
            nav li a{
                font-size: 25px;
                font-weight: 500;
            }
            a{
                color: #fff;
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <div  class="container-fluid">
            <nav class="navbar navbar-light">
                 <a href="../custLog/custProfile.jsp"><img src="../img/b.png" class="img-responsive" style="margin-top:20px; margin-left:20px; width:70px; height:70px "></a>
                <a href="../welcomeCust.jsp"><img src="../img/huas.png" class="img-responsive" style="margin-top:20px; margin-left:20px; width:80px; height:80px "></a>
                <ul class="navbar-nav ml-auto mt-3 mx-5">
                    <li class="nav-item">
         
                    </li>
                </ul>
            </nav>
        </div>
        <div class="inner">
            <div class=" container">
                <div class="row">
                    <div class="col-12">
                        <h3>Edit Customer Profile Details</h3>
                        <form action="../EditProfileServlet" method="post">
                            <div class="form-group">
                                <label>Customer User ID</label>
                                <input class="form-control" name="custo_id" value="${edit_profile.custo_id }" required>
                            </div>
                            <div class="form-group">
                                <label>Customer User Name</label>
                                <input class="form-control" name="custo_name" value="${edit_profile.custo_name  }" required>
                            </div>
                            <div class="form-group">
                                <label> Customer User Email</label>
                                <input class="form-control" name="custo_email" value="${edit_profile.custo_email }" required>
                            </div>
                            <div class="form-group">
                                <label>Customer User Password</label>
                                <input class="form-control" name="custo_password" value="${edit_profile.custo_password }" required>
                            </div>
                            
                            
                            
                            <button type="submit" class="button">Submit</button>
                            <button  class="button"><a href="../custLog/custProfile.jsp">Cancel</a></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

    </body>
</html>

