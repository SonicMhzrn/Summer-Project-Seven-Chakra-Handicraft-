<%-- 
    Document   : cart.jsp
    Created on : Feb 19, 2024, 1:01:34 PM
    Author     : Dell
--%>

<%@page import="com.entity.Cart"%>
<%@page import="com.DAO.CartDAOImpl"%>
<%@page import="com.DAO.CartDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.Bowls"%>
<%@page import="com.DAO.BowlDAOImpl"%>
<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Seven</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="format-detection" content="telephone=no">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="author" content="">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!--<link rel="stylesheet" type="text/css" href="style.css">-->
        <link rel="stylesheet" type="text/css" href="cartstyle.css">
        <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />-->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@300;400;500&family=Lato:wght@300;400;700&display=swap" rel="stylesheet">
        <!--         script
                ================================================== -->
        <script src="js/modernizr.js"></script>
        <script src="https://khalti.s3.ap-south-1.amazonaws.com/KPG/dist/2020.12.17.0.0.0/khalti-checkout.iffe.js"></script>
        <style>
            .container{
                padding-top: 100px;
            }
        </style>
    </head>
    <body data-bs-spy="scroll" data-bs-target="#navbar" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true" tabindex="0">


        <%@include file="svgFile.jsp" %>
        <%@include file="navbar1.jsp" %>
        <c:if test="${empty userobj}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="container">
            <div class="py-5 text-center">

                <h2>Your Profile</h2>
                <c:if test="${not empty succMsg}">
                    <p class="alert alert-success text-center" role="alert">${succMsg}</p>
                    <c:remove var="succMsg" scope="session"/>
                </c:if>
                <c:if test="${not empty failedMsg}">
                    <p class="alert alert-success text-center" role="alert">${failedMsg}</p>
                    <c:remove var="failedMsg" scope="session"/>
                </c:if>

            </div>

            <div class="row">
                <%
                    User u = (User) session.getAttribute("userobj");

                %>
                <div class="col-md-8 order-md-1">
                    <!--<h4 class="mb-3">Billing address</h4>-->


                    <form action="profile_update" method="post" class="needs-validation" novalidate>
                        <input type="hidden" name="id" value="<%=u.getId()%>">

                        <div class="mb-3">
                            <label for="username">Username</label>
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">@</span>
                                </div>
                                <input type="text" class="form-control" id="username" name="username" value="<%=u.getUsername()%>" readonly>
                                <div class="invalid-feedback" style="width: 100%;">
                                    Your username is required.
                                </div>
                            </div>
                        </div>

                        <div class="mb-3">
                            <label for="email">Email </label>
                            <input type="email" class="form-control" id="email" name="email" value="<%=u.getEmail()%>">
                            <div class="invalid-feedback">
                                Please enter a valid email address for shipping updates.
                            </div>
                        </div>

                        <div class="mb-3">
                            <label for="address">Address</label>
                            <input type="text" class="form-control" id="address" name="address" value="<%=u.getAddress()%>" required>
                            <div class="invalid-feedback">
                                Please enter your shipping address.
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="address">Phone Number</label>
                            <input type="text" class="form-control" id="address" name="phonenumber" value="<%=u.getPhone()%>" required>
                            <div class="invalid-feedback">
                                Please enter your phone number.
                            </div>
                        </div>



                        <div class="d-block my-3">

                        </div>
                        <hr class="mb-4">
                        <a href="index.jsp" class="btn btn-primary btn-lg btn-block">Cancel</a>
                        <input type="submit" class="btn btn-primary btn-lg btn-block" type="submit" value="Save">
                        <!--<button id="payment-button" class="btn btn-primary btn-lg btn-block">Pay with Khalti</button>-->
                    </form>

                </div>
            </div>


        </div>



    </body>
</html>