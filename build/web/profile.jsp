<%@page import="com.entity.Order"%>
<%@page import="com.DAO.OrderDAOImpl"%>
<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Dashboard - Seven Chakra Handicraft</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="keywords">
        <meta content="" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

        <!-- Customized Bootstrap Stylesheet -->
        <link href="./admin/css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="./admin/css/style.css" rel="stylesheet">
        <style>
            .container{
                padding-top: 100px;
            }
            .sidebar{
                margin-top: 91px;
            }
            a:hover {
                cursor: pointer; /* Change cursor to pointer */
            }
            .img{
                width: 50px;
                height: 50px;
            }
        </style>
    </head>

    <body>
        <%@include file="navbar1.jsp" %>
        <c:if test="${empty userobj}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <div class="container">
            <!-- Spinner Start -->
            <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
                <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                    <span class="sr-only">Loading...</span>
                </div>
            </div>
            <!-- Spinner End -->


            <!-- Sidebar Start -->
            <div class="sidebar pe-4 pb-3">
                <nav class="navbar bg-light navbar-light">

                    <!--                <div class="d-flex align-items-center ms-4 mb-4">
                                        <div class="position-relative">
                                            <img class="rounded-circle" src="img/user.jpg" alt="" style="width: 40px; height: 40px;">
                                            <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1"></div>
                                        </div>
                                        <div class="ms-3">
                                            <h6 class="mb-0">Jhon Doe</h6>
                                            <span>Admin</span>
                                        </div>
                                    </div>-->
                    <div class="navbar-nav w-100">
                        <a href="home.jsp" class="nav-item nav-link active"><i class="fa fa-tachometer-alt me-2"></i>Dashboard</a>
                        <!--                        <div class="nav-item dropdown">
                                                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Categories</a>
                                                    <div class="dropdown-menu bg-transparent border-0">
                                                        <a href="allBowl.jsp" class="dropdown-item">Singing Bowls</a>
                                                        <a href="typography.html" class="dropdown-item">Statues</a>
                                                        <a href="element.html" class="dropdown-item">Tinghsa Bells</a>
                                                    </div>
                                                </div>
                                                <a href="user.jsp" class="nav-item nav-link"><i class="fa fa-th me-2"></i>Users</a>-->
                        <a href="#container-fluid" class="nav-item nav-link"><i class="fa fa-keyboard me-2"></i>Orders</a>

                    </div>
                </nav>
            </div>
            <!-- Sidebar End -->


            <!-- Content Start -->
            <div class="content">


                <!-- Sale & Revenue Start -->
                <div class="container-fluid pt-4 px-4">
                    <div class="row g-4">
                        <div class="col-sm-6 col-xl-3">
                            <div class="bg-light rounded d-flex align-items-center justify-content-between p-4">

                                <div class="ms-3">
                                    <%
                                        User u1 = (User) session.getAttribute("userobj");
                                    %>
                                    
                                    <p class="mb-2">Personal Profile | <a href="profileEdit.jsp?email=<%=u1.getEmail()%>" class="" color="black" > Edit</a></p>
                                    <h6 class="mb-0">Username: <%=u1.getUsername()%></h6>
                                    <h6 class="mb-0">Email: <%=u1.getEmail()%></h6>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-xl-3">
                            <div class="bg-light rounded d-flex align-items-center justify-content-between p-4">

                                <div class="ms-3">
                                    <p class="mb-2">Address Book | <a class="" color="black" > Edit</a> </p> 
                                    <h6 class="mb-0">Address: <%=u1.getAddress()%></h6> 
                                    <h6 class="mb-0">Phone number: <%=u1.getPhone()%></h6> 
                                </div>
                            </div>
                        </div>
                        <!-- Sale & Revenue End -->


                        <!-- Sales Chart Start -->
                        <!-- <div class="container-fluid pt-4 px-4">
                            <div class="row g-4">
                                <div class="col-sm-12 col-xl-6">
                                    <div class="bg-light text-center rounded p-4">
                                        <div class="d-flex align-items-center justify-content-between mb-4">
                                            <h6 class="mb-0">Worldwide Sales</h6>
                                            <a href="">Show All</a>
                                        </div>
                                        <canvas id="worldwide-sales"></canvas>
                                    </div>
                                </div>
                                <div class="col-sm-12 col-xl-6">
                                    <div class="bg-light text-center rounded p-4">
                                        <div class="d-flex align-items-center justify-content-between mb-4">
                                            <h6 class="mb-0">Salse & Revenue</h6>
                                            <a href="">Show All</a>
                                        </div>
                                        <canvas id="salse-revenue"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div> -->
                        <!-- Sales Chart End -->


                        <!-- Recent Sales Start -->
                        <div class="container-fluid pt-4 px-4">
                            <div class="bg-light text-center rounded p-4">
                                <div class="d-flex align-items-center justify-content-between mb-4">
                                    <h6 class="mb-0">Recent Orders</h6>
                                    <a href="">Show All</a>
                                </div>
                                <div class="responsive">
                                    <table class="table text-start align-middle table-bordered table-hover mb-0">
                                        <thead>
                                            <tr class="text-dark">

                                                <th scope="col">S.no.</th>
                                                <th scope="col">Order Id</th>
                                                <th scope="col">Date</th>
                                                <th scope="col">Image</th>
                                                <th scope="col">Product</th>
                                                <th scope="col">Amount</th>
                                                <th scope="col">Customer Name</th>
                                                <th scope="col">Username</th>
                                                <th scope="col">Email</th>
                                                <th scope="col">Phone Number</th>
                                                <th scope="col">Address</th>
                                                <th scope="col">Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                User u = (User) session.getAttribute("userobj");
                                                OrderDAOImpl dao = new OrderDAOImpl(DBConnect.getConn());
                                                List<Order> list = dao.getOrder(u.getEmail());
                                                int i = 1;
                                                for (Order o : list) {%>
                                            <tr>
                                                <td><%=i%></td>
                                                <td><%=o.getOrder_id()%></td>
                                                <td><%=o.getDate()%></td>
                                                <td>INV-<img src="admin/images/<%=o.getImage()%>" alt="product-item" class="img"></td>
                                                <td><%=o.getProduct_name()%></td>
                                                <td><%=o.getPrice()%></td>
                                                <td><%=o.getFirst_name()%> <%=o.getLast_name()%></td>
                                                <td><%=o.getUsername()%> </td>
                                                <td><%=o.getEmail()%> </td>
                                                <td><%=o.getPhone()%> </td>
                                                <td><%=o.getAddress()%> </td>
                                                <td><%=o.getStatus()%> </td>
                                                
                                            </tr>
                                            
                                            <% i++;}
                                            %>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!-- Recent Sales End -->


                    </div>

                    <!-- JavaScript Libraries -->
                    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
                    <script src="lib/chart/chart.min.js"></script>
                    <script src="lib/easing/easing.min.js"></script>
                    <script src="lib/waypoints/waypoints.min.js"></script>
                    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
                    <script src="lib/tempusdominus/js/moment.min.js"></script>
                    <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
                    <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

                    <!-- Template Javascript -->
                    <script src="./admin/js/main.js"></script>

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

                    <!--JavaScript Libraries--> 
                    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
                    <script src="lib/chart/chart.min.js"></script>
                    <script src="lib/easing/easing.min.js"></script>
                    <script src="lib/waypoints/waypoints.min.js"></script>
                    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
                    <script src="lib/tempusdominus/js/moment.min.js"></script>
                    <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
                    <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

                    <!-- Template Javascript -->
                    <script src="./admin/js/main.js"></script>
                    </body>

                    </html>