<%@page import="com.entity.Products"%>
<%@page import="com.DAO.ProductDAOImpl"%>
<%@page import="com.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.Bowls"%>
<%@page import="com.entity.Bowls"%>
<%@page import="com.DAO.BowlDAOImpl"%>
<%@page import="com.db.DBConnect"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Bowls</title>
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
        <style>
            .container{
                padding-top: 100px;
            }
        </style>
 
    </head>
    <body class="bproduct" data-bs-spy="scroll" data-bs-target="#navbar" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true" tabindex="0">
        <%@include file="svgFile.jsp" %>
        <%@include file="navbar1.jsp" %>
        <%
            User u = (User) session.getAttribute("userobj");
        %>
        <c:if test="${not empty addCart}">
            <div id="toast">${addCart}</div>

<!--            <script type="text/javascript">
                showToast();
                function showToast(content)
                {
                    $('#toast').addClass("display");
                    $('#toast').html(content);
                    setTimeout(() => {
                        $("#toast").removeClass("display");
                    }, 2000)
                }
            </script>-->

        </c:if>
        <section style="background-color: #eee;">
            <div class="text-center container py-8">
                <h4 class="mt-4 mb-5"><strong>Products</strong></h4>

                <div class="row">

                    <%
                        String ch = request.getParameter("ch");
                        ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
                        List<Products> list = dao.getProductBySearch(ch);
                        for (Products b : list) {%>
                    <div class="col-lg-4 col-md-12 mb-4">
                        <div class="card">
                            <div class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
                                 data-mdb-ripple-color="light">
                                <img src="admin/images/<%=b.getImage()%>"
                                     class="object-fit-cover" style="height: 400px; width: 100%; object-fit: cover;" />
                                <div class="cart-concern position-absolute">
                                    <div class="cart-button d-flex">
                                       
                                    </div>
                                </div>
                                <!--                                                                        <div class="mask">
                                                                                                            <div class="d-flex justify-content-start align-items-end h-100">
                                                                                                                <h5><span class="badge bg-primary ms-2">New</span></h5>
                                                                                                            </div>
                                                                                                        </div>-->
                                </a>
                            </div>
                            <div class="card-body">
                                <a href="" class="text-reset">
                                    <h5 class="card-title mb-3"><%=b.getP_detail()%></h5>
                                </a>
                                 <%if (u == null) {
                                        %>
                                        <a href="login.jsp" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%} else {%>
                                        <a href="cartServlet?bid=<%=b.getP_id()%>&&uid=<%=u.getId()%>" class="btn btn-medium btn-black">Add to Cart</a>
                                            <%}
                                            %>
                                <h6 class="mb-3">Rs. <%=b.getPrice()%></h6>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    %>



                </div>
            </div>
        </section>
       <%@include file="footer.jsp" %>
    </body>
</html>