<%@page import="com.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.Bowls"%>
<%@page import="com.DAO.BowlDAOImpl"%>
<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
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

        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@300;400;500&family=Lato:wght@300;400;700&display=swap" rel="stylesheet">
        <!--         script
                ================================================== -->
        <script src="js/modernizr.js"></script>
    </head>
    <body data-bs-spy="scroll" data-bs-target="#navbar" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true" tabindex="0">

        <%@include file="svgFile.jsp" %>
    </script>
    <div class="search-popup">
        <div class="search-popup-container">

            <form role="search" method="post" class="search-form" action="search.jsp">
                <input type="search" id="search-form" class="search-field" placeholder="Type and press enter" value="" name="ch" />
                <button type="submit" class="search-submit"><svg class="search"><use xlink:href="#search"></use></svg></button>
            </form>

            <h5 class="cat-list-title">Browse Categories</h5>

            <ul class="cat-list">
<!--                <li class="cat-list-item">
                    <a href="#" title="Mobile Phones">Services</a>
                </li>-->
                <li class="cat-list-item">
                    <a href="allBowl.jsp" title="Smart Watches">Singing Bowls</a>
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
                <a class="navbar-brand" href="index.jsp">
                    <img src="admin/images/logo.png" class="logo">
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
                                <a class="nav-link me-4 active" href="index.jsp">Home</a>
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

<!--                                                        <li class="nav-item dropdown">
                                                            <a class="nav-link me-4 dropdown-toggle link-dark" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Pages</a>
                                                            <ul class="dropdown-menu">
                                                                <li>
                                                                    <a href="about.html" class="dropdown-item">About</a>
                                                                </li>
                                                                <li>
                                                                    <a href="blog.html" class="dropdown-item">Blog</a>
                                                                </li>
                                                                <li>
                                                                    <a href="shop.html" class="dropdown-item">Shop</a>
                                                                </li>
                                                                <li>
                                                                    <a href="cart.html" class="dropdown-item">Cart</a>
                                                                </li>
                                                                <li>
                                                                    <a href="checkout.html" class="dropdown-item">Checkout</a>
                                                                </li>
                                                                <li>
                                                                    <a href="single-post.html" class="dropdown-item">Single Post</a>
                                                                </li>
                                                                <li>
                                                                    <a href="single-product.html" class="dropdown-item">Single Product</a>
                                                                </li>
                                                                <li>
                                                                    <a href="contact.html" class="dropdown-item">Contact</a>
                                                                </li>
                                                            </ul>
                                                        </li> -->


                            <li class="nav-item">
                                <div class="user-items ps-5">
                                    <ul class="d-flex justify-content-end list-unstyled">
                                        <li class="nav-item dropdown"">
                                            <a href="#" class="search-button">
                                                <svg class="search">
                                                <use xlink:href="#search"></use>
                                                </svg>
                                            </a>
                                        </li>
                                        <c:if test="${not empty userobj}">

                                            <li class="nav-item dropdown">
                                                <a class="nav-link me-4 dropdown-toggle link-dark" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false"> ${userobj.username}</a>

                                                <ul class="dropdown-menu">
                                                    <li>
                                                        <a href="profile.jsp" class="dropdown-item">Profile</a>
                                                    </li>
                                                    <li>
                                                        <a href="Logout" class="dropdown-item">Logout</a>
                                                    </li>
                                                </ul>
                                            <li>
                                                <a href="cart.jsp">
                                                    <svg class="cart">
                                                    <use xlink:href="#cart"></use>
                                                    </svg>
                                                </a>
                                            </li>
                                        </c:if>

                                        <c:if test="${ empty userobj}">
                                            <li class="pe-3">
                                                <a href="login.jsp">
                                                    <svg class="user">
                                                    <use xlink:href="#user"></use>
                                                    </svg>
                                                </a>
                                            </li>
                                            <li>
                                            <a href="login.jsp">
                                                <svg class="cart">
                                                <use xlink:href="#cart"></use>
                                                </svg>
                                            </a>
                                        </li>
                                            </c:if>
                                        
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
    <script type="text/javascript" src="js/plugins.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
</body>
</html>