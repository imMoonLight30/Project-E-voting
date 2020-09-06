package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"icon\"  type=\"image/jpeg\" href=\"logo.ico\"/>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"sheets/css1.css\"/>\n");
      out.write("\t\t <script type=\"text/javascript\" src=\"http://ajax.aspnetcdn.com/ajax/jquery/jquery-1.7.1.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.17/jquery-ui.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"about.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.17/themes/smoothness/jquery-ui.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("        \n");
      out.write("        <div id=\"div1\">\n");
      out.write("            <img src=\"logo.jpg\" alt=\"No img available\"/>\n");
      out.write("            <h1>Online Electoral System</h1>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("            <div id=\"menudiv\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.html\">About us</a></li>\n");
      out.write("                    <li><a href=\"candidatesProfile.jsp\">Candidates</a></li>\n");
      out.write("                    <li><a href=\"results.jsp\">Results</a></li>\n");
      out.write("                     ");
 int loggedin=1;
                        if(session.getAttribute("LoggedIn")==null) {
                     loggedin=0; 
      out.write("\n");
      out.write("                    <li><a href=\"login.jsp\" >Login</a></li> ");
 } 
      out.write("\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                    ");

                        if(loggedin==1){
                    
      out.write("<li><a href=\"logout.jsp\">Logout</a></li>");
 } 
      out.write("\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"Content\">\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"tabs\">\n");
      out.write("\t<ul>\n");
      out.write("\t\n");
      out.write("\t\t<li><a href=\"#tabs-1\">Application Overview</a></li>\n");
      out.write("\t\t<li><a href=\"#tabs-2\">Our Team</a></li>\n");
      out.write("\t\n");
      out.write("\t</ul>\n");
      out.write("\t<div id=\"tabs-1\">\n");
      out.write("\t\t<p><h5>Online Electoral System is a full-service provider of secure, hosted online elections. It provides a completely new voting experience to the user.  Our voting system is constantly evolving with technology and security innovations. This system currently aims at providing an elecion system which may be useful for holding secure, unbiased and systematic election inside an institution. It is an online system through which students can get logged in to the website and can vote for their desired candidate or even apply for the various posts available.\n");
      out.write("\t\tThe system is capable of maintaining details of various Students, Applicants and storing the votes of the voters in its database.\n");
      out.write("\t\tThe\tcentral concept of the system is to get the applications for various posts, shortlist the applicants, perform the voting procedure and declare results.\n");
      out.write("\t\t</h5></p>\n");
      out.write("\t\t<p><strong>Our Mission</strong>: <h5>To achieve excellence providing secure and efficient voting solutions and to create value for the organizations we serve.</h5></p>\n");
      out.write("\t\t<p><strong>Our People</strong>: <h5>Dedicated staff who understand that transparency and perfection are a must in this industry.</h5></p>\n");
      out.write("\t\t<p><strong>Our Strengths</strong>: <h5>Timely customer service, simplicity of design, high security, and the ability to deliver custom solutions.</h5></p>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("                    <style>\n");
      out.write("            .wrapper .post {\n");
      out.write("-moz-border-radius:7px 7px 7px 7px;\n");
      out.write("border:1px solid silver;\n");
      out.write("float:left;\n");
      out.write("margin:10px;\n");
      out.write("min-height:100px;\n");
      out.write("padding:5px;\n");
      out.write("width:250px;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("\t<div id=\"tabs-2\" class=\"wrapper\">\n");
      out.write("\t<h3><strong>Management Team</strong></h3>\n");
      out.write("        \n");
      out.write("                <div class=\"post\" style=\"background-color:teal;color:white;padding:20px;display: inline-block;\">\n");
      out.write("                    <h3>Akshay<br> Vyas</h3>\n");
      out.write("                    <p>0801CS141007</p>              \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"post\" style=\"background-color:teal;color:white;padding:20px;display: inline-block;\">\n");
      out.write("                    <h3>Dashmeet Kaur Chawla</h3>\n");
      out.write("                    <p>0801CS141026</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"post\" style=\"background-color:teal;color:white;padding:20px;display: inline-block;\">\n");
      out.write("                    <h3>Chandra Prakash Singh Sengar</h3>\n");
      out.write("                    <p>0801CS141023</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"post\" style=\"background-color:teal;color:white;padding:20px;display: inline-block;\">\n");
      out.write("                    <h3>Chaitanya Chauganjkar</h3>\n");
      out.write("                    <p>0801CS141022</p>\n");
      out.write("                </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("<div class=\"sections_group\">\n");
      out.write("<div class=\"entry-content\" itemprop=\"mainContentOfPage\">\n");
      out.write(" \n");
      out.write("<h3>Find out more</h3> <div class=\"textwidget\"></h6>Call us at : <span class=\"number\">0731-437-8909</span></h6>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("<div style=\"position: relative;\">\n");
      out.write("        <footer>All rights reserved</footer>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
