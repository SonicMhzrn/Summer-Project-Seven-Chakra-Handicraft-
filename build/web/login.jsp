<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%--<%@ page session="false"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Seven Chakra</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="format-detection" content="telephone=no">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="author" content="">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@300;400;500&family=Lato:wght@300;400;700&display=swap" rel="stylesheet">
        <!-- script
        ================================================== -->
        <script src="js/modernizr.js"></script>
    </head>
    <%@include file="svgFile.jsp" %>
    <%@include file="navbar1.jsp" %>


    <div class="containerl">
        <div class="login form1">
            <header>Login</header>
            <c:if test="${not empty failMsg}">
            <p class="text-center text-danger">${failMsg}</p> 
                <c:remove var="failMsg" scope="session"/>
            </c:if>
            <c:if test="${not empty succMsg}">
            <p class="text-center text-success">${succMsg}</p> 
                <c:remove var="succMsg" scope="session"/>
            </c:if>
            <form method="post" action="login">
                <input type="text" name="email" placeholder="Enter your email">
                <input type="password" name="password" placeholder="Enter your password">
                <input type="submit" class="button" value="Login">
            </form>
            <div class="signup">
                <span class="signup">Don't have an account?
                    <a href="register.jsp">Signup</a>
                </span>
            </div>
        </div>
    </body>
</html>