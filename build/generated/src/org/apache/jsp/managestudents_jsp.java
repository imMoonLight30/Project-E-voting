package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class managestudents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Manage Students</title>\n");
      out.write("        <link rel=\"icon\"  type=\"image/jpeg\" href=\"logo.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sheets/css1.css\"/>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"script/checker.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            #menudiv{\n");
      out.write("                position: relative;\n");
      out.write("                background-color: white;\n");
      out.write("                    }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("        \n");
      out.write("        <div id=\"div1\">\n");
      out.write("            <img src=\"logo.jpg\" alt=\"No img available\"/>\n");
      out.write("            <h1>Online Electoral System</h1>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"menudiv\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.html\">About us</a></li>\n");
      out.write("                    <li><a href=\"candidatesProfile.jsp\">Candidates</a></li>\n");
      out.write("                    <li><a href=\"results.jsp\">Results</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("             <form action=\"logout\" method=\"post\" >\n");
      out.write("                    <input type=\"submit\" name=\"logout\" value=\"Logout\">  \n");
      out.write("                </form>\n");
      out.write("            <div style=\"position: relative\">\n");
      out.write("                <div class=\"vmenu\" style=\"float:left; width: 40%;\">\n");
      out.write("                     <ul>\n");
      out.write("                    <li><a href=\"adminHome.jsp\">Admin Home</a></li>     \n");
      out.write("                    <li><a href=\"register.jsp\">Registration Form</a></li>\n");
      out.write("                    <li><a href=\"managestudents.jsp\" class=\"active\">Manage Students</a></li>\n");
      out.write("                    <li><a href=\"candidatureLines.jsp\">Candidature lines</a></li>\n");
      out.write("                    <li><a href=\"approveCandidates.jsp\">Approve Candidates</a></li>\n");
      out.write("                    <li><a href=\"votingLines.jsp\">Voting Lines</a></li>\n");
      out.write("                    <li><a href=\"resultLines.jsp\">Results Lines</a></li>\n");
      out.write("                    <li><a href=\"seecomplaints.jsp\">Complaints</a></li>\n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div style=\"position: relative;left:5%; margin-top: 25%;\">\n");
      out.write("             \n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>EnrollmentNo</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>FName</th>\n");
      out.write("                        <th>DateOfBirth</th><th></th>\n");
      out.write("                        <th>YearOfJoining</th>\n");
      out.write("                        <th>YearOfPassing</th>\n");
      out.write("                        <th>CurrentYear</th>\n");
      out.write("                        <th>Branch</th>\n");
      out.write("                        <th>Mobile</th><th></th>\n");
      out.write("                        <th>EmailId</th><th></th>\n");
      out.write("                        <th>EDIT</th>\n");
      out.write("                        <th>DELETE</th>\n");
      out.write("                    </tr>\n");
      out.write("                ");

try{ 
Class.forName(this.getServletContext().getInitParameter("condrv"));
                
            Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
PreparedStatement ps = con.prepareStatement("SELECT * FROM `student_details`");
ResultSet rs = ps.executeQuery();

while(rs.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print(rs.getString(1) );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("FName") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getDate("DOB") );
      out.write("<td>\n");
      out.write("    <td>");
      out.print(rs.getInt("YearOfJoining") );
      out.write("</td>\n");
      out.write("     <td>");
      out.print(rs.getInt("YearOfPassing") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getInt("CurrentYear") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Branch") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Mobile") );
      out.write("<td>\n");
      out.write("        <td>");
      out.print(rs.getString("email") );
      out.write("<td>\n");
      out.write("            <td>\n");
      out.write("                     <a href=\"edit1.jsp?EnrollmentNo=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                     <img src=\"edit.jpg\" width=\"30\" height=\"30\"/>\n");
      out.write("                     </a>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"delete1.jsp?EnrollmentNo=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                 <img src=\"del.png\" width=\"30\" height=\"30\"/>\n");
      out.write("               </a>\n");
      out.write("               </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative\">\n");
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
