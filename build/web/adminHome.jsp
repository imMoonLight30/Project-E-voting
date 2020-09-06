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
           String message=(String)request.getAttribute("message");%>
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
                    <li><a href="adminHome.jsp"  class="active">Admin Home</a></li>     
                    <li><a href="register.jsp">Registration Form</a></li>
                    <li><a href="managestudents.jsp">Manage Students</a></li>
                    <li><a href="candidatureLines.jsp">Candidature lines</a></li>
                    <li><a href="approveCandidates.jsp">Approve Candidates</a></li>
                    <li><a href="votingLines.jsp">Voting Lines</a></li>
                     <li><a href="resultLines.jsp">Results Lines</a></li>
                    <li><a href="declareResults.html">Results</a></li>
                    <li><a href="seecomplaints.jsp">Complaints</a></li>
                </ul>
                </div>
                
            <div style="margin-left: 40%">
                <h3> WELCOME ADMINISTRATOR </h3>
            </div>
             </div>
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>

