<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Online Electoral System</title>
        <link rel="icon"  type="image/jpeg" href="logo.ico"/>
        <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
    <style>
           #menudiv{
                position: relative;
                background-color: white;
           }
           #slider{
               max-width : 800px;
               max-height: 500px;
               overflow: hidden;
               margin: 30px auto;
           }
    </style>
      

      <script type="text/javascript">
       var Images=["1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"];
       var imageNo=1;
       function slideshow()
       {
            document.getElementById('slides').src=Images[imageNo];
            if(imageNo<Images.length-1)
                imageNo++;
            else
                imageNo=0;
            setTimeout("slideshow()",3000);
       }
    </script>
      </head>
      <body onload="slideshow()">
          
        <div>
        
        <div id="div1">
            <img src="logo.jpg" alt="No img available"/>
            <h1>Online Electoral System</h1>
        </div>
            <div id="menudiv">
                <ul class="menu">
                    <li><a href="index.jsp" class="active">Home</a></li>
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
            
            <style>
            .wrapper .post {
-moz-border-radius:7px 7px 7px 7px;
float:left;
margin:10px;
margin-top: 10px;
min-height:50px;
padding:5px;
width:600px;
}
.wrapper .post h2 {
    padding:5px;
    text-height: text-size;
    letter-spacing: 5px;
    word-spacing: 6px;
    text-overflow: ellipsis;
    text-decoration: yellow;
    text-shadow: 2px 2px #D3D3D3;
    letter-spacing: 1px;
    
}
            
        </style>
            <br><br>
            <div class="images">
             <div style="position: relative;" class="post">
                <img  id="slides" src="1.jpg" alt="No img available" width="100%" height="500px"/>
            </div>
             
            <div class="wrapper">
                <div style="position: relative;" class="post">
                    <div style="float:left; width: 500px">
                        <img src="10.png" width="20%" height="100px"><br>
                        <h3>Secure and Reliable</h3>
<h5>
Third Party Audits & Certifications
Voter-Verified Results
100% Availability Guarantee</h5>
                        
                        <br><br>
    <img src="11.png" width="20%" height="100px"><br>
                        <h3>Flexible and Simple to Use</h3>
<h5>
24 x 7 x 365 Support 
Simple and Accessible Voter Experience 
Internet, Phone, and Paper Ballots</h5><br><br>
                    </div>
                </div>
            <div style="position: relative;" class="post">
                <div style="float:right; width: 500px">
                    <h2>News Feed</h2>
                    <marquee direction="up" scrollamount="3" onmouseover="this.stop()" onmouseout="this.start()">
                        <b>#</b> Voting Lines will be opening from : <br><br>
                        <b>#</b> Students who want to apply for candidature can do it from their profiles.<br/><br/>
                        <b>#</b> The Posts which are included in this years Election Procedure are : 
                        <ul>
                            <li>President</li>
                            <li>Vice-President</li>
                            <li>Secretary</li>
                        </ul><br><br>
                        <b>#</b> The Details of the Candidates are available to be Viewed on the site Home<br/><br/>
                        <b>#</b> Students can Log into their account after the registration process has been completed and the same will be informed to them via e-mails<br><br>
                        <b>#</b> Any Complaints regarding the events in voting can be registered once students logs into his account. <br/><br/>
                        <b>#</b> No unnecessary complaints will be entertained
                    </marquee>
                </div>      
                </div>
                </div>
            <div style="position: relative">
                
        </div>
            <div style="position: relative">
        <footer>Copyright@ Team OEC <br>All rights reserved</footer>
        </div>
        </div>
        
    </body>
</html>
