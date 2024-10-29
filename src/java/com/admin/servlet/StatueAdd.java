package com.admin.servlet;

import com.DAO.StatueDAOImpl;
import com.db.DBConnect;
import com.entity.Statue;
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

@WebServlet("/add_statue")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2 MB
        maxFileSize = 1024 * 1024 * 10, // 10 MB
        maxRequestSize = 1024 * 1024 * 50)   // 50 MB
public class StatueAdd extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String statue_detail = request.getParameter("sname");
            String price = request.getParameter("price");
            Part part = request.getPart("bimg");
            String image = part.getSubmittedFileName();
            String status = request.getParameter("status");

            out.println(statue_detail);
            Statue s = new Statue(statue_detail, price, image, status);
//            out.println(b);
            StatueDAOImpl dao = new StatueDAOImpl(DBConnect.getConn());

            boolean f = dao.addStatue(s);

            HttpSession session = request.getSession();

            if (f) {
                String uploadPath = "C:/Users/Dell/Desktop/Summer Project/Project(SCH)/web/admin/images/statues/" + image;
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
                session.setAttribute("succMsg", "Statue Added Successfully");
                response.sendRedirect("admin/add_statue.jsp");
            } else {
                session.setAttribute("failMsg", "Error");
                response.sendRedirect("admin/add_statue.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getSubmittedFileName(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                return cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
