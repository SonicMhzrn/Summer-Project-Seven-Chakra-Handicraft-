/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.StatueDAOImpl;
import com.DAO.UserDAOImpl;
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
public class UserDelete extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("id"));
            out.println(id);
            
            UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
            boolean f = dao.deleteUser(id);
            HttpSession session = request.getSession();
            
            if (f){
                session.setAttribute("succMsg", "Statue Delete Successfully..");
                response.sendRedirect("admin/user.jsp");
            }else{
                session.setAttribute("failMsg", "Unable to Delete..");
                response.sendRedirect("admin/user.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
