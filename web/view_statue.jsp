<%@page import="com.entity.Statue"%>
<%@page import="com.DAO.StatueDAOImpl"%>
<%@page import="com.entity.User"%>
<%@page import="com.entity.Bowls"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.DAO.BowlDAOImpl"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="author" content="CodeHim">
        <title> Product page </title>

        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Jost:wght@300;400;500&family=Lato:wght@300;400;700&display=swap" rel="stylesheet">
        <!--         script
                ================================================== -->
        <script src="js/modernizr.js"></script>
        <!-- Style CSS -->
        <!--      <link rel="stylesheet" href="./css/style.css">
               Demo CSS (No need to include it into your project) 
              <link rel="stylesheet" href="./css/demo.css">-->
        <!--<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/js/all.min.js" integrity="sha512-naukR7I+Nk6gp7p5TMA4ycgfxaZBJ7MO5iC3Fp6ySQyKFHOGfpkSZkYVWV5R7u7cfAicxanwYQ5D1e17EfJcMA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    </head>
    <body>
        <%@include file="svgFile.jsp" %>
        <%@include file="navbar.jsp" %>
        <%
            User u = (User) session.getAttribute("userobj");
        %>
    <c:if test="${not empty addCart}">
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

    </c:if> 


    <%
        int bid = Integer.parseInt(request.getParameter("bid"));
        StatueDAOImpl dao = new StatueDAOImpl(DBConnect.getConn());
        Statue s = dao.getStatueBy(bid);

    %>
    <!-- content -->
    <section class="py-5">
        <div class="container" style="margin-top: 50px;">
            <div class="row gx-5">
                <aside class="col-lg-6">
                    <div class="border rounded-4 mb-3 d-flex justify-content-center">
                        <a data-fslightbox="mygalley" class="rounded-4" target="_blank" data-type="image" style="width: 416px; height: 276px;" href="https://bootstrap-ecommerce.com/bootstrap5-ecommerce/images/items/detail1/big.webp">
                            <img style="max-width: 100%; max-height: 500px; margin: auto;" class="rounded-4 fit" src="admin/images/statues/<%=s.getImage()%>" />
                        </a>
                    </div>

                    <!-- thumbs-wrap.// -->
                    <!-- gallery-wrap .end// -->
                </aside>
                <main class="col-lg-6">
                    <div class="ps-lg-3">
                        <h4 class="title text-dark">
                            <%=s.getStatue_detail()%>
                        </h4>

                        <div class="mb-3">
                            <span class="h5">Rs. <%=s.getPrice()%></span>
                            <span class="text-muted">/per piece</span>
                        </div>
                        <hr />


                        <!-- col.// -->
                        <div class="col-md-4 col-6 mb-3">
                            
                            <div class="col-md-4 col-6 mb-3">
                                <label class="mb-2 d-block">Quantity</label>
                                <div class="input-group mb-3" style="width: 170px;">
                                    <button class="btn btn-white border border-secondary px-3" type="button" id="decrease-btn" onclick="decreaseValue()" data-mdb-ripple-color="dark">
                                        <i class="fas fa-minus"></i>
                                    </button>
                                    <input id="quantity-input" type="text" class="form-control text-center border border-secondary" name="quantity" value="1" aria-label="Example text with button addon" aria-describedby="button-addon1" />
                                    <button class="btn btn-white border border-secondary px-3" type="button" id="increase-btn" onclick="increaseValue()" data-mdb-ripple-color="dark">
                                        <i class="fas fa-plus"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--<a href="#" class="btn btn-warning shadow-0"> Buy now </a>-->
                    <%if (u == null) {
                    %>
                    <a href="login.jsp" class="btn btn-primary shadow-0"> <i class="me-1 fa fa-shopping-basket"></i> Add to cart </a>
                    <%} else {%>
                    <a href="cartServlet?bid=<%=s.getStatue_id()%>&uid=<%=u.getId()%>&quantity=1" class="btn btn-medium btn-black">Add to Cart</a>
                    <%}
                    %>

                    <hr>
                    <p>
                       
                    </p>
            </div>
            </main>
        </div>
    </div>
</section>
<!-- content -->

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
                            <p>Do you have any queries or suggestions? <a href="mailto:">yourinfo@gmail.com</a>
                            </p>
                            <p>If you need support? Just give us a call. <a href="">+55 111 222 333 44</a>
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