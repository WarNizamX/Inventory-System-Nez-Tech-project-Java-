
<%@page import="java.util.List"%>
<%@page import="Customer.customers"%>
<%@page import="newpackage.ConnectionPro"%>
<%@page import="Customer.custDao"%>
<%@page import="newpackage.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<%
    custDao custData = new custDao(ConnectionPro.getConnection());
    List<customers> cust = custData.getAllCustomers();
    request.setAttribute("CUSTOMER_LIST", cust);
%>

<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

        <title>Customer</title>

        <style>
            .inner{
                margin: 15px 0;
            }
        </style>
    </head>
    <body style="background-color:powderblue;">

        <div class="navbar-brand text-uppercase">
            <a href="" title="Category">
                <img src="../img/cust.png" class="img-responsive" style="margin-top:0px; margin-left:20px; width:50px; height:50px "></a></div>
        <div class="navbar-brand text-uppercase">
            <a href="" style="text-decoration:none; margin-left:0px;"><font face="Lucida Calligraphy" size="5" color="#000000"><b>Customer</b></font></a>
        </div>


        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link href="../css/prod.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
                width:100%;
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
<body>

    <div class="topnav" id="myTopnav">
        <a href="../welcome.jsp" class="active">Home</a>
        <a href="../products/index.jsp">Product</a>
        <a href="../category/index.jsp">Category</a>
        <a href="../customers/index.jsp">Customer</a>
        <a href="../order/index.jsp">Current Stock</a>

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
            <a class="navbar-brand"> <h2 style="color:darkcyan">Customer Information</h2></a>
            <form class="form-inline">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </nav>
    </div>
    <div class="container">
        <div class="inner">
            <div class="row">
                <div class="col-md-3">
                    <h3>
                        Add Customer</h3>
                    <form action="../AddCustomersServlet" method="post">

                        <div class="form-group">
                            <label>Customer First Name</label>
                            <input class="form-control" name="cust_firstname" place-holder="First Name" required>
                        </div>
                        <div class="form-group">
                            <label>Customer Last Name</label>
                            <input class="form-control" name="cust_lastname" place-holder="Last Name" required>
                        </div>
                        <div class="form-group">
                            <label>Email</label>
                            <input class="form-control" name="cust_email" place-holder="Enter Email" required>
                        </div>
                        <div class="form-group">
                            <label>Adress</label>
                            <input class="form-control" name="cust_addr" place-holder="Enter Address" required>
                        </div>
                        <div class="form-group">
                            <label>Phone Number</label>
                            <input class="form-control" name="cust_phone" place-holder="Enter Phone Number" required>
                        </div>

                        <button type="submit" class="button">Submit</button>
                        <button type="reset" class="button">Reset</button>
                    </form>
                </div>
                <div class="col-md-9">
                    <h3 style="color:darkseagreen"> List Of Customer</h3>

                    <table id="t01" class="t01" >
                        <thead class="bg-light">
                            <tr>
                                <th scope="col">Customer ID</th>
                                <th scope="col">Customer First Name</th>
                                <th scope="col">Customer Last Name</th>
                                <th scope="col">Customer Email</th>
                                <th scope="col">Customer Address</th>
                                <th scope="col">Customer Phone</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="tempCust" items="${CUSTOMER_LIST}">
                                <tr>
                                    <td>${tempCust.cust_id }</td>
                                    <td>${tempCust.cust_firstname}</td>
                                    <td>${tempCust.cust_lastname}</td>
                                    <td>${tempCust.cust_email}</td>
                                    <td>${tempCust.cust_addr}</td>
                                    <td>${tempCust.cust_phone}</td>

                                    <td><button type="submit" class="button"><a href="editcustomer.jsp?cust_id=${tempCust.cust_id }">Edit</a></button>
                                        <button type="submit" class="button"><a href="../DeleteCustsServlet?cust_id=${tempCust.cust_id}">Delete</a></button>
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

