package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class images_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Multiple Images Page</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .image-container {\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: repeat(2, 1fr); /* You can adjust the number of columns as needed */\n");
      out.write("            grid-gap: 0px;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .image {\n");
      out.write("            height: 50%;\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 500px; /* Adjust the maximum width of the images as needed */\n");
      out.write("           \n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("           \n");
      out.write("            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"image-container\">\n");
      out.write("        <div class=\"image\">\n");
      out.write("            <img src=\"Owl, dark, glowing eyes, muzzle, 720x1280 wallpaper.jpeg\" alt=\"Image 1\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"image\">\n");
      out.write("            <img src=\"Owl Glowing Eyes Wallpapers _ hdqwalls_com.jpeg\" alt=\"Image 2\">\n");
      out.write("        </div>\n");
      out.write("<!--        <div class=\"image\">\n");
      out.write("            <img src=\"Owl, dark, glowing eyes, muzzle, 720x1280 wallpaper.jpeg\" alt=\"Image 3\">\n");
      out.write("        </div>-->\n");
      out.write("        <!-- Add more image divs as needed -->\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
