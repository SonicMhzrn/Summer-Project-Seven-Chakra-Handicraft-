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
        <%@include file="navbar.jsp" %>
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
                                                for (Cart c : cart) {%>
                                            <tr>
                                                <td width="90">
                                                    <div class="cart-product-imitation">
                                                    </div>
                                                </td>
                                                <td class="desc">
                                                    <h3>
                                                        <a href="#" class="text-navy">
                                                            <%=c.getProduct_name()%>
                                                        </a>
                                                    </h3>
                                                    <div class="m-t-sm">
                                                        <a href="#" class="text-muted"><i class="fa fa-trash"></i> Remove item</a>
                                                    </div>
                                                </td>

                                                <td>
                                                <td>
                                                    Rs. <span class="price" id="price_<%= c.getCid()%>"><%= c.getPrice()%></span>
                                                </td>
                                                <td width="65">
                                                    <div class="product-quantity">
                                                        <input type="number" value="1" min="1">
                                                    </div>
                                                </td>
                                                <td>
                                                    <h4>
                                                       <div class="product-line-price">25.98</div>
                                                    </h4>
                                                </td>

                                            </tr>
                                            <%}
                                            %>
                                        </tbody>
                                    </table>
                                </div>

                            </div>
                            <div class="ibox-content">

                            </div>
                            <div class="ibox-content">
                                <button class="btn btn-primary pull-right"><i class="fa fa fa-shopping-cart"></i> Checkout</button>
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
                                    Rs. 390,00
                                </h2>

                                <hr>
                                <span class="text-muted small">
                                    *For United States, France and Germany applicable sales tax will be applied
                                </span>
                                <div class="m-t-sm">
                                    <div class="btn-group">
                                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-shopping-cart"></i> Checkout</a>
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
                                    Please contact with us if you have any questions. We are avalible 24h.
                                </span>
                            </div>
                        </div>

                        <div class="ibox">
                            <div class="ibox-content">

                                <p class="font-bold">
                                    Other products you may be interested
                                </p>
                                <hr>
                                <div>
                                    <a href="#" class="product-name"> Product 1</a>
                                    <div class="small m-t-xs">
                                        Many desktop publishing packages and web page editors now.
                                    </div>
                                    <div class="m-t text-righ">

                                        <a href="#" class="btn btn-xs btn-outline btn-primary">Info <i class="fa fa-long-arrow-right"></i> </a>
                                    </div>
                                </div>
                                <hr>
                                <div>
                                    <a href="#" class="product-name"> Product 2</a>
                                    <div class="small m-t-xs">
                                        Many desktop publishing packages and web page editors now.
                                    </div>
                                    <div class="m-t text-righ">

                                        <a href="#" class="btn btn-xs btn-outline btn-primary">Info <i class="fa fa-long-arrow-right"></i> </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                                        <script>
            $(document).ready(function () {

                /* Set rates + misc */
                var taxRate = 0.05;
                var shippingRate = 15.00;
                var fadeTime = 300;


                /* Assign actions */
                $('.product-quantity input').change(function () {
                    updateQuantity(this);
                });

                $('.product-removal button').click(function () {
                    removeItem(this);
                }); 


                /* Recalculate cart */
                function recalculateCart()
                {
                    var subtotal = 0;

                    /* Sum up row totals */
                    $('.product').each(function () {
                        subtotal += parseFloat($(this).children('.product-line-price').text());
                    });

                    /* Calculate totals */
                    var tax = subtotal * taxRate;
                    var shipping = (subtotal > 0 ? shippingRate : 0);
                    var total = subtotal + tax + shipping;

                    /* Update totals display */
                    $('.totals-value').fadeOut(fadeTime, function () {
                        $('#cart-subtotal').html(subtotal.toFixed(2));
                        $('#cart-tax').html(tax.toFixed(2));
                        $('#cart-shipping').html(shipping.toFixed(2));
                        $('#cart-total').html(total.toFixed(2));
                        if (total == 0) {
                            $('.checkout').fadeOut(fadeTime);
                        } else {
                            $('.checkout').fadeIn(fadeTime);
                        }
                        $('.totals-value').fadeIn(fadeTime);
                    });
                }


                /* Update quantity */
                function updateQuantity(quantityInput)
                {
                    /* Calculate line price */
                    var productRow = $(quantityInput).parent().parent();
                    var price = parseFloat(productRow.children('.product-price').text());
                    var quantity = $(quantityInput).val();
                    var linePrice = price * quantity;

                    /* Update line price display and recalc cart totals */
                    productRow.children('.product-line-price').each(function () {
                        $(this).fadeOut(fadeTime, function () {
                            $(this).text(linePrice.toFixed(2));
                            recalculateCart();
                            $(this).fadeIn(fadeTime);
                        });
                    });
                }


                /* Remove item from cart */
                function removeItem(removeButton)
                {
                    /* Remove row from DOM and recalc cart total */
                    var productRow = $(removeButton).parent().parent();
                    productRow.slideUp(fadeTime, function () {
                        productRow.remove();
                        recalculateCart();
                    });
                }

            });
        </script>
      
    </body>
</html>