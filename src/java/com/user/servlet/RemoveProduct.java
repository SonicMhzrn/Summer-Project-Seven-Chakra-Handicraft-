/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.CartDAOImpl;
import com.db.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/removeproduct")
public class RemoveProduct extends HttpServlet {

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
        int pid = Integer.parseInt(request.getParameter("pid"));
        int uid = Integer.parseInt(request.getParameter("uid"));
        try (PrintWriter out = response.getWriter()) {
           CartDAOImpl dao = new CartDAOImpl(DBConnect.getConn());
           boolean f = dao.deleteProduct(pid,uid);
           HttpSession session = request.getSession();
           
           if(f){
               session.setAttribute("succMsg", "Product Deleted from cart");
               response.sendRedirect("cart.jsp");
           }
           else{
               session.setAttribute("failedMsg", "Error while deleting product");
               response.sendRedirect("cart.jsp");
           }
        }catch(Exception e){
            
        }
    }

}
