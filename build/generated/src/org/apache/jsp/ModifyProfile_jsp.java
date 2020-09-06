package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ModifyProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Modify Profile</title>\r\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("         <link rel=\"icon\"  type=\"image/jpeg\" href=\"logo.ico\"/>\r\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"sheets/css1.css\"/>\r\n");
      out.write("         <script>\r\n");
      out.write("              function changecolor(id1,id2)\r\n");
      out.write("              {\r\n");
      out.write("                  var x=document.getElementById(id1).elements[0].value;\r\n");
      out.write("                  document.getElementById(id2).style.backgroundColor=x;\r\n");
      out.write("                  \r\n");
      out.write("              }\r\n");
      out.write("              function popup_show(id)\r\n");
      out.write("              {\r\n");
      out.write("                  document.getElementById(id).style.display='block';\r\n");
      out.write("              }\r\n");
      out.write("              function popup_hide(id)\r\n");
      out.write("              {\r\n");
      out.write("                  document.getElementById(id).style.display='none';\r\n");
      out.write("              }\r\n");
      out.write("              function savetext(id1)\r\n");
      out.write("              {\r\n");
      out.write("                  var textcolor=document.getElementById(id1).elements[1].value;\r\n");
      out.write("                  var h1=document.getElementById(id1).elements[2].value;\r\n");
      out.write("                  var text=document.getElementById(id1).elements[3].value;\r\n");
      out.write("                  document.getElementById('p1').style.color=textcolor;\r\n");
      out.write("                  document.getElementById('h1').innerHTML=h1;\r\n");
      out.write("                  document.getElementById('h1').style.color=textcolor;\r\n");
      out.write("                  document.getElementById('p1').innerHTML=text;\r\n");
      out.write("                  \r\n");
      out.write("              }\r\n");
      out.write("              function saveChange(id1,id2)\r\n");
      out.write("              {\r\n");
      out.write("                     document.getElementById(id2).style.display='none';\r\n");
      out.write("                     savetext(id1);\r\n");
      out.write("              }\r\n");
      out.write("              function submitForm(id1)\r\n");
      out.write("              {\r\n");
      out.write("                  document.getElementById(id1).submit();\r\n");
      out.write("              }\r\n");
      out.write("             </script>\r\n");
      out.write("             \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("          ");
 session.setAttribute("EnrollmentNo","0801CS141002"); 
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"div1\">\r\n");
      out.write("            <img src=\"logo.jpg\" alt=\"No img available\"/>\r\n");
      out.write("            <h1>Online Electoral System</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("           \r\n");
      out.write("            <div id=\"menudiv\">\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"aboutus.html\">About us</a></li>\r\n");
      out.write("                    <li><a href=\"candidates.html\">Candidates</a></li>\r\n");
      out.write("                    <li><a href=\"results.html\">Results</a></li>\r\n");
      out.write("                    <li><a href=\"contactus.html\">Contact Us</a></li>\r\n");
      out.write("                    <li><a href=\"index.html\"><button id=\"logoutButton\" value=\"Logout\">Logout</button></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("             <div style=\"position: relative; min-height: 600px;\">\r\n");
      out.write("                <div class=\"vmenu\" style=\"float:left; width: 40%;\">\r\n");
      out.write("                     <ul>\r\n");
      out.write("                    <li><a href=\"studentHome.jsp\">Student Home</a></li>     \r\n");
      out.write("                    <li><a href=\"studentProfile.html\">Profile</a></li>\r\n");
      out.write("                    <li><a href=\"castVote.html\">Cast Vote</a></li>\r\n");
      out.write("                    <li><a href=\"candidateDetails.html\">Candidate Details</a></li>\r\n");
      out.write("                    <li><a href=\"modifyProfile.jsp\" class=\"active\">Modify Profile</a></li>\r\n");
      out.write("                    <li><a href=\"changePassword.html\">Change Password</a></li>\r\n");
      out.write("                    <li><a href=\"seeResults.html\">See Results</a></li>\r\n");
      out.write("                    <li><a href=\"registerComplaint.html\">Register A Complaint</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <div style=\"margin-left: 20%; position: absolute;\">\r\n");
      out.write("                     \r\n");
      out.write("                     ");
 
                            String EnrollmentNo=session.getAttribute("EnrollmentNo").toString();
                            String heading="";
                            String newcolor="";
                            String textcolor="";
                            String text="";
                            try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
                            PreparedStatement ps=con.prepareStatement("Select * from candidature_profile where EnrollmentNo=?");
                            ps.setString(1,EnrollmentNo);
                            ResultSet rs=ps.executeQuery();
                            if(rs.next())
                            {
                                heading=rs.getString("heading");
                                newcolor=rs.getString("newcolor");
                                textcolor=rs.getString("textcolor");
                                text=rs.getString("text");
                            }
                            }
                            catch(Exception e)
                            {
                                out.println(e);
                            }
                        
      out.write("\r\n");
      out.write("                 <div id=\"workarea\" style=\"left:0;margin-left: 0; margin-top: 5%; min-height: 300px; width: 1050px; overflow: auto; color: '");
      out.print(newcolor);
      out.write("'\">\r\n");
      out.write("                     <button onclick=\"popup_show('box1')\">Change Properties</button>\r\n");
      out.write("                       \r\n");
      out.write("                     <h1 id=\"h1\" style=\"text-align:center; font-size: 70px; color: '");
      out.print(textcolor);
      out.write("'\">");
      out.print(heading);
      out.write("</h1><br/><br/>\r\n");
      out.write("                   \r\n");
      out.write("                     <p id=\"p1\" style=\"text-align:center; font-size: 30px; color: '");
      out.print(textcolor);
      out.write("'\">");
      out.print(text);
      out.write("</p>\r\n");
      out.write("                         \r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                  <div id=\"box1\" style=\"display: none; z-index: 10;\">\r\n");
      out.write("                     \r\n");
      out.write("                     <form action=\"modifyProfile\" method=\"get\" id=\"form1\">\r\n");
      out.write("                         <table>\r\n");
      out.write("                             <tr><td>Color</td><td> <input type=\"color\" name=\"newcolor\" onchange=\"changecolor('form1','workarea')\"></td></tr>\r\n");
      out.write("                             <tr><td>Text Color</td><td> <input type=\"color\" name=\"textcolor\"></td></tr>\r\n");
      out.write("                             <tr><td>Heading</td><td> <input type=\"text\" name=\"heading\"></td></tr>\r\n");
      out.write("                             <tr><td colspan=\"2\">What would you like to say??<br/><textarea name=\"text\" rows=\"10\" cols=\"40\">Write your views</textarea></td></tr>\r\n");
      out.write("                         </table>\r\n");
      out.write("                         \r\n");
      out.write("                     </form>\r\n");
      out.write("                      <button onclick=\"saveChange('form1','box1')\">Change</button><br/><br/>\r\n");
      out.write("                  </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <button onclick=\"submitForm('form1')\">Save Change</button><br/><br/>   \r\n");
      out.write("               </div>\r\n");
      out.write("                 \r\n");
      out.write("             </div>\r\n");
      out.write("             \r\n");
      out.write("            <div style=\"position: relative;\">\r\n");
      out.write("        <footer>All rights reserved</footer>\r\n");
      out.write("        </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        </body>\r\n");
      out.write("</html>\r\n");
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
