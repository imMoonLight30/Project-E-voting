<%-- 
    Document   : seeCandidateProfile
    Created on : Mar 29, 2017, 1:26:46 PM
    Author     : dashmeetkaur
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Online Electoral System</title>
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
                    %><li><a href="logout.jsp">Logout</a></li><% } %>
                    
                </ul>
        </div>
            <div>
                <%
                    try{
                      String EnrollmentNo=request.getParameter("candidateEnrollmentNo");
                      String name=request.getParameter("candidateName");
                      String post=request.getParameter("post");
                      String branch=request.getParameter("branch");
                      Class.forName("com.mysql.jdbc.Driver");
                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
                      PreparedStatement ps=con.prepareStatement("Select * from candidature_profile where EnrollmentNo=?");
                      ps.setString(1,EnrollmentNo);
                      ResultSet rs=ps.executeQuery();
                      rs.next();
                      String bgcolor=rs.getString("newcolor");
                      String textcolor=rs.getString("textcolor");
                      String heading=rs.getString("heading");
                      String text=rs.getString("text");
                      %>
                      <div style="color:<%=textcolor%>; background:<%=bgcolor%>; min-height:500px;">
                       <button onclick="history.go(-1)">BACK</button>   
                          <h1 style="text-align:center"><%=name%></h1>
                          <h3 style="text-align:center"><%=branch%></h3>
                          <h4 style="text-align:center">For Post: <%=post%></h4>
                          <h2 style="text-align:center"><%=heading%></h2>
                          <p style="margin-left:10%"><%=text%></p>
                          
                          
                      </div>
                    <%
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