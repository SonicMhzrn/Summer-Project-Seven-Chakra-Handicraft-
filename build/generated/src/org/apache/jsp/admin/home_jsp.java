package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Products;
import com.DAO.ProductDAOImpl;
import com.entity.Order;
import java.util.List;
import com.DAO.OrderDAOImpl;
import com.entity.User;
import com.db.DBConnect;
import java.sql.Connection;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Dashboard - Seven Chakra Handicraft</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Icon Font Stylesheet -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .content{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"container-xxl position-relative bg-white d-flex p-0\">\n");
      out.write("            <!-- Spinner Start -->\n");
      out.write("            <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("                <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\n");
      out.write("                    <span class=\"sr-only\">Loading...</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Spinner End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Sidebar Start -->\n");
      out.write("            <div class=\"sidebar pe-4 pb-3\">\n");
      out.write("                <nav class=\"navbar bg-light navbar-light\">\n");
      out.write("                    <a href=\"home.jsp\" class=\"navbar-brand mx-4 mb-3\">\n");
      out.write("                        <h3 class=\"text-primary\"><i class=\"fa fa-hashtag me-2\"></i>Seven Chakra <br>Handicraft</h3>\n");
      out.write("                    </a>\n");
      out.write("                    <!--                <div class=\"d-flex align-items-center ms-4 mb-4\">\n");
      out.write("                                        <div class=\"position-relative\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"img/user.jpg\" alt=\"\" style=\"width: 40px; height: 40px;\">\n");
      out.write("                                            <div class=\"bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"ms-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">Jhon Doe</h6>\n");
      out.write("                                            <span>Admin</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>-->\n");
      out.write("                    <div class=\"navbar-nav w-100\">\n");
      out.write("                        <a href=\"home.jsp\" class=\"nav-item nav-link active\"><i class=\"fa fa-tachometer-alt me-2\"></i>Dashboard</a>\n");
      out.write("                        <div class=\"nav-item dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"fa fa-boxes me-2\"></i>Categories</a>\n");
      out.write("                            <div class=\"dropdown-menu bg-transparent border-0\">\n");
      out.write("                                <a href=\"allBowl.jsp\" class=\"dropdown-item\">Singing Bowls</a>\n");
      out.write("                                <a href=\"allStatue.jsp\" class=\"dropdown-item\">Statues</a>\n");
      out.write("                                <a href=\"allBell.jsp\" class=\"dropdown-item\">Tinghsa Bells</a>\n");
      out.write("                                <a href=\"allProducts.jsp\" class=\"dropdown-item\">Products</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"user.jsp\" class=\"nav-item nav-link \"><i class=\"fa fa-users me-2\"></i>Users</a>\n");
      out.write("                        <a href=\"orders.jsp\" class=\"nav-item nav-link\"><i class=\"fa fa-box-open me-2\"></i>Orders</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <!-- Sidebar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Content Start -->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <!-- Navbar Start -->\n");
      out.write("                <nav class=\"navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0\">\n");
      out.write("                    <a href=\"home.jsp\" class=\"navbar-brand d-flex d-lg-none me-4\">\n");
      out.write("                        <h2 class=\"text-primary mb-0\"><i class=\"fa fa-hashtag\"></i></h2>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"sidebar-toggler flex-shrink-0\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-nav align-items-center ms-auto\">\n");
      out.write("                        <div class=\"nav-item dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">\n");
      out.write("                                <img class=\"rounded-circle me-lg-2\" src=\"img/user.jpg\" alt=\"\" style=\"width: 40px; height: 40px;\">\n");
      out.write("                                <span class=\"d-none d-lg-inline-flex\">Admin</span>\n");
      out.write("                            </a>\n");
      out.write("                            <!--                         Button trigger modal \n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\n");
      out.write("                              Launch demo modal\n");
      out.write("                            </button>-->\n");
      out.write("\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0\">\n");
      out.write("                                <a data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" class=\"dropdown-item\">Log Out</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Sale & Revenue Start -->\n");
      out.write("                <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("                    <div class=\"row g-4\">\n");
      out.write("                        <div class=\"col-sm-6 col-xl-3\">\n");
      out.write("                            <div class=\"bg-light rounded d-flex align-items-center justify-content-between p-4\">\n");
      out.write("                                <i class=\"fa fa-boxes fa-3x text-primary\"></i>\n");
      out.write("                                <div class=\"ms-3\">\n");
      out.write("                                    ");

                                        ProductDAOImpl dao2 = new ProductDAOImpl(DBConnect.getConn());
                                        OrderDAOImpl dao3 = new OrderDAOImpl(DBConnect.getConn());
                                      int order = dao3.countOrder() ;
                                      int bowl = dao2.countBowls();
                                      int statue = dao2.countStatues();;
                                      int bell = dao2.countBells();;
                                    
      out.write("\n");
      out.write("                                    <p class=\"mb-2\">Orders</p>\n");
      out.write("                                    <h6 class=\"mb-0\">Total: ");
      out.print(order);
      out.write("</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 col-xl-3\">\n");
      out.write("                            <div class=\"bg-light rounded d-flex align-items-center justify-content-between p-4\">\n");
      out.write("                                <i class=\"fa fa-compact-disc fa-3x text-primary\"></i>\n");
      out.write("                                <div class=\"ms-3\">\n");
      out.write("                                    <p class=\"mb-2\">Singing Bowls</p>\n");
      out.write("                                    <h6 class=\"mb-0\">Total: ");
      out.print(bowl);
      out.write("</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 col-xl-3\">\n");
      out.write("                            <div class=\"bg-light rounded d-flex align-items-center justify-content-between p-4\">\n");
      out.write("                                <i class=\"fa fa-vihara fa-3x text-primary\"></i>\n");
      out.write("                                <div class=\"ms-3\">\n");
      out.write("                                    <p class=\"mb-2\">Statues</p>\n");
      out.write("                                    <h6 class=\"mb-0\">Total: ");
      out.print(statue);
      out.write("</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 col-xl-3\">\n");
      out.write("                            <div class=\"bg-light rounded d-flex align-items-center justify-content-between p-4\">\n");
      out.write("                                <i class=\"fa fa-bell fa-3x text-primary\"></i>\n");
      out.write("                                <div class=\"ms-3\">\n");
      out.write("                                    <p class=\"mb-2\">Tinghsa Bells</p>\n");
      out.write("                                    <h6 class=\"mb-0\">Total: ");
      out.print(bell);
      out.write("</h6>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Sale & Revenue End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Sales Chart Start -->\n");
      out.write("                <!-- <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("                    <div class=\"row g-4\">\n");
      out.write("                        <div class=\"col-sm-12 col-xl-6\">\n");
      out.write("                            <div class=\"bg-light text-center rounded p-4\">\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                                    <h6 class=\"mb-0\">Worldwide Sales</h6>\n");
      out.write("                                    <a href=\"\">Show All</a>\n");
      out.write("                                </div>\n");
      out.write("                                <canvas id=\"worldwide-sales\"></canvas>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-12 col-xl-6\">\n");
      out.write("                            <div class=\"bg-light text-center rounded p-4\">\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                                    <h6 class=\"mb-0\">Salse & Revenue</h6>\n");
      out.write("                                    <a href=\"\">Show All</a>\n");
      out.write("                                </div>\n");
      out.write("                                <canvas id=\"salse-revenue\"></canvas>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> -->\n");
      out.write("                <!-- Sales Chart End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Recent Sales Start -->\n");
      out.write("                <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("                    <div class=\"bg-light text-center rounded p-4\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                            <h6 class=\"mb-0\">Recent Orders</h6>\n");
      out.write("                            <a href=\"orders.jsp\">Show All</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"responsive\">\n");
      out.write("                            <table class=\"table text-start align-middle table-bordered table-hover mb-0\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <<tr class=\"text-dark\">\n");
      out.write("\n");
      out.write("                                        <th scope=\"col\">S.no.</th>\n");
      out.write("                                        <th scope=\"col\">Order Id</th>\n");
      out.write("                                        <th scope=\"col\">Date</th>\n");
      out.write("                                        <th scope=\"col\">Image</th>\n");
      out.write("                                        <th scope=\"col\">Product</th>\n");
      out.write("                                        <th scope=\"col\">Amount</th>\n");
      out.write("                                        <th scope=\"col\">Customer Name</th>\n");
      out.write("                                        <th scope=\"col\">Username</th>\n");
      out.write("                                        <th scope=\"col\">Email</th>\n");
      out.write("                                        <th scope=\"col\">Phone Number</th>\n");
      out.write("                                        <th scope=\"col\">Address</th>\n");
      out.write("                                        <th scope=\"col\">Status</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

//                                        User u = (User) session.getAttribute("userobj");
                                        OrderDAOImpl dao = new OrderDAOImpl(DBConnect.getConn());
                                        List<Order> list = dao.getAllOrder();
                                        int i = 1;
                                        int totalItems = list.size();
                                        int itemsToShow = Math.min(totalItems, 5);
                                        for (int index = 0; index < itemsToShow; index++) {
                                            Order o = list.get(index);
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(o.getOrder_id());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(o.getDate());
      out.write("</td>\n");
      out.write("                                        <td>INV-<img src=\"prod/");
      out.print(o.getImage());
      out.write("\" alt=\"product-item\" class=\"img-fluid\"></td>\n");
      out.write("                                        <td>");
      out.print(o.getProduct_name());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(o.getPrice());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(o.getFirst_name());
      out.write(' ');
      out.print(o.getLast_name());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(o.getUsername());
      out.write(" </td>\n");
      out.write("                                        <td>");
      out.print(o.getEmail());
      out.write(" </td>\n");
      out.write("                                        <td>");
      out.print(o.getPhone());
      out.write(" </td>\n");
      out.write("                                        <td>");
      out.print(o.getAddress());
      out.write(" </td>\n");
      out.write("                                        <td>");
      out.print(o.getStatus());
      out.write(" </td>\n");
      out.write("                                        <!--<td><a class=\"btn btn-sm btn-primary\" href=\"\">Detail</a></td>-->\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");
 i++;
                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Recent Sales End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Widgets Start -->\n");
      out.write("                <div class=\"container-fluid pt-4 px-4\">\n");
      out.write("                    <div class=\"row g-4\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-12 col-md-6 col-xl-4\">\n");
      out.write("                            <div class=\"h-100 bg-light rounded p-4\">\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                                    <h6 class=\"mb-0\">Calender</h6>\n");
      out.write("                                    <!-- <a href=\"\">Show All</a> -->\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"calender\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-12 col-md-6 col-xl-4\">\n");
      out.write("                            <div class=\"h-100 bg-light rounded p-4\">\n");
      out.write("                                <div class=\"d-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                                    <h6 class=\"mb-0\">To Do List</h6>\n");
      out.write("                                    <a href=\"\">Show All</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex mb-2\">\n");
      out.write("                                    <input class=\"form-control bg-transparent\" type=\"text\" placeholder=\"Enter task\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary ms-2\">Add</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex align-items-center border-bottom py-2\">\n");
      out.write("                                    <input class=\"form-check-input m-0\" type=\"checkbox\">\n");
      out.write("                                    <div class=\"w-100 ms-3\">\n");
      out.write("                                        <div class=\"d-flex w-100 align-items-center justify-content-between\">\n");
      out.write("                                            <span>Short task goes here...</span>\n");
      out.write("                                            <button class=\"btn btn-sm\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex align-items-center border-bottom py-2\">\n");
      out.write("                                    <input class=\"form-check-input m-0\" type=\"checkbox\">\n");
      out.write("                                    <div class=\"w-100 ms-3\">\n");
      out.write("                                        <div class=\"d-flex w-100 align-items-center justify-content-between\">\n");
      out.write("                                            <span>Short task goes here...</span>\n");
      out.write("                                            <button class=\"btn btn-sm\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex align-items-center border-bottom py-2\">\n");
      out.write("                                    <input class=\"form-check-input m-0\" type=\"checkbox\" checked>\n");
      out.write("                                    <div class=\"w-100 ms-3\">\n");
      out.write("                                        <div class=\"d-flex w-100 align-items-center justify-content-between\">\n");
      out.write("                                            <span><del>Short task goes here...</del></span>\n");
      out.write("                                            <button class=\"btn btn-sm text-primary\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex align-items-center border-bottom py-2\">\n");
      out.write("                                    <input class=\"form-check-input m-0\" type=\"checkbox\">\n");
      out.write("                                    <div class=\"w-100 ms-3\">\n");
      out.write("                                        <div class=\"d-flex w-100 align-items-center justify-content-between\">\n");
      out.write("                                            <span>Short task goes here...</span>\n");
      out.write("                                            <button class=\"btn btn-sm\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"d-flex align-items-center pt-2\">\n");
      out.write("                                    <input class=\"form-check-input m-0\" type=\"checkbox\">\n");
      out.write("                                    <div class=\"w-100 ms-3\">\n");
      out.write("                                        <div class=\"d-flex w-100 align-items-center justify-content-between\">\n");
      out.write("                                            <span>Short task goes here...</span>\n");
      out.write("                                            <button class=\"btn btn-sm\"><i class=\"fa fa-times\"></i></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Widgets End -->\n");
      out.write("                <!-- Back to Top -->\n");
      out.write("                <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- JavaScript Libraries -->\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("            <script src=\"lib/chart/chart.min.js\"></script>\n");
      out.write("            <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("            <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("            <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("            <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\n");
      out.write("            <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\n");
      out.write("            <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- Template Javascript -->\n");
      out.write("            <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- Modal -->\n");
      out.write("            <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h5 class=\"modal-title\" id=\"exampleModalLabel\"></h5>\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <h4>Do you want to logout??</h4>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                                <a href=\"../Logout\" type=\"button\" class=\"btn btn-primary\">Logout</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty userobj}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("        ");
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

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("login.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
