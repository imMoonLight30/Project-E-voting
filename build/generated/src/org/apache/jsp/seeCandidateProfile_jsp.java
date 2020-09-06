package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class seeCandidateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Electoral System</title>\r\n");
      out.write("        <link rel=\"icon\"  type=\"image/jpeg\" href=\"logo.ico\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sheets/css1.css\"/>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <script src=\"script/checker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("            #menudiv{\r\n");
      out.write("                position: relative;\r\n");
      out.write("                background-color: white;\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"div1\">\r\n");
      out.write("            <img src=\"logo.jpg\" alt=\"No img available\"/>\r\n");
      out.write("            <h1>Online Electoral System</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div id=\"menudiv\">\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"aboutus.html\">About us</a></li>\r\n");
      out.write("                    <li><a href=\"candidatesProfile.jsp\">Candidates</a></li>\r\n");
      out.write("                    <li><a href=\"results.html\">Results</a></li>\r\n");
      out.write("                    <li><a href=\"login.html\" class=\"active\">Login</a></li>\r\n");
      out.write("                    <li><a href=\"contactus.html\">Contact Us</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                ");

                    try{
                      String EnrollmentNo=request.getParameter("candidateEnrollmentNo");
                      String name=request.getParameter("candidateName");
                      String post=request.getParameter("post");
                      Class.forName("com.mysql.jdbc.Driver");
                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oes","root","mysql");
                      PreparedStatement ps=con.prepareStatement("Select * from candidature_profile where EnrollmentNo=?");
                      ps.setString(1,EnrollmentNo);
                      ResultSet rs=ps.executeQuery();
                      rs.next();
                      String bgcolor=rs.getString("newcolor");
                      String textcolor=rs.getString("textcolor");
                      String heading=rs.getString("heading");
                      String text=rs.getString("text");
                      
      out.write("\r\n");
      out.write("                      <div style=\"color:");
      out.print(textcolor);
      out.write("; background:");
      out.print(bgcolor);
      out.write("; min-height:500px;\">\r\n");
      out.write("                       <button onclick=\"history.go(-1)\">BACK</button>   \r\n");
      out.write("                          <h1 style=\"text-align: center\">");
      out.print(name);
      out.write("</h1>\r\n");
      out.write("                          <h4 style=\"text-align:center\">For Post: ");
      out.print(post);
      out.write("</h4>\r\n");
      out.write("                          <h2 style=\"text-align:center\">");
      out.print(heading);
      out.write("</h2>\r\n");
      out.write("                          <p style=\"margin-left:10%\">");
      out.print(text);
      out.write("</p>\r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                    ");

                    }catch(Exception e)
                    {
                        out.println(e);
                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div style=\"position: relative\">\r\n");
      out.write("        <footer>All rights reserved</footer>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
