package com.admin.servlet;

import com.DAO.BowlDAOImpl;
import com.db.DBConnect;
import com.entity.Bowls;
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

@WebServlet("/add_bowl")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2 MB
        maxFileSize = 1024 * 1024 * 10, // 10 MB
        maxRequestSize = 1024 * 1024 * 50)   // 50 MB
public class BowlAdd extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String bowl_detail = request.getParameter("bname");
            String price = request.getParameter("price");
            String diameter = request.getParameter("diameter");
            String made_by = request.getParameter("made");
            String chakra = request.getParameter("chakra");
            String key_note = request.getParameter("note");
            Part part = request.getPart("bimg");
            String photoname = part.getSubmittedFileName();
            String status = request.getParameter("status");

//            out.println(status);
            Bowls b = new Bowls(bowl_detail, price, diameter, made_by, chakra, key_note, photoname, status);
//            out.println(b);
            BowlDAOImpl dao = new BowlDAOImpl(DBConnect.getConn());

            boolean f = dao.addBowl(b);

            HttpSession session = request.getSession();

            if (f) {
                String uploadPath = "C:/Users/Dell/Desktop/Summer Project/Project(SCH)/web/admin/images/bowl/" + photoname;
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
                session.setAttribute("succMsg", "Bowl Added Successfully");
                response.sendRedirect("admin/add_bowl.jsp");
            } else {
                session.setAttribute("failMsg", "Error");
                response.sendRedirect("admin/add_bowl.jsp");
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
