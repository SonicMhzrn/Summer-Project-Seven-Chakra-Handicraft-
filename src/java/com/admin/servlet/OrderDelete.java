/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.OrderDAOImpl;
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
@WebServlet("/orderdelete")
public class OrderDelete extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int id = Integer.parseInt(request.getParameter("id"));
            out.println(id);
            
            OrderDAOImpl dao = new OrderDAOImpl(DBConnect.getConn());
            boolean f = dao.deleteOrder(id);
            HttpSession session = request.getSession();
            
            if (f){
                session.setAttribute("succMsg", "Order Delete Successfully..");
                response.sendRedirect("admin/orders.jsp");
            }else{
                session.setAttribute("failMsg", "Unable to Delete..");
                response.sendRedirect("admin/orders.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
