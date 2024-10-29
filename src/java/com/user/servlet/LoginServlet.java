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

/**
 *
 * @author Dell
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
//            out.println("Is session new? " + usession.isNew());
            UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
            
            String email = request.getParameter("email");
            String password = request.getParameter("password");
//           out.println(email+password);

            if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
                User us = new User();
                us.setUsername("Admin");
                    
                session.setAttribute("userobj",us);
                response.sendRedirect("admin/home.jsp");
            } else {
                User us = dao.login(email, password);
//                out.println(us.getId()+us.getEmail()+us.getPassword());

                if(us!=null){
                    session.setAttribute("userobj",us);
                    out.println("userobj attribute set: " + session.getAttribute("userobj"));
                    response.sendRedirect("index.jsp");
                    
                }else{
                    session.setAttribute("failMsg", "Email or Password is Incorrect");
                    response.sendRedirect("login.jsp");
                }
//                response.sendRedirect("home.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
