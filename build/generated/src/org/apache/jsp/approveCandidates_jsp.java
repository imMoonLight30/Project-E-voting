package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class approveCandidates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("        <link rel=\"icon\"  type=\"image/jpeg\" href=\"logo.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sheets/css1.css\"/>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"checker.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            #menudiv{\n");
      out.write("                position: relative;\n");
      out.write("                background-color: white;\n");
      out.write("                    }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
           String message=(String)request.getAttribute("message");
      out.write("\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("           var msg=\"");
      out.print(message);
      out.write("\";\n");
      out.write("            if(msg!==\"null\")\n");
      out.write("              window.alert(msg);\n");
      out.write("        </script>\n");
      out.write("        <div>\n");
      out.write("        \n");
      out.write("        <div id=\"div1\">\n");
      out.write("            <img src=\"logo.jpg\" alt=\"No img available\"/>\n");
      out.write("            <h1>Online Electoral System</h1>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"menudiv\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.html\">About us</a></li>\n");
      out.write("                    <li><a href=\"candidates.html\">Candidates</a></li>\n");
      out.write("                    <li><a href=\"results.html\">Results</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                    <li>\n");
      out.write("                    <form action=\"logout\" method=\"post\" >\n");
      out.write("                    <input type=\"submit\" name=\"logout\" value=\"Logout\"></input>\n");
      out.write("                </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("             <div style=\"position: relative\">\n");
      out.write("                <div class=\"vmenu\" style=\"float:left; width: 40%;\">\n");
      out.write("                     <ul>\n");
      out.write("                    <li><a href=\"adminHome.jsp\"  class=\"active\">Admin Home</a></li>     \n");
      out.write("                    <li><a href=\"register.jsp\">Registration Form</a></li>\n");
      out.write("                    <li><a href=\"manageStudents.html\">Manage Students</a></li>\n");
      out.write("                    <li><a href=\"candidatureLines.jsp\">Candidature lines</a></li>\n");
      out.write("                    <li><a href=\"approveCandidates.jsp\">Approve Candidates</a></li>\n");
      out.write("                    <li><a href=\"votingLines.jsp\">Voting Lines</a></li>\n");
      out.write("                     <li><a href=\"resultLines.jsp\">Results Lines</a></li>\n");
      out.write("                    <li><a href=\"declareResults.html\">Results</a></li>\n");
      out.write("                    <li><a href=\"complaints.html\">Complaints</a></li>\n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("           <div style=\"margin-left: 40%\">\n");
      out.write("                <form action=\"#\" method=\"post\">\n");
      out.write("                    <fieldset>\n");
      out.write("                    <legend>SELECT POST</legend>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                        <th>Post</th>\n");
      out.write("                        <td><select name=\"Post\" selected=\"President\">\n");
      out.write("                                    <option value=\"President\">President</option>\n");
      out.write("                                    <option value=\"Vice-President\">Vice-President</option>\n");
      out.write("                                    <option value=\"Secretary\">Secretary</option> \n");
      out.write("                                </select></td></tr>\n");
      out.write("                        <tr> <th><input type=\"submit\" value=\"Approve\"></th><td></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                    </fieldset>\n");
      out.write("                </form>\n");
      out.write("                ");
 try{
                     Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
           
String Post = request.getParameter("Post");
          
           
        
          PreparedStatement ps = con.prepareStatement("SELECT `EnrollmentNo` FROM candidature_details WHERE `Post` = ?");
           if(Post == null){
          ps.setString(1,"President");
           }
           else{
           ps.setString(1,Post);
           }
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              String EnrollmentNo = rs.getString(1);
              PreparedStatement ps2 = con.prepareStatement("SELECT `Name` FROM `student_details` WHERE `EnrollmentNo`=?");
              ps2.setString(1,"EnrollmentNo");
              ResultSet rs2 = ps2.executeQuery();
              if(rs2.next()){
              
              
      out.write("\n");
      out.write("              <p>");
      out.print(EnrollmentNo);
      out.write("</p>&nbsp;\n");
      out.write("              <p>");
      out.print(rs2.getString(1));
      out.write("</p><br>\n");
      out.write("          ");
}
          }
            }catch(Exception e){
                out.println(e);
                  }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("             </div>\n");
      out.write("            <div style=\"position: relative\">\n");
      out.write("        <footer>All rights reserved</footer>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
