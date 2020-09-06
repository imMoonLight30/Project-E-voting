<%-- 
    Document   : complaints
    Created on : 22 Mar, 2017, 1:02:08 PM
    Author     : monu
--%>

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
        <% String name=session.getAttribute("sname").toString();
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
                    <li><a href="applyCandidature.jsp">Apply for Candidature</a></li>
                    <%  }
                    %>
                    <li><a href="changePassword.jsp">Change Password</a></li>
                
                    <li><a href="complaints.jsp" class="active">Register A Complaint</a></li>
                    
                </ul>
                </div>
                
            <div style="margin-left: 40%">
                <p style="margin-top: 20px; text-align: left;">REGISTER A COMPLAINT</p>
                <fieldset>
                    <legend>Complaint Form</legend>
                <table>
                <form action="complaint" method="post">
                    <tr>
                        <th> <label for="name">Name <span>*</span></label></th>
                         <td> <input type="text" name="name" id="name" value="" size="22" required><br></td></tr>
               <tr>
            &nbsp;&nbsp;&nbsp;<label for="email">Mail <span>*</span></label>
            <input type="email" name="mail" id="email" value="" size="22" required><br>
             <tr>
           <th> <label for="complaint">Complaint <span>*</span></label></th>
          <td>  <br><textarea name="comment" id="comment" cols="25" rows="10" size="22"></textarea><br></td>
          </tr>
          <tr>
              <th> <input type="submit" name="submit" value="Submit Form"></th>
          
              <td> <input type="reset" name="reset" value="Reset Form"></td>
            </tr>       
        </form>
                </table>
                    </fieldset>
            </div>
             </div>
            <div style="position: relative;">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>

