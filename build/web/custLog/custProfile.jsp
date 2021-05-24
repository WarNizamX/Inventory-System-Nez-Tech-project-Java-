

<%@page import="custLogin.custDao"%>
<%@page import="java.util.List"%>
<%@page import="custLogin.custUser"%>
<%@page import="custLogin.custUserDatabase"%>
<%@page import="newpackage.ConnectionPro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<%
    custDao custData = new custDao(ConnectionPro.getConnection());
    List<custUser> custU = custData.getAllcustUser();
    request.setAttribute("CustU_LIST", custU);
%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="Home/Menu.css" type="text/css">


        <title>View Customer Profile</title>

        <style>

            .inner{
                margin: 15px 0;
            }
        </style>
    </head>
    <body style="background-color:powderblue;">

        <div class="navbar-brand text-uppercase">
            <a href="" title="Profile">
                <img src="../img/cas.png" class="img-responsive" style="margin-top:0px; margin-left:20px; width:50px; height:50px "></a></div>
        <div class="navbar-brand text-uppercase">
            <a href="" style="text-decoration:none; margin-left:0px;"><font face="Lucida Calligraphy" size="5" color="#000000"><b>Customer Profile</b></font></a>
        </div>

        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="../css/prod.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }



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


            table {
                table-layout: auto;
                width: 0px;  

            }
            table, th, td {
                border: 2px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 15px;
                text-align: left;
            }
            #t01 tr:nth-child(even) {
                background-color: #eee;
            }
            #t01 tr:nth-child(odd) {
                background-color: #eee;
            }
            #t01 th {
                background-color: darkcyan;
                color: lightcyan;
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
        <a href="../welcomeCust.jsp" class="active">Home</a>
        <a href="../custLog/custProfile.jsp">Customer Profile</a>
        <a href="../prodView.jsp">Product View</a>

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
            <a class="navbar-brand"><h2 style="color:darkcyan">Customer Profile Details</h2></a>
            <form class="form-inline">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </nav>
    </div>
    <div class="container">
        <div class="inner">
            <div class="row">

                <div class="col-md-11">
                    <h3 style="color:darkseagreen">Customer Profile</h3>

                    <table id="t01" class="table">
                        <thead class="bg-light">
                            <tr>
                                <th scope="col">Customer User ID</th>
                                <th scope="col">Customer User Name</th>
                                <th scope="col">Customer User Email</th>
                                <th scope="col">Customer User Password</th>
                                <th scope="col">Action</th>

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="tempCustU" items="${CustU_LIST}">
                                <tr>
                                    <td>${tempCustU.custo_id }</td>
                                    <td>${tempCustU.custo_name }</td>
                                    <td>${tempCustU.custo_email }</td>
                                    <td>${tempCustU.custo_password }</td>

                                    <td>
                                        <button type="submit" class="button"><a href="editProfile.jsp?custo_id=${tempCustU.custo_id }">Edit</a></button>
                                        
                                    </td>


                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</body>
</html>
