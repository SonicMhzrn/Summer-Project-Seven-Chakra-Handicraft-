/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.BowlDAOImpl;
import com.db.DBConnect;
import com.entity.Bowls;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
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
@WebServlet("/edit_statue")
public class EditStatue extends HttpServlet {

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
            int id = Integer.parseInt(request.getParameter("sid"));
            String statue_detail = request.getParameter("sname");
            String price = request.getParameter("price");
            Part part = request.getPart("simg");
            String image = part.getSubmittedFileName();
            String status = request.getParameter("status");
          
       
            out.print(id+" "+statue_detail+" "+price+" "+image+" "+status);
//            Bowls b = new Bowls();
//            b.setBowl_id(id);
//            b.setBowl_detail(bowl_detail);
//            b.setPrice(price);
//            b.setDiameter(diameter);
//            b.setMade_by(made_by);
//            b.setChakra(chakra);
//            b.setKey_note(key_note);
//            b.setStatus(status);
//            out.println(b);
//            
//            BowlDAOImpl dao = new BowlDAOImpl(DBConnect.getConn());
//            boolean f = dao.updateEditBowl(b);
//            HttpSession session = request.getSession();
//            
//            if (f){
//                session.setAttribute("succMsg", "Bowl Update Successfully..");
//                response.sendRedirect("allBowl.jsp");
//            }else{
//                session.setAttribute("failMsg", "Unable to Update..");
//                response.sendRedirect("allBowl.jsp");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
