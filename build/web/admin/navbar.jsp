<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Ministore</title>
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
    <body data-bs-spy="scroll" data-bs-target="#navbar" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true" tabindex="0">

        <%@include file="svgFile.jsp" %>
        <div class="search-popup">
            <div class="search-popup-container">

                <form role="search" method="get" class="search-form" action="">
                    <input type="search" id="search-form" class="search-field" placeholder="Type and press enter" value="" name="s" required="required"/>
                    <button type="submit" class="search-submit"><svg class="search"><use xlink:href="#search"></use></svg></button>
                </form>

                <h5 class="cat-list-title">Browse Categories</h5>

                <ul class="cat-list">
                    <li class="cat-list-item">
                        <a href="#" title="Mobile Phones">Services</a>
                    </li>
                    <li class="cat-list-item">
                        <a href="#" title="Smart Watches">Bowls</a>
                    </li>
                    <li class="cat-list-item">
                        <a href="#" title="Headphones">Statues</a>
                    </li>
                    <li class="cat-list-item">
                        <a href="#" title="Accessories">Tinghsa Bells</a>
                    </li>
                    <li class="cat-list-item">
                        <a href="#" title="Monitors">Others</a>
                    </li>

                </ul>

            </div>
        </div>



        <header id="header" class="site-header header-scrolled position-fixed text-black bg-light">
            <nav id="header-nav" class="navbar navbar-expand-lg px-3 mb-3">
                <div class="container-fluid">
                    <a class="navbar-brand" href="index.html">
                        <img src="images/logo.png" class="logo">
                    </a>
                    <button class="navbar-toggler d-flex d-lg-none order-3 p-2" type="button" data-bs-toggle="offcanvas" data-bs-target="#bdNavbar" aria-controls="bdNavbar" aria-expanded="false" aria-label="Toggle navigation">
                        <svg class="navbar-icon">
                        <use xlink:href="#navbar-icon"></use>
                        </svg>
                    </button>
                    <div class="offcanvas offcanvas-end" tabindex="-1" id="bdNavbar" aria-labelledby="bdNavbarOffcanvasLabel">
                        <div class="offcanvas-header px-4 pb-0">
                            <a class="navbar-brand" href="index.jsp">
                                <img src="images/logo.png" class="logo">
                            </a>
                            <button type="button" class="btn-close btn-close-black" data-bs-dismiss="offcanvas" aria-label="Close" data-bs-target="#bdNavbar"></button>
                        </div>
                        <div class="offcanvas-body">
                            <ul id="navbar" class="navbar-nav text-uppercase justify-content-end align-items-center flex-grow-1 pe-3">
                                <li class="nav-item">
                                    <a class="nav-link me-4 active" href="home.jsp">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link me-4" href="#company-services">Services</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link me-4" href="#bowls">Bowls</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link me-4" href="#statues">Statues</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link me-4" href="#bells">Tinghsa Bells</a>
                                <li class="nav-item">
                                    <a class="nav-link me-4" href="#latest-blog">Blog</a>
                                </li>


                                <li class="nav-item">
                                    <div class="user-items ps-5">
                                        <ul class="d-flex justify-content-end list-unstyled">
                                            <li class="search-item pe-3">
                                                <a href="#" class="search-button">
                                                    <svg class="search">
                                                    <use xlink:href="#search"></use>
                                                    </svg>
                                                </a>
                                            </li>
                                            <li class="pe-3">
                                                <c:choose>
                                                    <c:when test="${not empty userobj}">
                                                        <a href="../login.jsp" class="fas fa-user">${userobj.username}</a>
                                                        <a data-bs-toggle="modal" data-bs-target="#exampleModal" class="fas fa-sign-in-alt">Logout</a>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <a href="../login.jsp">Login</a>
                                                    </c:otherwise>
                                                </c:choose>
                                            </li>

                                            <li>
                                                <a href="cart.html">
                                                    <svg class="cart">
                                                    <use xlink:href="#cart"></use>
                                                    </svg>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
        </header>
        <!-- Logout -->       
        <!-- Button trigger modal -->

        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel"></h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="text-center">
                            <h4>Do you want to logout??</h4>
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <a href="../Logout" type="button" class="btn btn-primary">Logout</a>
                        </div>
                    </div>
                    <div class="modal-footer">

                    </div>
                </div>
            </div>
        </div>
        <script src="js/jquery-1.11.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" src="js/plugins.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
    </body>
</html> <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel"></h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="text-center">
                            <h4>Do you want to logout??</h4>
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <a href="../Logout" type="button" class="btn btn-primary">Logout</a>
                        </div>
                    </div>
                    <div class="modal-footer">

                    </div>
                </div>
            </div>
        </div>
<%@include file="svgFile.jsp" %>
         <c:if test="${empty userobj}">
            <c:redirect url="./login.jsp" />

        </c:if>