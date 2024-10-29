<%@page import="com.entity.Products"%>
<%@page import="com.DAO.ProductDAOImpl"%>
<%@page import="com.entity.Statue"%>
<%@page import="com.DAO.StatueDAOImpl"%>
<%@page import="com.entity.Cart"%>
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
        <style>
            .img-resize{
                height: 400px;
                object-fit: cover;
            }
        </style>
    </head>
    <body data-bs-spy="scroll" data-bs-target="#navbar" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true" tabindex="0">

        <%@include file="svgFile.jsp" %>
        <%@include file="navbar.jsp" %>
        <%
            User u = (User) session.getAttribute("userobj");
        %>
        <div id="toast">${addCart}</div>

        <script type="text/javascript">
            showToast();
            function showToast(content)
            {
                $('#toast').addClass("display");
                $('#toast').html(content);
                setTimeout(() => {
                    $("#toast").removeClass("display");
                }, 2000)
            }
        </script>


        <section id="billboard" class="position-relative overflow-hidden bg-light-blue">
            <div class="swiper main-swiper">
                <div class="swiper-wrapper">
                    <div class="swiper-slide">
                        <div class="container">
                            <div class="row d-flex align-items-center">
                                <div class="col-md-6">
                                    <div class="banner-content">
                                        <h1 class="display-2 text-uppercase text-dark pb-5">Jambati Singing Bowl</h1>
                                        <a href="allBowl.jsp" class="btn btn-medium btn-dark text-uppercase btn-rounded-none">Shop Product</a>
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="image-holder">
                                        <img src="images/bowl/jambati_1400x.png" alt="banner">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="swiper-slide">
                        <div class="container">
                            <div class="row d-flex flex-wrap align-items-center">
                                <div class="col-md-6">
                                    <div class="banner-content">
                                        <h1 class="display-2 text-uppercase text-dark pb-5">Thadobati Singing Bowl</h1>
                                        <a href="allBowl.jsp" class="btn btn-medium btn-dark text-uppercase btn-rounded-none">Shop Product</a>
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="image-holder">
                                        <img src="images/bowl/picture.jpg" alt="banner">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="swiper-icon swiper-arrow swiper-arrow-prev">
                <svg class="chevron-left">
                <use xlink:href="#chevron-left" />
                </svg>
            </div>
            <div class="swiper-icon swiper-arrow swiper-arrow-next">
                <svg class="chevron-right">
                <use xlink:href="#chevron-right" />
                </svg>
            </div>
        </section>

        <section id="company-services" class="padding-large">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 pb-3">
                        <div class="icon-box d-flex">
                            <div class="icon-box-icon pe-3 pb-3">
                                <svg class="cart">
                                <use xlink:href="#cart" />
                                </svg>
                            </div>
                            <div class="icon-box-content">
                                <h3 class="card-title text-uppercase text-dark">Free delivery</h3>
                                <p>Free delivery services with any order.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 pb-3">
                        <div class="icon-box d-flex">
                            <div class="icon-box-icon pe-3 pb-3">
                                <svg class="wrench">
                                <use xlink:href="#wrench" />
                                </svg>
                            </div>
                            <div class="icon-box-content">
                                <h3 class="card-title text-uppercase text-dark">Customization and Personalization</h3>
                                <p>Personalize the Singing bowl with preferred chakra and pattern.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 pb-3">
                        <div class="icon-box d-flex">
                            <div class="icon-box-icon pe-3 pb-3">
                                <svg class="brush">
                                <use xlink:href="#brush" />
                                </svg>
                            </div>
                            <div class="icon-box-content">
                                <h3 class="card-title text-uppercase text-dark">Cleaning and Polishing</h3>
                                <p>Cleaning and Polishing service to clean old singing bowls and statues. </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 pb-3">
                        <div class="icon-box d-flex">
                            <div class="icon-box-icon pe-3 pb-3">
                                <svg class="book">
                                <use xlink:href="#book" />
                                </svg>
                            </div>
                            <div class="icon-box-content">
                                <h3 class="card-title text-uppercase text-dark">Educational Resource</h3>
                                <p>Provide information related to singing bowls, statues and bowls.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Bowls -->
        <section id="bowls" class="product-store position-relative padding-large no-padding-top">
            <div class="container">
                <div class="row">
                    <div class="display-header d-flex justify-content-between pb-3">
                        <h2 class="display-7 text-dark text-uppercase">Bowls</h2>
                        <div class="btn-right">
                            <a href="allBowl.jsp" class="btn btn-medium btn-normal text-uppercase">View More</a>
                        </div>
                    </div>
                    <div class="swiper product-swiper">
                        <div class="swiper-wrapper">

                            <% ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
                                Cart c = new Cart();
                                List<Products> list = dao.getBowls();
                                for (Products b : list) {%>
                            <div class="swiper-slide">
                                <div class="product-card position-relative">
                                    <div class="image-holder">
                                        <img src="admin/images/<%=b.getImage()%>" alt="product-item" class="img-fluid">
                                    </div>
                                    <div class="cart-concern position-absolute">
                                        <div class="cart-button d-flex">
                                            <%if (u == null) {
                                            %>
                                            <a href="login.jsp" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%} else {%>
                                            <a href="cartServlet?bid=<%=b.getP_id()%>&uid=<%=u.getId()%>&quantity=1" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%}
                                            %>
                                        </div>
                                    </div>
                                    <div class="card-detail d-flex justify-content-between align-items-baseline pt-3">
                                        <h3 class="card-title text-uppercase">
                                            <a href="view_product.jsp?bid=<%=b.getP_id()%>"><%=b.getP_detail()%></a>
                                        </h3>
                                        <span class="item-price text-primary">Rs.<%=b.getPrice()%></span>
                                    </div>
                                </div>
                            </div>
                            <%
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>
            <div class="swiper-pagination position-absolute text-center"></div>
        </section>

        <section id="statues" class="product-store position-relative padding-large no-padding-top">
            <div class="container">
                <div class="row">
                    <div class="display-header d-flex justify-content-between pb-3">
                        <h2 class="display-7 text-dark text-uppercase">Statues</h2>
                        <div class="btn-right">
                            <a href="allStatue.jsp" class="btn btn-medium btn-normal text-uppercase">View More</a>
                        </div>
                    </div>
                    <div class="swiper product-swiper">
                        <div class="swiper-wrapper">
                            <% ProductDAOImpl dao2 = new ProductDAOImpl(DBConnect.getConn());
                                Cart c2 = new Cart();
                                List<Products> list2 = dao2.getStatues();
                                for (Products b : list2) {%>
                            <div class="swiper-slide">
                                <div class="product-card position-relative">
                                    <div class="image-holder">
                                        <img src="admin/images/<%=b.getImage()%>" alt="product-item" class="img-fluid" style="object-fit: cover">
                                    </div>
                                    <div class="cart-concern position-absolute">
                                        <div class="cart-button d-flex">
                                            <%if (u == null) {
                                            %>
                                            <a href="login.jsp" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%} else {%>
                                            <a href="cartServlet?bid=<%=b.getP_id()%>&uid=<%=u.getId()%>&quantity=1" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%}
                                            %>
                                        </div>
                                    </div>
                                    <div class="card-detail d-flex justify-content-between align-items-baseline pt-3">
                                        <h3 class="card-title text-uppercase">
                                            <a href="view_statue.jsp?bid=<%=b.getP_id()%>"><%=b.getP_detail()%></a>
                                        </h3>
                                        <span class="item-price text-primary">Rs.<%=b.getPrice()%></span>
                                    </div>
                                </div>
                            </div>
                            <%
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>
            <div class="swiper-pagination position-absolute text-center"></div>
        </section>

        <section id="bells" class="product-store padding-large position-relative">
            <div class="container">
                <div class="row">
                    <div class="display-header d-flex justify-content-between pb-3">
                        <h2 class="display-7 text-dark text-uppercase">Tinghsa Bells</h2>
                        <div class="btn-right">
                            <a href="allBell.jsp" class="btn btn-medium btn-normal text-uppercase">View More</a>
                        </div>
                    </div>
                    <div class="swiper product-watch-swiper">
                        <div class="swiper-wrapper">
                            <% ProductDAOImpl dao3 = new ProductDAOImpl(DBConnect.getConn());
                                Cart c3 = new Cart();
                                List<Products> list3 = dao2.getBells();
                                for (Products b : list3) {%>
                            <div class="swiper-slide">
                                <div class="product-card position-relative">
                                    <div class="image-holder">
                                        <img src="admin/images/<%=b.getImage()%>" alt="product-item" class="img-fluid" style="object-fit: cover">
                                    </div>
                                    <div class="cart-concern position-absolute">
                                        <div class="cart-button d-flex">
                                            <%if (u == null) {
                                            %>
                                            <a href="login.jsp" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%} else {%>
                                            <a href="cartServlet?bid=<%=b.getP_id()%>&uid=<%=u.getId()%>&quantity=1" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%}
                                            %>
                                        </div>
                                    </div>
                                    <div class="card-detail d-flex justify-content-between align-items-baseline pt-3">
                                        <h3 class="card-title text-uppercase">
                                            <a href="view_statue.jsp?bid=<%=b.getP_id()%>"><%=b.getP_detail()%></a>
                                        </h3>
                                        <span class="item-price text-primary">Rs.<%=b.getPrice()%></span>
                                    </div>
                                </div>
                            </div>
                            <%
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>
            <div class="swiper-pagination position-absolute text-center"></div>
        </section>


        <!-- <section id="yearly-sale" class="bg-light-blue overflow-hidden mt-5 padding-xlarge" style="background-image: url('images/single-image1.png');background-position: right; background-repeat: no-repeat;">
          <div class="row d-flex flex-wrap align-items-center">
            <div class="col-md-6 col-sm-12">
              <div class="text-content offset-4 padding-medium">
                <h3>10% off</h3>
                <h2 class="display-2 pb-5 text-uppercase text-dark">New year sale</h2>
                <a href="shop.html" class="btn btn-medium btn-dark text-uppercase btn-rounded-none">Shop Sale</a>
              </div>
            </div>
            <div class="col-md-6 col-sm-12">
              
            </div>
          </div>
        </section> -->
        <!-- <section id="latest-blog" class="padding-large">
          <div class="container">
            <div class="row">
              <div class="display-header d-flex justify-content-between pb-3">
                <h2 class="display-7 text-dark text-uppercase">Latest Posts</h2>
                <div class="btn-right">
                  <a href="blog.html" class="btn btn-medium btn-normal text-uppercase">Read Blog</a>
                </div>
              </div>
              <div class="post-grid d-flex flex-wrap justify-content-between">
                <div class="col-lg-4 col-sm-12">
                  <div class="card border-none me-3">
                    <div class="card-image">
                      <img src="images/post-item1.jpg" alt="" class="img-fluid">
                    </div>
                  </div>
                  <div class="card-body text-uppercase">
                    <div class="card-meta text-muted">
                      <span class="meta-date">feb 22, 2023</span>
                      <span class="meta-category">- Gadgets</span>
                    </div>
                    <h3 class="card-title">
                      <a href="#">Get some cool gadgets in 2023</a>
                    </h3>
                  </div>
                </div>
                <div class="col-lg-4 col-sm-12">
                  <div class="card border-none me-3">
                    <div class="card-image">
                      <img src="images/post-item2.jpg" alt="" class="img-fluid">
                    </div>
                  </div>
                  <div class="card-body text-uppercase">
                    <div class="card-meta text-muted">
                      <span class="meta-date">feb 25, 2023</span>
                      <span class="meta-category">- Technology</span>
                    </div>
                    <h3 class="card-title">
                      <a href="#">Technology Hack You Won't Get</a>
                    </h3>
                  </div>
                </div>
                <div class="col-lg-4 col-sm-12">
                  <div class="card border-none me-3">
                    <div class="card-image">
                      <img src="images/post-item3.jpg" alt="" class="img-fluid">
                    </div>
                  </div>
                  <div class="card-body text-uppercase">
                    <div class="card-meta text-muted">
                      <span class="meta-date">feb 22, 2023</span>
                      <span class="meta-category">- Camera</span>
                    </div>
                    <h3 class="card-title">
                      <a href="#">Top 10 Small Camera In The World</a>
                    </h3>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section> -->


        <section id="testimonials" class="position-relative mb-5">
            <div class="container">
                <div class="row">
                    <div class="review-content position-relative">
                        <div class="swiper-icon swiper-arrow swiper-arrow-prev position-absolute d-flex align-items-center">
                            <svg class="chevron-left">
                            <use xlink:href="#chevron-left" />
                            </svg>
                        </div>
                        <div class="swiper testimonial-swiper">
                            <div class="quotation text-center">
                                <svg class="quote">
                                <use xlink:href="#quote" />
                                </svg>
                            </div>
                            <div class="swiper-wrapper">
                                <div class="swiper-slide text-center d-flex justify-content-center">
                                    <div class="review-item col-md-10">
                                        <i class="icon icon-review"></i>
                                        <blockquote>If you looking for a place with a really good handicrafts works, like singing bowls, this is the place! Good quality, price and service. Bibek is a really professional seller, with all the patient to help you with your purchase. I really appreciate all your help and I really happy with my purchase of seven chakras sound healing set! Beautiful work and price.</blockquote>
                                        <div class="rating">
                                            <svg class="star star-fill">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-fill">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-fill">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-half">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-empty">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                        </div>
                                        <div class="author-detail">
                                            <div class="name text-dark text-uppercase pt-2">Paola Alfonso</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="swiper-slide text-center d-flex justify-content-center">
                                    <div class="review-item col-md-10">
                                        <i class="icon icon-review"></i>
                                        <blockquote>The best place to buy Your singing bowls! They are well tuned, the guys in the store are honest and helpful! Price is also the best one around everywhere! Highly recommended!</blockquote>
                                        <div class="rating">
                                            <svg class="star star-fill">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-fill">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-fill">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-half">
                                            <use xlink:href="#star-fill"></use>
                                            </svg>
                                            <svg class="star star-empty">
                                            <use xlink:href="#star-half"></use>
                                            </svg>
                                        </div>
                                        <div class="author-detail">
                                            <div class="name text-dark text-uppercase pt-2">Lilla Hegedüs</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="swiper-icon swiper-arrow swiper-arrow-next position-absolute d-flex align-items-center">
                            <svg class="chevron-right">
                            <use xlink:href="#chevron-right" />
                            </svg>
                        </div>
                    </div>
                </div>
            </div>
            <div class="swiper-pagination"></div>
        </section>


        <!-- Footer -->
        <footer id="footer" class="overflow-hidden">
            <div class="container">
                <div class="row">
                    <div class="footer-top-area">
                        <div class="row d-flex flex-wrap justify-content-between">
                            <div class="col-lg-3 col-sm-6 pb-3">
                                <div class="footer-menu">
                                    <img src="admin/images/logo.png" alt="logo">
                                    <p>Nisi, purus vitae, ultrices nunc. Sit ac sit suscipit hendrerit. Gravida massa volutpat aenean odio erat nullam fringilla.</p>
                                    <div class="social-links">
                                        <ul class="d-flex list-unstyled">
                                            <li>
                                                <a href="#">
                                                    <svg class="facebook">
                                                    <use xlink:href="#facebook" />
                                                    </svg>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <svg class="instagram">
                                                    <use xlink:href="#instagram" />
                                                    </svg>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <svg class="twitter">
                                                    <use xlink:href="#twitter" />
                                                    </svg>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <svg class="linkedin">
                                                    <use xlink:href="#linkedin" />
                                                    </svg>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <svg class="youtube">
                                                    <use xlink:href="#youtube" />
                                                    </svg>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-2 col-sm-6 pb-3">
                                <div class="footer-menu text-uppercase">
                                    <h5 class="widget-title pb-2">Quick Links</h5>
                                    <ul class="menu-list list-unstyled text-uppercase">
                                        <li class="menu-item pb-2">
                                            <a href="#">Home</a>
                                        </li>
                                        <li class="menu-item pb-2">
                                            <a href="#">About</a>
                                        </li>
                                        <li class="menu-item pb-2">
                                            <a href="#">Shop</a>
                                        </li>
                                        <li class="menu-item pb-2">
                                            <a href="#">Blogs</a>
                                        </li>
                                        <!-- <li class="menu-item pb-2">
                                          <a href="#">Contact</a>
                                        </li> -->
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6 pb-3">
                                <div class="footer-menu text-uppercase">
                                    <h5 class="widget-title pb-2">Help & Info Help</h5>
                                    <ul class="menu-list list-unstyled">
                                        <!-- <li class="menu-item pb-2">
                                          <a href="#">Track Your Order</a>
                                        </li>
                                        <li class="menu-item pb-2">
                                          <a href="#">Returns Policies</a>
                                        </li>
                                        <li class="menu-item pb-2">
                                          <a href="#">Shipping + Delivery</a>
                                        </li> -->
                                        <li class="menu-item pb-2">
                                            <a href="#">Contact Us</a>
                                        </li>
                                        <li class="menu-item pb-2">
                                            <a href="#">Faqs</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6 pb-3">
                                <div class="footer-menu contact-item">
                                    <h5 class="widget-title text-uppercase pb-2">Contact Us</h5>
                                    <p>Do you have any queries or suggestions? <a href="mailto:">bibekthapa@gmail.com</a>
                                    </p>
                                    <p>If you need support? Just give us a call. <a href="">+977 956412370</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <hr>
        </footer>
        <div id="footer-bottom">
            <div class="container">
                <div class="row d-flex flex-wrap justify-content-between">
                    <!-- <div class="col-md-4 col-sm-6">
                      <div class="Shipping d-flex">
                        <p>We ship with:</p>
                        <div class="card-wrap ps-2">
                          <img src="images/dhl.png" alt="visa">
                          <img src="images/shippingcard.png" alt="mastercard">
                        </div>
                      </div>
                    </div> -->
                    <!-- <div class="col-md-4 col-sm-6">
                      <div class="payment-method d-flex">
                        <p>Payment options:</p>
                        <div class="card-wrap ps-2">
                          <img src="images/visa.jpg" alt="visa">
                          <img src="images/mastercard.jpg" alt="mastercard">
                          <img src="images/paypal.jpg" alt="paypal">
                        </div>
                      </div>
                    </div> -->
                    <!-- <div class="col-md-4 col-sm-6">
                      <div class="copyright">
                        <p>© Copyright 2023 MiniStore. Design by <a href="https://templatesjungle.com/">TemplatesJungle</a> Distribution by <a href="https://themewagon.com">ThemeWagon</a>
                        </p>
                      </div>
                    </div> -->
                </div>
            </div>
        </div>  
    </body>
</html>