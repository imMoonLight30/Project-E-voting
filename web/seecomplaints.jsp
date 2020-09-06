<%-- 
    Document   : seecomplaints
    Created on : 22 Mar, 2017, 1:40:08 PM
    Author     : monu
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>



<!DOCTYPE html>
<html>
    <head>
        <title>Compaints</title>
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
                    <li><a href="contact.jsp">Contact Us</a></li>
                    <li><a href="logout.jsp">Logout</a></li>
                    </ul>
            </div>
             <div style="position: relative">
                <div class="vmenu" style="float:left; width: 40%;">
                     <ul>
                     <li><a href="adminHome.jsp">Admin Home</a></li>     
                    <li><a href="register.jsp">Registration Form</a></li>
                    <li><a href="managestudents.jsp">Manage Students</a></li>
                    <li><a href="candidatureLines.jsp">Candidature lines</a></li>
                    <li><a href="approveCandidates.jsp">Approve Candidates</a></li>
                    <li><a href="votingLines.jsp">Voting Lines</a></li>
                     <li><a href="resultLines.jsp">Results Lines</a></li>                   
                    <li><a href="seecomplaints.jsp" class="active">Complaints</a></li>
                </ul>
                </div>
                
            <div style="margin-left: 40%">
                <h2 align="center"><font><strong>Complaints</strong></font></h2>
<table>

<tr bgcolor="lightblue">
<th><b>Name</b></th>
<th><b>mail id</b></th>
<th><b>Comment</b></th>
<th><b>Status</b></th>
<th><b>Update</b></th>
</tr>
               
                <%
try{ 
Class.forName(this.getServletContext().getInitParameter("condrv"));
                
            Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
PreparedStatement ps = con.prepareStatement("SELECT * FROM `complaints` WHERE `status`='N'");
ResultSet rs = ps.executeQuery();

while(rs.next()){
%>

<tr>
    <td><%=rs.getString("name") %></td>
    <td><%=rs.getString("mail") %></td>
    <td><%=rs.getString("comment") %></td>
    <td><%=rs.getString("status") %><td>
    <td><a href="checked?mail=<%=rs.getString(2)%>">
         <img src="right.jpe" alt="checked" width="30" height="30"/>
    </td>
</tr>


<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>


                
</table>  
            </div>
            </div>
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>


