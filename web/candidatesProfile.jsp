<%-- 
    Document   : candidatesProfile
    Created on : Mar 29, 2017, 12:09:30 PM
    Author     : dashmeetkaur
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Candidates</title>
        <link rel="icon"  type="image/jpeg" href="logo.ico"/>
        <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="script/checker.js" type="text/javascript"></script>
        <style>
            
            #menudiv{
                position: relative;
                background-color: white;
                    }
                    
        </style>
    </head>
    <body>
        <div>
        
        <div id="div1">
            <img src="logo.jpg" alt="No img available"/>
            <h1>Online Electoral System</h1>
        </div>
            <div id="menudiv">
                <ul class="menu">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="about.jsp">About us</a></li>
                    <li><a href="candidatesProfile.jsp">Candidates</a></li>
                    <li><a href="results.jsp">Results</a></li>
                     <% int loggedin=1;
                        if(session.getAttribute("LoggedIn")==null) {
                     loggedin=0; %>
                    <li><a href="login.jsp" >Login</a></li> <% } %>
                    <li><a href="contact.jsp">Contact Us</a></li>
                    <%
                        if(loggedin==1){
                    %><li><a href="logout.jsp">Logout</a></li><% }%>
                </ul>
        </div>
            <div style='margin-left: 40%; min-height: 400px;'>
                <%
                    try{
                      Class.forName("com.mysql.jdbc.Driver");
                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
                      PreparedStatement ps=con.prepareStatement("Select Name,EnrollmentNo,Branch from student_details natural join candidature_details c where post=? and status=?");
                      String posts[]={"President","Vice-President","Secretary"};
                      for(int i=0;i<3;i++)
                      {
                %><h2>Post: <%=posts[i]%></h2> <%
                      ps.setString(1,posts[i]);
                      ps.setString(2,"Y");
                      ResultSet rs=ps.executeQuery();
                      if(!rs.next())
                      {
                        %>No one has been approved yet<%
                      }
                      else{
                         rs.beforeFirst();
                        %> <ul class="vmenu" style="width:150px; list-style-type: none;"> <%
                         while(rs.next())
                        { %>                    
                        <li class="vmenu"><a href='seeCandidateProfile.jsp?candidateEnrollmentNo=<%=rs.getString(2)%>&candidateName=<%=rs.getString(1)%>&post=<%=posts[i]%>&branch=<%=rs.getString(3)%>'><%=rs.getString(1)%></a></li>
                         <%}
                          %></ul><%
                      }
                     }
                    }catch(Exception e)
                    {
                        out.println(e);
                    }
%>
            </div>
            
            
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>