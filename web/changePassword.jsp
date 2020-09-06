<%-- 
    Document   : studentHome
    Created on : Mar 2, 2017, 3:00:47 PM
    Author     : dashmeetkaur
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
         <script  type="text/javascript">
             function validateChangePassword(passwd1,passwd2){
       //alert("Google");
    
         if((passwd1.length >=6) && (passwd1.length <=40) && (passwd2.length >=6) && (passwd2.length <=40) ){         
             //alert("Enroll = " + EnrollmentNo);
                 return true;
            }
            else{
                
              alert("Length of the password should be between [6,40]");
              return false;
            }
    
}
         </script>

    </head>
    <body>
        <% String name=session.getAttribute("sname").toString();
            String EnrollmentNo = session.getAttribute("EnrollmentNo").toString();
            String pwdMessage = (String)request.getAttribute("pwdMessage");
            %> 
            <script type="text/javascript">
                var msg = "<%=pwdMessage%>";
                if(msg !== "null")
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
                    <li><a href="changePassword.jsp" class="active">Change Password</a></li>
                
                    <li><a href="complaints.jsp">Register A Complaint</a></li>
                </ul>
                </div>     
            <div style="margin-left: 40%">
                <p style="margin-top: 20px; text-align: left;">Welcome <%=name%></p>
            </div>
            
            
            <div id="logindiv">
            <form action="changePassword"  method="post" onSubmit="//return validateChangePassword(passwd1.value,passwd2.value)">
                <fieldset>
                    <legend>Change Password</legend>
                    <table>
                        <tr>
                            <td>Old Password</td> 
                            <td><input type="password" name="passwd1"  required/></td>
                        </tr>
                        <tr>
                            <td>New Password</td> 
                            <td><input type="password" name="passwd2"  required/></td>
                    </tr>
                    <tr>
                        <td><input type="Submit" value="Change Password"></td>
                    </tr>
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

