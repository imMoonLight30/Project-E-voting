<%-- 
    Document   : studentHome
    Created on : Mar 2, 2017, 3:00:47 PM
    Author     : vyas
--%>


<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="icon"  type="image/jpeg" href="logo.ico"/>
         <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
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
                    <li><a href="logout.jsp"></a>Logout</li>
                </ul>
        </div>
          
                
             <div style="position: relative">
                <div class="vmenu" style="float:left; width: 40%;">
                     <ul>
                    <li><a href="studentHome.jsp">Student Home</a></li>     
                    <li><a href="studentProfile.jsp" class="active">Profile</a></li>
                    <li><a href="castVotes.jsp">Cast Vote</a></li>  
                    <% String status = (String)session.getAttribute("status");
                        if(status.equals("Y")){
                    %>
                    <li><a href="ModifyProfile.jsp">Modify Profile</a></li>
                    <%}
                    else{
                    %>
                    <li><a href="applyCandidature.jsp">Apply for Candidature</a></li>
                    <%  }
                    %>
                    <li><a href="changePassword.jsp">Change Password</a></li>
                
                    <li><a href="complaints.jsp">Register A Complaint</a></li>
                    
                    
                </ul>
                </div>
        
            <div style="margin-left: 40%">
                <p style="margin-top: 20px; text-align: left;"><h2>STUDENT DETAILS</h2></p>
                    <%
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
                           String yearOfJoining= rs.getString(5);
                           String yearOfPassing= rs.getString(6);
                           int CurrentYear= rs.getInt(7);
                           String branch= rs.getString(8);
                           String mob= rs.getString(9);
                           String email= rs.getString(10);
                           
                          
                        %>  
                    
                <table>
                    <tr>
                      <th>Enrollment:</th>
                      <td><%=EnrollmentNo%></td>
                    </tr>
                    <tr>
                      <th>Name:</th>
                      <td><%=name%></td>
                    </tr>
                    <tr>
                      <th>Father's name:</th>
                      <td><%=fname%></td>
                    </tr>
                    <tr>
                      <th>DOB:</th>
                      <td><%=dob%></td>
                    </tr>
                    <tr>
                      <th>Year Of Join:</th>
                      <td><%=yearOfJoining%></td>
                    </tr><tr>
                      <th>Year Of Passing:</th>
                      <td><%=yearOfPassing%></td>
                    </tr><tr>
                      <th>Current Year:</th>
                      <td><%=CurrentYear%> Year</td>
                    </tr><tr>
                      <th>Branch:</th>
                      <td><%=branch%></td>
                    </tr><tr>
                      <th>Mobile:</th>
                      <td><%=mob%></td>
                    </tr><tr>
                      <th>Email:</th>
                      <td><%=email%></td>
                    </tr>
                  </table>
                
                
                 <%  
                    }catch(Exception e){}
                %>
                
            </div>
             </div>
            <div style="position: relative;">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>

