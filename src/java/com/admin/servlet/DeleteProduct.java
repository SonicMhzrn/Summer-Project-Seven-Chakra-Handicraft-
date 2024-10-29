/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.ProductDAOImpl;
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
@WebServlet("/deleteProduct")
public class DeleteProduct extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int id = Integer.parseInt(request.getParameter("id"));
            out.println(id);
            
            ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
            boolean f = dao.deleteProduct(id);
            HttpSession session = request.getSession();
            
            if (f){
                session.setAttribute("succMsg", "Product Delete Successfully..");
                response.sendRedirect("admin/allProducts.jsp");
            }else{
                session.setAttribute("failMsg", "Unable to Delete..");
                response.sendRedirect("admin/allProducts.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
