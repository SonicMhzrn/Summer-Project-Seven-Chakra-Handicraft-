<%-- 
    Document   : home
    Created on : Jan 28, 2024, 6:18:31 PM
    Author     : Dell
--%>

<%@page import="com.entity.Cart"%>
<%@page import="com.DAO.CartDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="navbar.jsp" %>
        <h1>User:Home</h1>
                <c:if test="${not empty userobj}">
                    <p>Username:${userobj.username}</p>
                    <p>Email:${userobj.email}</p>
                </c:if>
       
                    
                    <tbody>
                                            <%
                                                User u = (User) session.getAttribute("userobj");
                                                CartDAOImpl dao = new CartDAOImpl(DBConnect.getConn());
                                                List<Cart> cart = dao.getProductByUser(u.getId());
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
<!--                                                    <p class="small">
                                                        It is a long established fact that a reader will be distracted by the readable
                                                        content of a page when looking at its layout. The point of using Lorem Ipsum is
                                                    </p>
                                                    <dl class="small m-b-none">
                                                        <dt>Description lists</dt>
                                                        <dd>A description list is perfect for defining terms.</dd>
                                                    </dl>-->

                                                    <div class="m-t-sm">

                                                        <a href="#" class="text-muted"><i class="fa fa-trash"></i> Remove item</a>
                                                    </div>
                                                </td>

                                                <td>
                                                    <%=c.getPrice()%>
                                                    <!--<s class="small text-muted">$230,00</s>-->
                                                </td>
                                                <td width="65">
                                                    <input type="text" class="form-control" value="<%=c.getQuantity()%>">
                                                </td>
                                                <td>
                                                    <h4>
                                                        $180,00
                                                    </h4>
                                                </td>
                                            </tr>
                                            <%}
                                            %>

                                        </tbody>
    </body>
</html>
