<%-- 
    Document   : managestudents
    Created on : 22 Mar, 2017, 12:02:26 AM
    Author     : admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Manage Students</title>
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
                    <li><a href="managestudents.jsp" class="active">Manage Students</a></li>
                    <li><a href="candidatureLines.jsp">Candidature lines</a></li>
                    <li><a href="approveCandidates.jsp">Approve Candidates</a></li>
                    <li><a href="votingLines.jsp">Voting Lines</a></li>
                    <li><a href="resultLines.jsp">Results Lines</a></li>
                    <li><a href="declareResults.html">Results</a></li>
                    <li><a href="seecomplaints.jsp">Complaints</a></li>
                </ul>
                </div>
                
            <div style="left:5%; margin-top: 25%;">
             
                <table>
                    <tr>
                        <th>EnrollmentNo</th>
                        <th>Name</th>
                        <th>FName</th>
                        <th>DateOfBirth</th><th></th>
                        <th>YearOfJoining</th>
                        <th>YearOfPassing</th>
                        <th>CurrentYear</th>
                        <th>Branch</th>
                        <th>Mobile</th><th></th>
                        <th>EmailId</th><th></th>
                        <th>EDIT</th>
                        <th>DELETE</th>
                    </tr>
                <%
try{ 
Class.forName(this.getServletContext().getInitParameter("condrv"));
                
            Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
PreparedStatement ps = con.prepareStatement("SELECT * FROM `student_details`");
ResultSet rs = ps.executeQuery();

while(rs.next()){
%>

<tr>
    <td><%=rs.getString(1) %></td>
    <td><%=rs.getString("Name") %></td>
    <td><%=rs.getString("FName") %></td>
    <td><%=rs.getDate("DOB") %><td>
    <td><%=rs.getInt("YearOfJoining") %></td>
     <td><%=rs.getInt("YearOfPassing") %></td>
    <td><%=rs.getInt("CurrentYear") %></td>
    <td><%=rs.getString("Branch") %></td>
    <td><%=rs.getString("Mobile") %><td>
        <td><%=rs.getString("email") %><td>
            <td>
                     <a href="edit1.jsp?EnrollmentNo=<%=rs.getString(1)%>">
                     <img src="edit.jpg" width="30" height="30"/>
                     </a>
            </td>
            <td>
                <a href="delete1.jsp?EnrollmentNo=<%=rs.getString(1)%>">
                 <img src="del.png" width="30" height="30"/>
               </a>
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

