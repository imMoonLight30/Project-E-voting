<%-- 
    Document   : studentHome
    Created on : Mar 2, 2017, 3:00:47 PM
    Author     : dashmeetkaur
--%>


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
      <% try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
           PreparedStatement ps = con.prepareStatement("SELECT candidatureLines FROM `lines`");
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               if(rs.getInt(1) == 0){
                   request.setAttribute("lineMsg","Dear student.. Lines are closed now!!");
                   RequestDispatcher rd = request.getRequestDispatcher("studentHome.jsp");
                   rd.forward(request, response);
               }
           }
        }catch(Exception e){
        
        }
      %>
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
                     <li><a href="studentHome.jsp">Student Home</a></li>     
                    <li><a href="studentProfile.jsp">Profile</a></li>
                    <li><a href="castVotes.jsp">Cast Vote</a></li>  
                    <% String status = (String)session.getAttribute("status");
                        if(status.equals("Y")){
                    %>
                    <li><a href="ModifyProfile.jsp">Modify Profile</a></li>
                    <%}
                    else{
                    %>
                    <li><a href="applyCandidature.jsp"  class="active">Apply for Candidature</a></li>
                    <%  }
                    %>
                    <li><a href="changePassword.jsp">Change Password</a></li>
                
                    <li><a href="complaints.jsp">Register A Complaint</a></li>
                </ul>
                </div>
                
            <div style="margin-left: 40%">
                <form action="applyCandidature" method="post">
                    <fieldset>
                    <legend>Candidature Form</legend>
                    <table>
                        <tr>
                        <th>Post</th>
                        <td><select name="post">
                                    <option value="President">President</option>
                                    <option value="Vice-President">Vice-President</option>
                                    <option value="Secretary">Secretary</option> 
                                </select></td></tr>
                        <tr> <th><input type="submit" value="Apply"></th><td></td></tr>
                    </table>
                    </fieldset>
                </form>
            </div>
             </div>
            <div style="position: relative;">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>

