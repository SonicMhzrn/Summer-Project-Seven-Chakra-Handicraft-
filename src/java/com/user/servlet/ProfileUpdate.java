/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.UserDAOImpl;
import com.db.DBConnect;
import com.entity.User;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
@WebServlet("/profile_update")
public class ProfileUpdate extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("id"));
//           out.println(id);

            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String phone = request.getParameter("phonenumber");

            User u = new User();
            u.setId(id);
            u.setEmail(email);
            u.setAddress(address);
            u.setPhone(phone);
            out.println(u);

            UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
            boolean f = dao.updateUser(u);

            HttpSession session = request.getSession();

            if (f) {
                session.setAttribute("succMsg", "Update Successfully..");
                response.sendRedirect("profileEdit.jsp");
            } else {
                session.setAttribute("failMsg", "Unable to Update..");
                response.sendRedirect("profileEdit.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
