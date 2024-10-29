package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.User;
import java.util.List;
import com.entity.Bowls;
import com.DAO.BowlDAOImpl;
import com.db.DBConnect;
import java.sql.Connection;

public final class navbar1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/svgFile.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Seven</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"format-detection\" content=\"telephone=no\">\n");
      out.write("        <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css\" />\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Jost:wght@300;400;500&family=Lato:wght@300;400;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!--         script\n");
      out.write("                ================================================== -->\n");
      out.write("        <script src=\"js/modernizr.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body data-bs-spy=\"scroll\" data-bs-target=\"#navbar\" data-bs-root-margin=\"0px 0px -40%\" data-bs-smooth-scroll=\"true\" tabindex=\"0\">\n");
      out.write("\n");
      out.write("        ");
      out.write("<svg xmlns=\"http://www.w3.org/2000/svg\" style=\"display: none;\">\n");
      out.write("      <symbol id=\"search\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 32 32\">\n");
      out.write("        <title>Search</title>\n");
      out.write("        <path fill=\"currentColor\" d=\"M19 3C13.488 3 9 7.488 9 13c0 2.395.84 4.59 2.25 6.313L3.281 27.28l1.439 1.44l7.968-7.969A9.922 9.922 0 0 0 19 23c5.512 0 10-4.488 10-10S24.512 3 19 3zm0 2c4.43 0 8 3.57 8 8s-3.57 8-8 8s-8-3.57-8-8s3.57-8 8-8z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"user\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"cart\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <svg xmlns=\"http://www.w3.org/2000/svg\" id=\"chevron-left\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z\" />\n");
      out.write("      </svg>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"chevron-right\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path fill-rule=\"evenodd\" d=\"M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <svg xmlns=\"http://www.w3.org/2000/svg\" id=\"cart\" viewBox=\"0 0 576 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d=\"M528.1 301.3l47.3-208C578.8 78.3 567.4 64 552 64H159.2l-9.2-44.8C147.8 8 137.9 0 126.5 0H24C10.7 0 0 10.7 0 24v16c0 13.3 10.7 24 24 24h69.9l70.2 343.4C147.3 417.1 136 435.2 136 456c0 30.9 25.1 56 56 56s56-25.1 56-56c0-15.7-6.4-29.8-16.8-40h209.6C430.4 426.2 424 440.3 424 456c0 30.9 25.1 56 56 56s56-25.1 56-56c0-22.2-12.9-41.3-31.6-50.4l5.5-24.3c3.4-15-8-29.3-23.4-29.3H218.1l-6.5-32h293.1c11.2 0 20.9-7.8 23.4-18.7z\"/>\n");
      out.write("      </svg>\n");
      out.write("      <svg xmlns=\"http://www.w3.org/2000/svg\" id=\"wrench\" viewBox=\"0 0 640 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d=\"M610.5 373.3c2.6-14.1 2.6-28.5 0-42.6l25.8-14.9c3-1.7 4.3-5.2 3.3-8.5-6.7-21.6-18.2-41.2-33.2-57.4-2.3-2.5-6-3.1-9-1.4l-25.8 14.9c-10.9-9.3-23.4-16.5-36.9-21.3v-29.8c0-3.4-2.4-6.4-5.7-7.1-22.3-5-45-4.8-66.2 0-3.3 .7-5.7 3.7-5.7 7.1v29.8c-13.5 4.8-26 12-36.9 21.3l-25.8-14.9c-2.9-1.7-6.7-1.1-9 1.4-15 16.2-26.5 35.8-33.2 57.4-1 3.3 .4 6.8 3.3 8.5l25.8 14.9c-2.6 14.1-2.6 28.5 0 42.6l-25.8 14.9c-3 1.7-4.3 5.2-3.3 8.5 6.7 21.6 18.2 41.1 33.2 57.4 2.3 2.5 6 3.1 9 1.4l25.8-14.9c10.9 9.3 23.4 16.5 36.9 21.3v29.8c0 3.4 2.4 6.4 5.7 7.1 22.3 5 45 4.8 66.2 0 3.3-.7 5.7-3.7 5.7-7.1v-29.8c13.5-4.8 26-12 36.9-21.3l25.8 14.9c2.9 1.7 6.7 1.1 9-1.4 15-16.2 26.5-35.8 33.2-57.4 1-3.3-.4-6.8-3.3-8.5l-25.8-14.9zM496 400.5c-26.8 0-48.5-21.8-48.5-48.5s21.8-48.5 48.5-48.5 48.5 21.8 48.5 48.5-21.7 48.5-48.5 48.5zM224 256c70.7 0 128-57.3 128-128S294.7 0 224 0 96 57.3 96 128s57.3 128 128 128zm201.2 226.5c-2.3-1.2-4.6-2.6-6.8-3.9l-7.9 4.6c-6 3.4-12.8 5.3-19.6 5.3-10.9 0-21.4-4.6-28.9-12.6-18.3-19.8-32.3-43.9-40.2-69.6-5.5-17.7 1.9-36.4 17.9-45.7l7.9-4.6c-.1-2.6-.1-5.2 0-7.8l-7.9-4.6c-16-9.2-23.4-28-17.9-45.7 .9-2.9 2.2-5.8 3.2-8.7-3.8-.3-7.5-1.2-11.4-1.2h-16.7c-22.2 10.2-46.9 16-72.9 16s-50.6-5.8-72.9-16h-16.7C60.2 288 0 348.2 0 422.4V464c0 26.5 21.5 48 48 48h352c10.1 0 19.5-3.2 27.2-8.5-1.2-3.8-2-7.7-2-11.8v-9.2z\"/>\n");
      out.write("      </svg>\n");
      out.write("      <svg xmlns=\"http://www.w3.org/2000/svg\" id=\"book\" viewBox=\"0 0 448 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d=\"M448 360V24c0-13.3-10.7-24-24-24H96C43 0 0 43 0 96v320c0 53 43 96 96 96h328c13.3 0 24-10.7 24-24v-16c0-7.5-3.5-14.3-8.9-18.7-4.2-15.4-4.2-59.3 0-74.7 5.4-4.3 8.9-11.1 8.9-18.6zM128 134c0-3.3 2.7-6 6-6h212c3.3 0 6 2.7 6 6v20c0 3.3-2.7 6-6 6H134c-3.3 0-6-2.7-6-6v-20zm0 64c0-3.3 2.7-6 6-6h212c3.3 0 6 2.7 6 6v20c0 3.3-2.7 6-6 6H134c-3.3 0-6-2.7-6-6v-20zm253.4 250H96c-17.7 0-32-14.3-32-32 0-17.6 14.4-32 32-32h285.4c-1.9 17.1-1.9 46.9 0 64z\"/>\n");
      out.write("      </svg>\n");
      out.write("      <svg xmlns=\"http://www.w3.org/2000/svg\" id=\"brush\" viewBox=\"0 0 384 512\">\n");
      out.write("        <path d=\"M352 0H32C14.3 0 0 14.3 0 32v224h384V32c0-17.7-14.3-32-32-32zM0 320c0 35.4 28.7 64 64 64h64v64c0 35.4 28.7 64 64 64s64-28.7 64-64v-64h64c35.3 0 64-28.7 64-64v-32H0v32zm192 104c13.3 0 24 10.7 24 24 0 13.3-10.8 24-24 24s-24-10.8-24-24c0-13.3 10.8-24 24-24z\"/></svg>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"star-fill\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M3.612 15.443c-.386.198-.824-.149-.746-.592l.83-4.73L.173 6.765c-.329-.314-.158-.888.283-.95l4.898-.696L7.538.792c.197-.39.73-.39.927 0l2.184 4.327 4.898.696c.441.062.612.636.282.95l-3.522 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"star-empty\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M2.866 14.85c-.078.444.36.791.746.593l4.39-2.256 4.389 2.256c.386.198.824-.149.746-.592l-.83-4.73 3.522-3.356c.33-.314.16-.888-.282-.95l-4.898-.696L8.465.792a.513.513 0 0 0-.927 0L5.354 5.12l-4.898.696c-.441.062-.612.636-.283.95l3.523 3.356-.83 4.73zm4.905-2.767-3.686 1.894.694-3.957a.565.565 0 0 0-.163-.505L1.71 6.745l4.052-.576a.525.525 0 0 0 .393-.288L8 2.223l1.847 3.658a.525.525 0 0 0 .393.288l4.052.575-2.906 2.77a.565.565 0 0 0-.163.506l.694 3.957-3.686-1.894a.503.503 0 0 0-.461 0z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"star-half\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M5.354 5.119 7.538.792A.516.516 0 0 1 8 .5c.183 0 .366.097.465.292l2.184 4.327 4.898.696A.537.537 0 0 1 16 6.32a.548.548 0 0 1-.17.445l-3.523 3.356.83 4.73c.078.443-.36.79-.746.592L8 13.187l-4.389 2.256a.52.52 0 0 1-.146.05c-.342.06-.668-.254-.6-.642l.83-4.73L.173 6.765a.55.55 0 0 1-.172-.403.58.58 0 0 1 .085-.302.513.513 0 0 1 .37-.245l4.898-.696zM8 12.027a.5.5 0 0 1 .232.056l3.686 1.894-.694-3.957a.565.565 0 0 1 .162-.505l2.907-2.77-4.052-.576a.525.525 0 0 1-.393-.288L8.001 2.223 8 2.226v9.8z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"quote\" viewBox=\"0 0 24 24\">\n");
      out.write("        <path fill=\"currentColor\" d=\"m15 17l2-4h-4V6h7v7l-2 4h-3Zm-9 0l2-4H4V6h7v7l-2 4H6Z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"facebook\" viewBox=\"0 0 24 24\">\n");
      out.write("        <path fill=\"currentColor\" d=\"M9.198 21.5h4v-8.01h3.604l.396-3.98h-4V7.5a1 1 0 0 1 1-1h3v-4h-3a5 5 0 0 0-5 5v2.01h-2l-.396 3.98h2.396v8.01Z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"youtube\" viewBox=\"0 0 32 32\">\n");
      out.write("        <path fill=\"currentColor\" d=\"M29.41 9.26a3.5 3.5 0 0 0-2.47-2.47C24.76 6.2 16 6.2 16 6.2s-8.76 0-10.94.59a3.5 3.5 0 0 0-2.47 2.47A36.13 36.13 0 0 0 2 16a36.13 36.13 0 0 0 .59 6.74a3.5 3.5 0 0 0 2.47 2.47c2.18.59 10.94.59 10.94.59s8.76 0 10.94-.59a3.5 3.5 0 0 0 2.47-2.47A36.13 36.13 0 0 0 30 16a36.13 36.13 0 0 0-.59-6.74ZM13.2 20.2v-8.4l7.27 4.2Z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"twitter\" viewBox=\"0 0 256 256\">\n");
      out.write("        <path fill=\"currentColor\" d=\"m245.66 77.66l-29.9 29.9C209.72 177.58 150.67 232 80 232c-14.52 0-26.49-2.3-35.58-6.84c-7.33-3.67-10.33-7.6-11.08-8.72a8 8 0 0 1 3.85-11.93c.26-.1 24.24-9.31 39.47-26.84a110.93 110.93 0 0 1-21.88-24.2c-12.4-18.41-26.28-50.39-22-98.18a8 8 0 0 1 13.65-4.92c.35.35 33.28 33.1 73.54 43.72V88a47.87 47.87 0 0 1 14.36-34.3A46.87 46.87 0 0 1 168.1 40a48.66 48.66 0 0 1 41.47 24H240a8 8 0 0 1 5.66 13.66Z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"instagram\" viewBox=\"0 0 256 256\">\n");
      out.write("        <path fill=\"currentColor\" d=\"M128 80a48 48 0 1 0 48 48a48.05 48.05 0 0 0-48-48Zm0 80a32 32 0 1 1 32-32a32 32 0 0 1-32 32Zm48-136H80a56.06 56.06 0 0 0-56 56v96a56.06 56.06 0 0 0 56 56h96a56.06 56.06 0 0 0 56-56V80a56.06 56.06 0 0 0-56-56Zm40 152a40 40 0 0 1-40 40H80a40 40 0 0 1-40-40V80a40 40 0 0 1 40-40h96a40 40 0 0 1 40 40ZM192 76a12 12 0 1 1-12-12a12 12 0 0 1 12 12Z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"linkedin\" viewBox=\"0 0 24 24\">\n");
      out.write("        <path fill=\"currentColor\" d=\"M6.94 5a2 2 0 1 1-4-.002a2 2 0 0 1 4 .002zM7 8.48H3V21h4V8.48zm6.32 0H9.34V21h3.94v-6.57c0-3.66 4.77-4 4.77 0V21H22v-7.93c0-6.17-7.06-5.94-8.72-2.91l.04-1.68z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"nav-icon\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M14 10.5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0 0 1h3a.5.5 0 0 0 .5-.5zm0-3a.5.5 0 0 0-.5-.5h-7a.5.5 0 0 0 0 1h7a.5.5 0 0 0 .5-.5zm0-3a.5.5 0 0 0-.5-.5h-11a.5.5 0 0 0 0 1h11a.5.5 0 0 0 .5-.5z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"close\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M2.146 2.854a.5.5 0 1 1 .708-.708L8 7.293l5.146-5.147a.5.5 0 0 1 .708.708L8.707 8l5.147 5.146a.5.5 0 0 1-.708.708L8 8.707l-5.146 5.147a.5.5 0 0 1-.708-.708L7.293 8 2.146 2.854Z\" />\n");
      out.write("      </symbol>\n");
      out.write("      <symbol xmlns=\"http://www.w3.org/2000/svg\" id=\"navbar-icon\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M14 10.5a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0 0 1h3a.5.5 0 0 0 .5-.5zm0-3a.5.5 0 0 0-.5-.5h-7a.5.5 0 0 0 0 1h7a.5.5 0 0 0 .5-.5zm0-3a.5.5 0 0 0-.5-.5h-11a.5.5 0 0 0 0 1h11a.5.5 0 0 0 .5-.5z\" />\n");
      out.write("      </symbol>\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" id=\"edit\" viewBox=\"0 0 576 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.-->\n");
      out.write("        <path d=\"M402.6 83.2l90.2 90.2c3.8 3.8 3.8 10 0 13.8L274.4 405.6l-92.8 10.3c-12.4 1.4-22.9-9.1-21.5-21.5l10.3-92.8L388.8 83.2c3.8-3.8 10-3.8 13.8 0zm162-22.9l-48.8-48.8c-15.2-15.2-39.9-15.2-55.2 0l-35.4 35.4c-3.8 3.8-3.8 10 0 13.8l90.2 90.2c3.8 3.8 10 3.8 13.8 0l35.4-35.4c15.2-15.3 15.2-40 0-55.2zM384 346.2V448H64V128h229.8c3.2 0 6.2-1.3 8.5-3.5l40-40c7.6-7.6 2.2-20.5-8.5-20.5H48C21.5 64 0 85.5 0 112v352c0 26.5 21.5 48 48 48h352c26.5 0 48-21.5 48-48V306.2c0-10.7-12.9-16-20.5-8.5l-40 40c-2.2 2.3-3.5 5.3-3.5 8.5z\"/>\n");
      out.write("    </svg>\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" id=\"trash\"viewBox=\"0 0 448 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d=\"M32 464a48 48 0 0 0 48 48h288a48 48 0 0 0 48-48V128H32zm272-256a16 16 0 0 1 32 0v224a16 16 0 0 1 -32 0zm-96 0a16 16 0 0 1 32 0v224a16 16 0 0 1 -32 0zm-96 0a16 16 0 0 1 32 0v224a16 16 0 0 1 -32 0zM432 32H312l-9.4-18.7A24 24 0 0 0 281.1 0H166.8a23.7 23.7 0 0 0 -21.4 13.3L136 32H16A16 16 0 0 0 0 48v32a16 16 0 0 0 16 16h416a16 16 0 0 0 16-16V48a16 16 0 0 0 -16-16z\"/>\n");
      out.write("    </svg>\n");
      out.write("    </svg>  \n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <div class=\"search-popup\">\n");
      out.write("        <div class=\"search-popup-container\">\n");
      out.write("\n");
      out.write("            <form role=\"search\" method=\"post\" class=\"search-form\" action=\"search.jsp\">\n");
      out.write("                <input type=\"search\" id=\"search-form\" class=\"search-field\" placeholder=\"Type and press enter\" value=\"\" name=\"ch\" />\n");
      out.write("                <button type=\"submit\" class=\"search-submit\"><svg class=\"search\"><use xlink:href=\"#search\"></use></svg></button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <h5 class=\"cat-list-title\">Browse Categories</h5>\n");
      out.write("\n");
      out.write("            <ul class=\"cat-list\">\n");
      out.write("<!--                <li class=\"cat-list-item\">\n");
      out.write("                    <a href=\"#\" title=\"Mobile Phones\">Services</a>\n");
      out.write("                </li>-->\n");
      out.write("                <li class=\"cat-list-item\">\n");
      out.write("                    <a href=\"allBowl.jsp\" title=\"Smart Watches\">Singing Bowls</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"cat-list-item\">\n");
      out.write("                    <a href=\"#\" title=\"Headphones\">Statues</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"cat-list-item\">\n");
      out.write("                    <a href=\"#\" title=\"Accessories\">Tinghsa Bells</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"cat-list-item\">\n");
      out.write("                    <a href=\"#\" title=\"Monitors\">Others</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <header id=\"header\" class=\"site-header header-scrolled position-fixed text-black bg-light\">\n");
      out.write("        <nav id=\"header-nav\" class=\"navbar navbar-expand-lg px-3 mb-3\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                    <img src=\"admin/images/logo.png\" class=\"logo\">\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler d-flex d-lg-none order-3 p-2\" type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#bdNavbar\" aria-controls=\"bdNavbar\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <svg class=\"navbar-icon\">\n");
      out.write("                    <use xlink:href=\"#navbar-icon\"></use>\n");
      out.write("                    </svg>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"offcanvas offcanvas-end\" tabindex=\"-1\" id=\"bdNavbar\" aria-labelledby=\"bdNavbarOffcanvasLabel\">\n");
      out.write("                    <div class=\"offcanvas-header px-4 pb-0\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                            <img src=\"images/logo.png\" class=\"logo\">\n");
      out.write("                        </a>\n");
      out.write("                        <button type=\"button\" class=\"btn-close btn-close-black\" data-bs-dismiss=\"offcanvas\" aria-label=\"Close\" data-bs-target=\"#bdNavbar\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"offcanvas-body\">\n");
      out.write("                        <ul id=\"navbar\" class=\"navbar-nav text-uppercase justify-content-end align-items-center flex-grow-1 pe-3\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link me-4 active\" href=\"index.jsp\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link me-4\" href=\"#company-services\">Services</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link me-4\" href=\"allBowl.jsp\">Bowls</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link me-4\" href=\"allStatue.jsp\">Statues</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link me-4\" href=\"allBell.jsp\">Tinghsa Bells</a>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link me-4\" href=\"#latest-blog\">Blog</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("<!--                                                        <li class=\"nav-item dropdown\">\n");
      out.write("                                                            <a class=\"nav-link me-4 dropdown-toggle link-dark\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-expanded=\"false\">Pages</a>\n");
      out.write("                                                            <ul class=\"dropdown-menu\">\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"about.html\" class=\"dropdown-item\">About</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"blog.html\" class=\"dropdown-item\">Blog</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"shop.html\" class=\"dropdown-item\">Shop</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"cart.html\" class=\"dropdown-item\">Cart</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"checkout.html\" class=\"dropdown-item\">Checkout</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"single-post.html\" class=\"dropdown-item\">Single Post</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"single-product.html\" class=\"dropdown-item\">Single Product</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li>\n");
      out.write("                                                                    <a href=\"contact.html\" class=\"dropdown-item\">Contact</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                            </ul>\n");
      out.write("                                                        </li> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <div class=\"user-items ps-5\">\n");
      out.write("                                    <ul class=\"d-flex justify-content-end list-unstyled\">\n");
      out.write("                                        <li class=\"nav-item dropdown\"\">\n");
      out.write("                                            <a href=\"#\" class=\"search-button\">\n");
      out.write("                                                <svg class=\"search\">\n");
      out.write("                                                <use xlink:href=\"#search\"></use>\n");
      out.write("                                                </svg>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/plugins.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty userobj}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                            <li class=\"nav-item dropdown\">\n");
        out.write("                                                <a class=\"nav-link me-4 dropdown-toggle link-dark\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-expanded=\"false\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userobj.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("\n");
        out.write("                                                <ul class=\"dropdown-menu\">\n");
        out.write("                                                    <li>\n");
        out.write("                                                        <a href=\"profile.jsp\" class=\"dropdown-item\">Profile</a>\n");
        out.write("                                                    </li>\n");
        out.write("                                                    <li>\n");
        out.write("                                                        <a href=\"Logout\" class=\"dropdown-item\">Logout</a>\n");
        out.write("                                                    </li>\n");
        out.write("                                                </ul>\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"cart.jsp\">\n");
        out.write("                                                    <svg class=\"cart\">\n");
        out.write("                                                    <use xlink:href=\"#cart\"></use>\n");
        out.write("                                                    </svg>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ empty userobj}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li class=\"pe-3\">\n");
        out.write("                                                <a href=\"login.jsp\">\n");
        out.write("                                                    <svg class=\"user\">\n");
        out.write("                                                    <use xlink:href=\"#user\"></use>\n");
        out.write("                                                    </svg>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li>\n");
        out.write("                                            <a href=\"login.jsp\">\n");
        out.write("                                                <svg class=\"cart\">\n");
        out.write("                                                <use xlink:href=\"#cart\"></use>\n");
        out.write("                                                </svg>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
