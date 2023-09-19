package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Welcome to Food Store</title>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("           \n");
      out.write("            background-color: #000;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    background-color:navy;\n");
      out.write("    color: #fff;\n");
      out.write("    text-decoration: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    transition: background-color 0.3s ease;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("        .imgg\n");
      out.write("        {\n");
      out.write("            width:98%;\n");
      out.write("            height:500px;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background: black;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .setting{\n");
      out.write("            width:100%; \n");
      out.write("            height: 100%;\n");
      out.write("            padding-right: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header h1 {\n");
      out.write("            font-size: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("            <div class=\"imgg\">\n");
      out.write("                <img class=\"setting\" src=\"food 4.jpg\" alt=\"Main\">\n");
      out.write("             </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    <header class=\"header\">\n");
      out.write("        <h1>Welcome to Food Store</h1>\n");
      out.write("        <p>Whatever you love to eat is here.</p>\n");
      out.write("        <a href=\"home.jsp\" class=\"btn\">Food Store</a>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <title>Welcome Page</title>\n");
      out.write("</head>\n");
      out.write("<style> {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f0f0f0;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".welcome-container {\n");
      out.write("    background-color: #3498db;\n");
      out.write("    color: #fff;\n");
      out.write("    padding: 100px;\n");
      out.write("    text-align: center;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\n");
      out.write("    margin: 100px auto;\n");
      out.write("    max-width: 600px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    font-size: 36px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("    font-size: 20px;\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    background-color: #2ecc71;\n");
      out.write("    color: #fff;\n");
      out.write("    text-decoration: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    transition: background-color 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    background-color: #27ae60;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <div class=\"welcome-container\">\n");
      out.write("        <h1>Welcome to Our Website</h1>\n");
      out.write("        <p>Discover the world of creativity!</p>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>-->\n");
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
