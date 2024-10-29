<%-- 
    Document   : add_bowl
    Created on : Feb 1, 2024, 1:09:37 PM
    Author     : Dell
--%>
<%@page import="java.util.List"%>
<%@page import="com.entity.Bowls"%>
<%@page import="com.DAO.BowlDAOImpl"%>
<%@page import="com.db.DBConnect"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body class="addbowl" style="background-color: #f0f2f2;">
        <%@include file="svgFile.jsp" %>
        <c:if test="${empty userobj}">
            <c:redirect url="login.jsp" />

        </c:if>
        <div class="container-xxl position-relative bg-white d-flex p-0">
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
                    <a href="home.jsp" class="navbar-brand mx-4 mb-3">
                        <h3 class="text-primary"><i class="fa fa-hashtag me-2"></i>Seven Chakra <br>Handicraft</h3>
                    </a>
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
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-boxes me-2"></i>Categories</a>
                            <div class="dropdown-menu bg-transparent border-0">
                                <a href="allBowl.jsp" class="dropdown-item">Singing Bowls</a>
                                <a href="allStatue.jsp" class="dropdown-item">Statues</a>
                                <a href="allBell.jsp" class="dropdown-item">Tinghsa Bells</a>
                            </div>
                        </div>
                        <a href="user.jsp" class="nav-item nav-link"><i class="fa fa-users me-2"></i>Users</a>
                        <a href="orders.jsp" class="nav-item nav-link"><i class="fa fa-box-open me-2"></i>Orders</a>

                    </div>
                </nav>
            </div>
            <!-- Sidebar End -->


            <!-- Content Start -->
            <div class="content">
                <!-- Navbar Start -->
                <nav class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0">
                    <a href="home.jsp" class="navbar-brand d-flex d-lg-none me-4">
                        <h2 class="text-primary mb-0"><i class="fa fa-hashtag"></i></h2>
                    </a>
                    <a href="#" class="sidebar-toggler flex-shrink-0">
                        <i class="fa fa-bars"></i>
                    </a>

                    <div class="navbar-nav align-items-center ms-auto">
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                                <img class="rounded-circle me-lg-2" src="img/user.jpg" alt="" style="width: 40px; height: 40px;">
                                <span class="d-none d-lg-inline-flex">Admin</span>
                            </a>
                            <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
                                <a href="#" class="dropdown-item">Log Out</a>
                            </div>
                        </div>
                    </div>
                </nav>
                <!-- Navbar End -->

                <!-- Form Start -->
                <div class="container-fluid pt-4 px-4">
                    <div class="row g-4">

                        <div class="col-sm-12 col-xl-6">
                            <div class="bg-light rounded h-100 p-4">
                                <h6 class="mb-4">Add Bowl</h6>
                                <c:if test="${not empty succMsg}">
                                    <p class="text-center text-success">${succMsg}</p> 
                                    <c:remove var="succMsg" scope="session"/>
                                </c:if> 

                                <c:if test="${not empty failMsg}">
                                    <p class="text-center text-danger">${failMsg}</p> 
                                    <c:remove var="failMsg" scope="session"/>
                                </c:if>
                                <form method="post" action="../add_bowl" enctype="multipart/form-data">
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label">Bowl Type*</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control"  name="bname" required="required">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label">Price*</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="price" required="required">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label">Diameter*</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="diameter" required="required">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label">Made By*</label>
                                        <div class="col-sm-10">
                                            <select name="made" class="form-select form-select-lg mb-3" aria-label=".form-select-sm example">
                                                <option disabled selected>--select--</option>
                                                <option value="Handmade">Hand</option>
                                                <option value="Machine">Machine</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label">Chakra</label>
                                        <div class="col-sm-10">
                                            <input type="text" class="form-control" name="chakra" required="required">
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label">Key Note*</label>
                                        <div class="col-sm-10">
                                            <select name="note" class="form-select form-select-lg mb-3" required="required">
                                                <option value="" disabled selected>--select--</option>
                                                <option value="A">A</option>
                                                <option value="B">B</option>
                                                <option value="C">C</option>
                                                <option value="D">D</option>
                                                <option value="E">E</option>
                                                <option value="F">F</option>
                                                <option value="G">G</option> 
                                            </select>
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label" name="bimg">Upload Photo:</label>
                                        <div class="col-sm-10">

                                            <!--<input class="form-control" type="file" id="formFile" onchange="previewImage(event)">-->
                                            <input type="file" name="bimg" required="required" class="form-control" id="formFile" accept="image/*" onchange="previewImage(event)">
                                            <!--                                            <div class="col-md-6">
                                                                                        <div id="imagePreview" ></div>
                                                                                    </div>
                                                                                    <script>
                                                                                        function previewImage(event) {
                                                                                            var input = event.target;
                                                                                            var preview = document.getElementById('imagePreview');
                                            
                                                                                            while (preview.firstChild) {
                                                                                                preview.removeChild(preview.firstChild);
                                                                                            }
                                            
                                                                                            var files = input.files;
                                                                                            for (var i = 0; i < files.length; i++) {
                                                                                                var file = files[i];
                                            
                                                                                                if (file.type.match('image.*')) {
                                                                                                    var reader = new FileReader();
                                            
                                                                                                    reader.onload = function (e) {
                                                                                                        var img = document.createElement('img');
                                                                                                        img.src = e.target.result;
                                                                                                        img.className = 'preview-image';
                                                                                                        preview.appendChild(img);
                                                                                                    };
                                            
                                                                                                    reader.readAsDataURL(file);
                                                                                                } else {
                                                                                                    alert('Invalid file type. Please select an image.');
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    </script>-->
                                        </div>
                                    </div>
                                    <div class="row mb-3">
                                        <label for="" class="col-sm-2 col-form-label">Status*</label>
                                        <div class="col-sm-10">
                                            <select name="status" class="form-select form-select-lg mb-3" aria-label=".form-select-sm example">
                                                <option value="" disabled selected>--select--</option>
                                                <option value="Active">Active</option>
                                                <option value="Inactive">Inactive</option>
                                            </select>
                                        </div>
                                    </div>
                                    <input type="submit" class="btn btn-primary" name="submit">
                                </form>
                            </div>
                        </div>

                    </div>
                </div>
                <!-- Form End -->




                <!-- Back to Top -->
                <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
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
            <script src="js/main.js"></script>




    </body>
</html>
