/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.ProductDAOImpl;
import com.db.DBConnect;
import com.entity.Products;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Dell
 */
@WebServlet("/edit_product")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2, // 2 MB
        maxFileSize = 1024 * 1024 * 10, // 10 MB
        maxRequestSize = 1024 * 1024 * 50 // 50 MB
)

public class EditProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int id = Integer.parseInt(request.getParameter("pid"));
            String p_detail = request.getParameter("pname");
            String price = request.getParameter("price");
            String category = request.getParameter("category");
            String status = request.getParameter("status");
            Part part = request.getPart("bimg");
            String image = part.getSubmittedFileName();
            out.print(id + " " + p_detail + " " + price + " "+category   + image);

            Products p = new Products();
            p.setP_id(id);
            p.setP_detail(p_detail);
            p.setPrice(price);
            p.setCategory(category);
            p.setImage(image);
            p.setStatus(status);
            out.println(p);

            ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
            boolean f = dao.updateEditProduct(p);
            HttpSession session = request.getSession();

            if (f) {
                String uploadPath = "C:/Users/Dell/Desktop/Summer Project/Project(SCH)/web/admin/images/" + image;
                out.println(uploadPath);

                FileOutputStream fos = new FileOutputStream(uploadPath);
                InputStream is = part.getInputStream();

                try {
                    byte[] data = new byte[is.available()];
                    is.read(data);
                    fos.write(data);
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                session.setAttribute("succMsg", "Update Successfully..");
                response.sendRedirect("admin/allProducts.jsp");
            } else {
                session.setAttribute("failMsg", "Unable to Update..");
                response.sendRedirect("admin/allProducts.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
