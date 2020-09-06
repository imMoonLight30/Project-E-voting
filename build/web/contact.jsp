<%-- 
    Document   : contact
    Created on : Apr 12, 2017, 5:57:39 PM
    Author     : Admin
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student home</title>
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
		<li><a href="#tabs-1">Contact Queries</a></li>
		<li><a href="#tabs-2">More Support</a></li>
		
	</ul>
	<div id="tabs-1">
		
		<style>
            #logindiv{
                text-align: center;
                margin-left: 37%;
                margin-top: 5%;
                margin-bottom: 10%;
            }
    </style>
	<div id="logindiv">
            <form action="login"  method="get" onSubmit="return validateLogin(EnrollmentNo.value,passwd.value)">
                <fieldset>
                    <legend>Message</legend>
                    <table>
                        <tr>
                            <td>Name</td> 
                            <td><input type="text" name="name"  required/></td>
                        </tr>
                        <tr>
                            <td>Email</td> 
                            <td><input type="email" name="email"  required/></td>
                    </tr>
					<tr>
                            <td>Message</td> 
                            <td><input type="textarea" name="msg" row="6"  required/></td>
                    </tr>
                    <tr>
                        <td align="center"><input type="Submit" value="Sumbit Query!"></td>
                        
                    </tr>
                    </table>
                </fieldset>
            </form>

	</div>
	</div>
	<div id="tabs-2">
			<p class="lead">
				Contact us now and let we know your doubts about OES.	
			</p>
			<ul>
				<div id="mailtothis">	
					<li><p><small style="display:block;">Toll free</small>
					+1800-155-0009
					</p>
					<br>
					</li>
				</div>
					<li><p>
				<div id="mailtothis">	
						<small><a href="mailto:contact@OES.net">contact@oes.net</a></small></p>
					</li>
				</div>
			</ul>
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