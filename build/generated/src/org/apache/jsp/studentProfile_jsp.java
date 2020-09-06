package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studentProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div>\n");
      out.write("        \n");
      out.write("        <div id=\"div1\">\n");
      out.write("            <img src=\"logo.jpg\" alt=\"No img available\"/>\n");
      out.write("            <h1>Online Electoral System</h1>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("            <div id=\"menudiv\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.html\">About us</a></li>\n");
      out.write("                    <li><a href=\"candidatesProfile.jsp\">Candidates</a></li>\n");
      out.write("                    <li><a href=\"results.html\">Results</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                    <li>\n");
      out.write("                    <form action=\"logout\" method=\"post\" >\n");
      out.write("                    <input type=\"submit\" name=\"logout\" value=\"Logout\"></input>\n");
      out.write("                </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("             <div style=\"position: relative\">\n");
      out.write("                <div class=\"vmenu\" style=\"float:left; width: 40%;\">\n");
      out.write("                     <ul>\n");
      out.write("                    <li><a href=\"studentHome.html\"  class=\"active\">Student Home</a></li>     \n");
      out.write("                    <li><a href=\"studentProfile.jsp\">Profile</a></li>\n");
      out.write("                    <li><a href=\"castVote.jsp\">Cast Vote</a></li>\n");
      out.write("                    <li><a href=\"ModifyProfile.jsp\">Modify Profile</a></li>\n");
      out.write("                    <li><a href=\"applyCandidature.jsp\">Apply for Candidature</a></li>\n");
      out.write("                    <li><a href=\"changePassword.jsp\">Change Password</a></li>\n");
      out.write("                    <li><a href=\"seeResults.html\">See Results</a></li>\n");
      out.write("                    <li><a href=\"registerComplaint.html\">Register A Complaint</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                ");

                    try{
                      String EnrollmentNo = (String)session.getAttribute("EnrollmentNo");
                      Class.forName(this.getServletContext().getInitParameter("condrv"));
                      Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
                      PreparedStatement ps = con.prepareStatement("SELECT * FROM `student_details` WHERE `EnrollmentNo`=?");
                      ps.setString(1,EnrollmentNo);
                      ResultSet rs = ps.executeQuery();
                      boolean found = rs.next();
                      
                           String name= rs.getString(2);
                           String fname= rs.getString(3);
                           String dob= rs.getString(4);
                           String yearOfJoin= rs.getString(5);
                           String yearOfPassing= rs.getString(6);
                           int CurrentYear= rs.getInt(7);
                           String branch= rs.getString(8);
                           int mob= rs.getInt(9);
                           String email= rs.getString(10);
                        
      out.write("  \n");
      out.write("                    \n");
      out.write("                <table style=\"width:100%\">\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Enrollment:</th>\n");
      out.write("                      <td>");
      out.print(EnrollmentNo);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Name:</th>\n");
      out.write("                      <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Father's name:</th>\n");
      out.write("                      <td>");
      out.print(fname);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>DOB:</th>\n");
      out.write("                      <td>");
      out.print(dob);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Year Of Join:</th>\n");
      out.write("                      <td>");
      out.print(yearOfJoin);
      out.write("</td>\n");
      out.write("                    </tr><tr>\n");
      out.write("                      <th>Year Of Passing:</th>\n");
      out.write("                      <td>");
      out.print(yearOfPassing);
      out.write("</td>\n");
      out.write("                    </tr><tr>\n");
      out.write("                      <th>Current Year:</th>\n");
      out.write("                      <td>");
      out.print(3);
      out.write(" Year</td>\n");
      out.write("                    </tr><tr>\n");
      out.write("                      <th>Brancht:</th>\n");
      out.write("                      <td>");
      out.print(branch);
      out.write("</td>\n");
      out.write("                    </tr><tr>\n");
      out.write("                      <th>Mobile:</th>\n");
      out.write("                      <td>");
      out.print(mob);
      out.write("</td>\n");
      out.write("                    </tr><tr>\n");
      out.write("                      <th>Email:</th>\n");
      out.write("                      <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                  </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 ");
  
                    }catch(Exception e){}
                
      out.write("\n");
      out.write("                \n");
      out.write("            <div style=\"margin-left: 40%\">\n");
      out.write("                <p style=\"margin-top: 20px; text-align: left;\"><h2>STUDENT DETAILS</h2></p>\n");
      out.write("            </div>\n");
      out.write("             </div>\n");
      out.write("            <div style=\"position: relative;\">\n");
      out.write("        <footer>All rights reserved</footer>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
