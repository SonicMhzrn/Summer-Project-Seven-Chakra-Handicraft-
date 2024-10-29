/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.UserDAOImpl;
import com.db.DBConnect;
import com.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String re_password = request.getParameter("re_password");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            HttpSession session = request.getSession();
//            out.println(name + " " + email + password + re_password);
            if (password.equals(re_password)) {
                
                // Hash passwords
                String hashedPassword = PasswordHashing.hashPassword(password);
                String hashedRePassword = PasswordHashing.hashPassword(re_password);

                User us = new User();
                us.setUsername(name);
                us.setEmail(email);
                us.setPassword(hashedPassword);
                us.setRe_password(hashedRePassword);
                us.setAddress(address);
                us.setPhone(phone);

                UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
                boolean f2 = dao.checkUser(email);
                if (f2) {
                    boolean f = dao.userRegister(us);
                    if (f) {
//                    out.println("User Register Success");
                        session.setAttribute("succMsg", "Registration Successfully");
                        response.sendRedirect("register.jsp");

                    } else {
//                    out.println("Error");
                        session.setAttribute("failMsg", "Unable to Registration");
                        response.sendRedirect("register.jsp");
                    }
                } else {
                    session.setAttribute("failMsg", "User Already Exit");
                    response.sendRedirect("register.jsp");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
