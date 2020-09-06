<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Admin Home</title>
        <link rel="icon"  type="image/jpeg" href="logo.ico"/>
        <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="checker.js" type="text/javascript"></script>
        <style>
            #menudiv{
                position: relative;
                background-color: white;
                    }
        </style>
    </head>
    <body>
        <% 
           String message=(String)request.getAttribute("message");
          
        %>
          <script type="text/javascript">
           var msg="<%=message%>";
            if(msg!=="null")
              window.alert(msg);
        </script>
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
                    <li><a href="approveCandidates.jsp"  class="active">Approve Candidates</a></li>
                    <li><a href="votingLines.jsp">Voting Lines</a></li>
                     <li><a href="resultLines.jsp">Results Lines</a></li>
                    <li><a href="declareResults.html">Results</a></li>
                    <li><a href="seecomplaints.jsp">Complaints</a></li>
                </ul>
                </div>
                
           <div style="margin-left: 40%">
                <form action="#" method="post">
                    <fieldset>
                    <legend>SELECT POST</legend>
                    <table>
                        <tr>
                        <th>Post</th>
                        <td><select name="Post" selected="President">
                                    <option value="President">President</option>
                                    <option value="Vice-President">Vice-President</option>
                                    <option value="Secretary">Secretary</option> 
                                </select></td></tr>
                        <tr> <th><input type="submit" value="Show List"></th><td></td></tr>
                    </table>
                    </fieldset>
                </form>
               
                <% try{
                     Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
           
            String Post = request.getParameter("Post");
          
           
        
          PreparedStatement ps = con.prepareStatement("SELECT `EnrollmentNo`,`Status` FROM candidature_details WHERE `Post` = ?");
           if(Post == null){
          ps.setString(1,"President");
           }
           else{
           ps.setString(1,Post);
           }
          ResultSet rs = ps.executeQuery();
          %>
          <form action="approveCandidates" method="POST">
           <table>
                  <tr>
                  <th>Enrollment No</th>
                  <th>Name</th>
                  <th>Post</th>
                  <th>Status</th>
                  <th>Approve</th>
                  </tr>
          <%
          while(rs.next()){
              String EnrollmentNo = rs.getString(1);
              String Status = rs.getString(2);
              if(Status.equals("N"))
                    Status = "Not Approved";
              else
                    Status = "Approved";
              PreparedStatement ps2 = con.prepareStatement("SELECT `Name` FROM `student_details` WHERE `EnrollmentNo`=?");
              ps2.setString(1,EnrollmentNo);
              ResultSet rs2 = ps2.executeQuery();
              if(rs2.next()){
              
              %>
              <tr>
                  <td><%=EnrollmentNo%></td>
                  <td><%=rs2.getString(1)%></td>
                  <%if(Post == null){
                      %><td>President</td>
                      <%
                  }else{%>
                  <td><%=Post%></td>
                  <td><%=Status%></td>
                  <td><input type="checkbox" name="approvedValues" value="<%=EnrollmentNo%>"</td>
              </tr>
              
          <%}
                }
          }
            }catch(Exception e){
                out.println(e);
                  }
                %>
                
                 </table>
                 <input type="submit" value="Approve">
          </form>
                
            </div>
             </div>
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>




