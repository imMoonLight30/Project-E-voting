package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class complaints_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"icon\"  type=\"image/jpeg\" href=\"logo.ico\"/>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"sheets/css1.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String name=session.getAttribute("sname").toString();
        
      out.write(" \n");
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
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("             \n");
      out.write("             <div style=\"position: relative\">\n");
      out.write("                <div class=\"vmenu\" style=\"float:left; width: 40%;\">\n");
      out.write("                     <ul>\n");
      out.write("                     <li><a href=\"studentHome.jsp\">Student Home</a></li>     \n");
      out.write("                    <li><a href=\"studentProfile.jsp\">Profile</a></li>\n");
      out.write("                    <li><a href=\"castVotes.jsp\">Cast Vote</a></li>  \n");
      out.write("                    ");
 String status = (String)session.getAttribute("status");
                        if(status.equals("Y")){
                    
      out.write("\n");
      out.write("                    <li><a href=\"ModifyProfile.jsp\">Modify Profile</a></li>\n");
      out.write("                    ");
}
                    else{
                    
      out.write("\n");
      out.write("                    <li><a href=\"applyCandidature.jsp\">Apply for Candidature</a></li>\n");
      out.write("                    ");
  }
                    
      out.write("\n");
      out.write("                    <li><a href=\"changePassword.jsp\">Change Password</a></li>\n");
      out.write("                \n");
      out.write("                    <li><a href=\"complaints.jsp\" class=\"active\">Register A Complaint</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div style=\"margin-left: 40%\">\n");
      out.write("                <p style=\"margin-top: 20px; text-align: left;\">REGISTER A COMPLAINT</p>\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Complaint Form</legend>\n");
      out.write("                <table>\n");
      out.write("                <form action=\"complaint\" method=\"post\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th> <label for=\"name\">Name <span>*</span></label></th>\n");
      out.write("                         <td> <input type=\"text\" name=\"name\" id=\"name\" value=\"\" size=\"22\" required><br></td></tr>\n");
      out.write("               <tr>\n");
      out.write("            &nbsp;&nbsp;&nbsp;<label for=\"email\">Mail <span>*</span></label>\n");
      out.write("            <input type=\"email\" name=\"mail\" id=\"email\" value=\"\" size=\"22\" required><br>\n");
      out.write("             <tr>\n");
      out.write("           <th> <label for=\"complaint\">Complaint <span>*</span></label></th>\n");
      out.write("          <td>  <br><textarea name=\"comment\" id=\"comment\" cols=\"25\" rows=\"10\" size=\"22\"></textarea><br></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <th> <input type=\"submit\" name=\"submit\" value=\"Submit Form\"></th>\n");
      out.write("          \n");
      out.write("              <td> <input type=\"reset\" name=\"reset\" value=\"Reset Form\"></td>\n");
      out.write("            </tr>       \n");
      out.write("        </form>\n");
      out.write("                </table>\n");
      out.write("                    </fieldset>\n");
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
