package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class khalti_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <script src=\"https://khalti.s3.ap-south-1.amazonaws.com/KPG/dist/2020.12.17.0.0.0/khalti-checkout.iffe.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ...\n");
      out.write("    <!-- Place this where you need payment button -->\n");
      out.write("    <button id=\"payment-button\">Pay with Khalti</button>\n");
      out.write("    <!-- Place this where you need payment button -->\n");
      out.write("    <!-- Paste this code anywhere in you body tag -->\n");
      out.write("    <script>\n");
      out.write("        var config = {\n");
      out.write("            // replace the publicKey with yours\n");
      out.write("            \"publicKey\": \"test_public_key_dc74e0fd57cb46cd93832aee0a390234\",\n");
      out.write("            \"productIdentity\": \"1234567890\",\n");
      out.write("            \"productName\": \"Dragon\",\n");
      out.write("            \"productUrl\": \"http://gameofthrones.wikia.com/wiki/Dragons\",\n");
      out.write("            \"paymentPreference\": [\n");
      out.write("                \"KHALTI\",\n");
      out.write("                \"EBANKING\",\n");
      out.write("                \"MOBILE_BANKING\",\n");
      out.write("                \"CONNECT_IPS\",\n");
      out.write("                \"SCT\",\n");
      out.write("                ],\n");
      out.write("            \"eventHandler\": {\n");
      out.write("                onSuccess (payload) {\n");
      out.write("                    // hit merchant api for initiating verfication\n");
      out.write("                    console.log(payload);\n");
      out.write("                },\n");
      out.write("                onError (error) {\n");
      out.write("                    console.log(error);\n");
      out.write("                },\n");
      out.write("                onClose () {\n");
      out.write("                    console.log('widget is closing');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var checkout = new KhaltiCheckout(config);\n");
      out.write("        var btn = document.getElementById(\"payment-button\");\n");
      out.write("        btn.onclick = function () {\n");
      out.write("            // minimum transaction amount must be 10, i.e 1000 in paisa.\n");
      out.write("            checkout.show({amount: 1000});\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <!-- Paste this code anywhere in you body tag -->\n");
      out.write("    ...\n");
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
}
