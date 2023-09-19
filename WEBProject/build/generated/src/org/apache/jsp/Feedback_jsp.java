package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header {\n");
      out.write("    background-color: #333;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("main {\n");
      out.write("    max-width: 800px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    padding: 2rem;\n");
      out.write("    font-size: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 0.5rem;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"email\"],\n");
      out.write("select,\n");
      out.write("textarea {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 0.5rem;\n");
      out.write("    margin-bottom: 1rem;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    font-size: 20px;\n");
      out.write("    font-style: italic;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color: #333;\n");
      out.write("    color: #fff;\n");
      out.write("    padding: 0.5rem 1rem;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    background-color: #555;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<title>Food Store Feedback</title>\n");
      out.write("<body background='Navy-Blue-Background1s-Free.png'>\n");
      out.write("    <header>\n");
      out.write("        <h1>Food Store Feedback</h1>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    <main>\n");
      out.write("        <form action=\"feedbackLogic.jsp\">\n");
      out.write("            <label for=\"name\">Name:</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("            <label for=\"rating\">Rating:</label>\n");
      out.write("            <select id=\"rating\" name=\"rating\" required>\n");
      out.write("                <option value=\"5\">5 - Excellent</option>\n");
      out.write("                <option value=\"4\">4 - Very Good</option>\n");
      out.write("                <option value=\"3\">3 - Good</option>\n");
      out.write("                <option value=\"2\">2 - Fair</option>\n");
      out.write("                <option value=\"1\">1 - Poor</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"comments\">Comments:</label>\n");
      out.write("            <textarea id=\"comments\" name=\"comments\" rows=\"4\" required></textarea>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Submit Feedback</button>\n");
      out.write("        </form>\n");
      out.write("    </main>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write(" \n");
      out.write("\n");
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
