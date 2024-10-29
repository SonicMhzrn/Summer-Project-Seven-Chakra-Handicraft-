/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.BowlDAOImpl;
import com.DAO.CartDAOImpl;
import com.DAO.StatueDAOImpl;
import com.db.DBConnect;
import com.entity.Bowls;
import com.entity.Cart;
import com.entity.Statue;
import com.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cartStatueServlet")
public class CartStatueServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();

//            String referrer = request.getHeader("referer");
            int bid = Integer.parseInt(request.getParameter("bid"));
            int uid = Integer.parseInt(request.getParameter("uid"));
//            int quantity = Integer.parseInt(request.getParameter("quantity"));
            int quantity = 1;
//            out.print(bid+" "+uid+" "+" "+quantity);

            StatueDAOImpl dao = new StatueDAOImpl(DBConnect.getConn());
            Statue b = dao.getStatueBy(bid);
            Double totalPrice = quantity * Double.parseDouble(b.getPrice());
            out.println(totalPrice);
            Cart c = new Cart();
            c.setQuantity(quantity);
            c.setProductid(bid);
            c.setUserid(uid);
            c.setProduct_name(b.getStatue_detail());
            c.setQuantity(c.getQuantity());
            c.setPrice(Double.parseDouble(b.getPrice()));
            c.setTotal_price(Double.parseDouble(b.getPrice()));
            c.setPhoto(b.getImage());
            out.print(c);
            CartDAOImpl dao2 = new CartDAOImpl(DBConnect.getConn());
            boolean f = dao2.addCart(c);

            if (f) {
                session.setAttribute("addCart", "Product Added to Cart");

                response.sendRedirect("index.jsp");

            } else {
                session.setAttribute("failed", "Error while adding to Cart");

                response.sendRedirect("index.jsp");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
