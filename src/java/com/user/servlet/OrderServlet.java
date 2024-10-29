/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.CartDAOImpl;
import com.DAO.OrderDAOImpl;
import com.db.DBConnect;
import com.entity.Cart;
import com.entity.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            HttpSession session = request.getSession();

            int id = Integer.parseInt(request.getParameter("id"));
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String phone = request.getParameter("phonenumber");

            String payment = request.getParameter("paymentMethod");
            LocalDate currentDate = LocalDate.now();
//            Cart c = new Cart();
            // Print the current date (optional)
//            out.println("Current Date: " + currentDate);
//            out.println(id + " " + firstname + " " + lastname + " " + username + " " + email + " " + address + " " + phone + " " + payment + " "+c.getPrice()+" "+c.getProduct_name());

            CartDAOImpl dao = new CartDAOImpl(DBConnect.getConn());
            dao.getProductByUser(id);

            List<Cart> blist = dao.getProductByUser(id);

            if (blist.isEmpty()) {
                session.setAttribute("failedMsg", "Add Products to order");
                response.sendRedirect("checkout.jsp");
            } else {
                OrderDAOImpl dao2 = new OrderDAOImpl(DBConnect.getConn());
                Order o = null;

                ArrayList<Order> orderList = new ArrayList<Order>();
                Random r = new Random();
                for (Cart c : blist) {
                    o = new Order();
//               out.print(c.getProduct_name()+" "+c.getPrice()+" "+c.getQuantity()+" "+c.getPhoto()+""+c.getPrice()+"");
                    o.setOrder_id("Order-00" + r.nextInt(1000));
                    o.setFirst_name(firstname);
                    o.setLast_name(lastname);
                    o.setUsername(username);
                    o.setEmail(email);
                    o.setPhone(phone);
                    o.setAddress(address);
                    o.setDate(currentDate);
                    o.setProduct_name(c.getProduct_name());
                    o.setPrice(c.getPrice() + "");
                    o.setImage(c.getPhoto());
                    o.setPayment(payment);
                    orderList.add(o);
//                out.println(o+"<br>");
                }
                boolean f = dao2.saveOrder(orderList);
                boolean f1 = dao.deleteCartByUser(id);
                if (f) {
                    response.sendRedirect("order_success.jsp");
//                    out.println("Order Successful");
                } else {
                    session.setAttribute("failedMsg", "Error while placing order");
                    response.sendRedirect("checkout.jsp");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
