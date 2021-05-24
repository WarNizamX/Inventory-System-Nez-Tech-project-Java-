
<%@page import="java.util.List"%>
<%@page import="newpackage.ConnectionPro"%>
<%@page import="custLogin.custUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<% custUser CustUser = (custUser) session.getAttribute("logcustUser");
    if (CustUser == null) {
        response.sendRedirect("prodView/index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>

        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <link href="css/welcomeCust.css" rel="stylesheet" type="text/css"/>
        <title>Nez Technology</title>

        <style>
            .inner{
                margin: 15px 0;
            }
        </style>
    </head>
    <body>
        <div class="navbar-brand text-uppercase">
            <a href="welcomeCust.jsp" title="Category">
                <img src="img/hehe.png" class="img-responsive" style="margin-top:0px; margin-left:20px; width:50px; height:50px "></a></div>
        <div class="navbar-brand text-uppercase">
            <a href="" style="text-decoration:none; margin-left:0px;"><font face="Lucida Calligraphy" size="5" color="#000000"><b>Home</b></font></a>
        </div>

        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">


        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }


            .marginauto {
                margin: -40px auto 30px;
                display: block;
            }
            .button {
                display: inline-block;
                border-radius: 4px;
                background-color: #008b8b;
                border: none;
                color: #FFFFFF;
                text-align: center;
                font-size: 20px;
                padding: 10px 10px;

                transition: all 0.5s;
                cursor: pointer;
                margin: 4px 2px;
            }

            .button:hover {
                background-color: #ff6348 ; /* Green */
                color: white;
            }

            .button span {
                cursor: pointer;
                display: inline-block;
                position: relative;
                transition: 0.5s;
            }

            .button span:after {
                content: '\00bb';
                position: absolute;
                opacity: 0;
                top: 0;
                right: -20px;
                transition: 0.5s;
            }

            .button:hover span {
                padding-right: 25px;
            }

            .button:hover span:after {
                opacity: 1;
                right: 0;
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
                color: black;
                background-color: transparent;
                text-decoration: underline;
            }

            .topnav {
                overflow: hidden;
                background-color: #333;
            }

            .topnav a {
                float: left;
                display: block;
                color: #f2f2f2;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-size: 17px;
            }

            .topnav a:hover {
                background-color: #ddd;
                color: black;
            }

            .topnav a.active {
                background-color: #333;
                color: white;
            }

            .topnav .icon {
                display: none;
            }

            @media screen and (max-width: 600px) {
                .topnav a:not(:first-child) {display: none;}
                .topnav a.icon {
                    float: right;
                    display: block;
                }
            }

            @media screen and (max-width: 600px) {
                .topnav.responsive {position: relative;}
                .topnav.responsive .icon {
                    position: absolute;
                    right: 0;
                    top: 0;
                }
                .topnav.responsive a {
                    float: none;
                    display: block;
                    text-align: left;
                }
            }
        </style>
    </head>


    <div class="topnav" id="myTopnav">
        <a href="welcomeCust.jsp" class="active">Home</a>
        <a href="custLog/custProfile.jsp" >Customer Profile</a>
        <a href="prodView.jsp" >Product View</a>


        <a href="javascript:void(0);" class="icon" onclick="myFunction()">
            <i class="fa fa-bars"></i>
        </a>
    </div>


    <div style="padding-right:80px">

    </div>

    <script>
        function myFunction() {
            var x = document.getElementById("myTopnav");
            if (x.className === "topnav") {
                x.className += " responsive";
            } else {
                x.className = "topnav";
            }
        }
    </script>



    <div  class="container-fluid">
        <nav class="navbar navbar-light">

            <a class="navbar-brand"><b>Nez Technology Store</b></a><p align="right"><button class="button" style="vertical-align:middle"><span><a href="LogoutServlet">Log Out</a></span></button>
        </nav>
    </div>

<centred>
    <div class="img-with-text-below">

        <img class="marginauto" src="img/st.svg"  alt="centered image"  style="width:800px; height:800px ; ">
  
    </div>
</centred>



<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>

