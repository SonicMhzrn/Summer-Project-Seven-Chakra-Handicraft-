<%-- 
    Document   : cart.jsp
    Created on : Feb 19, 2024, 1:01:34 PM
    Author     : Dell
--%>

<%@page import="com.entity.User"%>
<%@page import="com.entity.Cart"%>
<%@page import="com.DAO.CartDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="cartstyle.css">
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
            <div class="wrapper wrapper-content animated fadeInRight">
                <div class="row">
                    <div class="col-md-9">
                        <div class="ibox">
                            <div class="ibox-title">

                                <h5>Items in your cart</h5>
                                <c:if test="${not empty succMsg}">
                                    <div class="alert alert-success" role="alert">
                                        ${succMsg}
                                    </div>
                                    <c:remove var="succMsg" scope="session"/>
                                </c:if>
                                <c:if test="${not empty failedMsg}">
                                    <div class="alert alert-danger" role="alert">
                                        ${failedMsg}
                                    </div>
                                    <c:remove var="failedMsg" scope="session"/>
                                </c:if>
                            </div>
                            <div class="ibox-content">
                                <div class="table-responsive">
                                    <table class="table shoping-cart-table">
                                        <tbody>
                                            <%
                                                User u = (User) session.getAttribute("userobj");
                                                CartDAOImpl dao = new CartDAOImpl(DBConnect.getConn());
                                                List<Cart> cart = dao.getProductByUser(u.getId());
//                                                out.println(cart);
                                                Double totalPrice = 0.0;
                                                for (Cart c : cart) {
                                                    
                                            %>
                                            <tr>
                                                <td width="90">
                                                    <div class="cart-product-imitation">
                                                        <img src="admin/images/<%=c.getPhoto()%>" style="width:80px; height:75px;">
                                                    </div>
                                                </td>
                                                <td class="desc">
                                                    <h3>
                                                        <a href="#" class="text-navy">
                                                            <%=c.getProduct_name()%>
                                                        </a>
                                                    </h3>
                                                    <div class="m-t-sm">
                                                        <a href="removeproduct?pid=<%=c.getProductid()%>&&uid=<%=c.getUserid()%>" class="text-muted"><i class="fa fa-trash"></i> Remove item</a>
                                                    </div>
                                                </td>

                                                <td>
                                                <td>
                                                    Rs. <span class="price" id="price_<%= c.getCid()%>"><%= c.getPrice()%></span>
                                                </td>
                                                <td width="65">
                                                    <div class="product-quantity">

                                                        <input type="number" class="quantity" value="<%=c.getQuantity()%>" min="1">
                                                    </div>
                                                </td>
                                                <td>
                                                    <h4>
                                                        <div class="product-line-price" id="product-line-price_<%= c.getCid()%>"><%= c.getPrice() * c.getQuantity()%></div>
                                                    </h4>
                                                </td>


                                            </tr>
                                            <% totalPrice += c.getPrice();}
                                            %>
                                        </tbody>
                                    </table>
                                </div>

                            </div>
                            <div class="ibox-content">
                                <%
                                    Cart c = new Cart();
                                %>
                            </div>
                            <div class="ibox-content">
                                <a href="checkout.jsp?pid=<%=c.getProductid()%>&&uid=<%=c.getUserid()%>"><button class="btn btn-primary pull-right"><i class="fa fa fa-shopping-cart"></i> Checkout</button></a>
                                <button class="btn btn-white"><i class="fa fa-arrow-left"></i> Continue shopping</button>

                            </div>
                        </div>

                    </div>
                    <div class="col-md-3">
                        <div class="ibox">
                            <div class="ibox-title">
                                <h5>Cart Summary</h5>
                            </div>
                            <div class="ibox-content">
                                <span>
                                    Total
                                </span>
                                <h2 class="font-bold">
                                    Rs. <%=totalPrice%>
                                </h2>

                                <hr>
                                <!--                                <span class="text-muted small">
                                                                    *For United States, France and Germany applicable sales tax will be applied
                                                                </span>-->
                                <div class="m-t-sm">
                                    <div class="btn-group">
                                        <a href="checkout.jsp?pid=<%=c.getProductid()%>&&uid=<%=c.getUserid()%>" class="btn btn-primary btn-sm"><i class="fa fa-shopping-cart"></i> Checkout</a>
                                        <a href="#" class="btn btn-white btn-sm"> Cancel</a>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="ibox">
                            <div class="ibox-title">
                                <h5>Support</h5>
                            </div>
                            <div class="ibox-content text-center">
                                <h3><i class="fa fa-phone"></i> +43 100 783 001</h3>
                                <span class="small">
                                    Please contact with us if you have any questions.
                                </span>
                            </div>
                        </div>


                    </div>
                </div>
            </div>
        </div>
        <script>
            $(document).ready(function () {
                $('.quantity').change(function () {
                    updatePrice(this);
                });

                function updatePrice(quantityInput) {
                    let productRow = $(quantityInput).closest('tr');
                    let price = parseFloat(productRow.find('.price').text());
                    let quantity = parseInt($(quantityInput).val());
                    let totalPrice = price * quantity;
                    productRow.find('.product-line-price').text(totalPrice.toFixed(2));
                   
                }
            });
        </script>

    </body>
</html>