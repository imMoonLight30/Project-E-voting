<%-- 
    Document   : delete1.jsp
    Created on : 29 Mar, 2017, 11:32:31 PM
    Author     : monu
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                        String EnrollmentNo= request.getParameter("EnrollmentNo");
try{ 
    out.print(EnrollmentNo);
    ResultSet rs=null;
Class.forName(this.getServletContext().getInitParameter("condrv"));
                
            Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");

PreparedStatement ps = con.prepareStatement("DELETE FROM `student_details` WHERE EnrollmentNo=?");
ps.setString(1, EnrollmentNo); 
 int i = ps.executeUpdate();
 if(i==1){
 request.setAttribute("message","Student Deleted Successfully...");
 }
 else{
  request.setAttribute("message","Error!! Student not Deleted Successfully...");
 }
RequestDispatcher rd = request.getRequestDispatcher("managestudents.jsp");
rd.include(request, response);
%>


<% 
    
} catch (Exception e) {
out.println(e);
e.printStackTrace();
}

%>  
    </body>
</html>
