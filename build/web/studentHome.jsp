<%-- 
    Document   : studentHome
    Created on : Mar 2, 2017, 3:00:47 PM
    Author     : vyas
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
           String message=(String)request.getAttribute("message");
           String pwdMessage = (String)request.getAttribute("pwdMessage");
           String lineMsg = (String)request.getAttribute("lineMsg");
        %>
          <script type="text/javascript">
           var msg="<%=message%>";
            if(msg!=="null")
              window.alert(msg);
              var msg1 = "<%=pwdMessage%>";
              if(msg1!=="null")
                  window.alert(msg1);
              var lineMsg = "<%=lineMsg%>";
              if(lineMsg !== "null")
                    window.alert(lineMsg);
           
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
                    
          <%  String status = (String)session.getAttribute("status");%>
             <div style="position: relative">
                <div class="vmenu" style="float:left; width: 40%;">
                     <ul>
                    <li><a href="studentHome.jsp"  class="active">Student Home</a></li>     
                    <li><a href="studentProfile.jsp">Profile</a></li>
                    <li><a href="castVotes.jsp">Cast Vote</a></li>  
                    <%  if(status.equals("Y")){
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
                <p style="margin-top: 20px; text-align: left;"><h2>Welcome <%=name%></h2></p>
            </div>
             </div>
            <div style="position: relative;">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>

