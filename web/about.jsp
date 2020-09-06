<%-- 
    Document   : about
    Created on : Apr 12, 2017, 5:04:36 PM
    Author     : Admin
--%>
<%@page import="java.lang.String" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="icon"  type="image/jpeg" href="logo.ico"/>
         <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
		 <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-1.7.1.min.js"></script>
  <script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.17/jquery-ui.min.js"></script>
  <script type="text/javascript" src="about.js"></script>
  <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.17/themes/smoothness/jquery-ui.css" />
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
		
		
		<div id="Content">
		
		
		<div id="tabs">
	<ul>
	
		<li><a href="#tabs-1">Application Overview</a></li>
		<li><a href="#tabs-2">Our Team</a></li>
	
	</ul>
	<div id="tabs-1">
		<p><h5>Online Electoral System is a full-service provider of secure, hosted online elections. It provides a completely new voting experience to the user.  Our voting system is constantly evolving with technology and security innovations. This system currently aims at providing an elecion system which may be useful for holding secure, unbiased and systematic election inside an institution. It is an online system through which students can get logged in to the website and can vote for their desired candidate or even apply for the various posts available.
		The system is capable of maintaining details of various Students, Applicants and storing the votes of the voters in its database.
		The	central concept of the system is to get the applications for various posts, shortlist the applicants, perform the voting procedure and declare results.
		</h5></p>
		<p><strong>Our Mission</strong>: <h5>To achieve excellence providing secure and efficient voting solutions and to create value for the organizations we serve.</h5></p>
		<p><strong>Our People</strong>: <h5>Dedicated staff who understand that transparency and perfection are a must in this industry.</h5></p>
		<p><strong>Our Strengths</strong>: <h5>Timely customer service, simplicity of design, high security, and the ability to deliver custom solutions.</h5></p>

	</div>
                    <style>
            .wrapper .post {
-moz-border-radius:7px 7px 7px 7px;
border:1px solid silver;
float:left;
margin:10px;
min-height:100px;
padding:5px;
width:250px;
}
            
        </style>
	<div id="tabs-2" class="wrapper">
	<h3><strong>Management Team</strong></h3>
        
                <div class="post" style="background-color:teal;color:white;padding:20px;display: inline-block;">
                    <h3>Akshay<br> Vyas</h3>
                    <p>0801CS141007</p>              
                    
                </div>
                <div class="post" style="background-color:teal;color:white;padding:20px;display: inline-block;">
                    <h3>Dashmeet Kaur Chawla</h3>
                    <p>0801CS141026</p>
                </div>
                <div class="post" style="background-color:teal;color:white;padding:20px;display: inline-block;">
                    <h3>Chandra Prakash Singh Sengar</h3>
                    <p>0801CS141023</p>
                </div>
                <div class="post" style="background-color:teal;color:white;padding:20px;display: inline-block;">
                    <h3>Chaitanya Chauganjkar</h3>
                    <p>0801CS141022</p>
                </div>
	</div>
</div>
 </div>
<div class="sections_group">
<div class="entry-content" itemprop="mainContentOfPage">
 
<h3>Find out more</h3> <div class="textwidget"></h6>Call us at : <span class="number">0731-437-8909</span></h6>

	
	
		
<div style="position: relative;">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>