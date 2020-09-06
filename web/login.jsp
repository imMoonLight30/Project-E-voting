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
        <script src="script/checker.js" type="text/javascript"></script>
        
        <style>
            #logindiv{
                text-align: center;
                margin-left: 37%;
                margin-top: 5%;
                margin-bottom: 10%;
            }
            #menudiv{
                position: relative;
                background-color: white;
                    }
        </style>
    </head>
    <body>
        <% String message = (String)request.getAttribute("message");
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
                    <li><a href="login.jsp" class="active">Login</a></li>
                    <li><a href="contact.jsp">Contact Us</a></li>
                </ul>
        </div>
            <div id="logindiv">
            <form action="login"  method="POST" onSubmit="return validateLogin(EnrollmentNo.value,passwd.value)">
                <fieldset>
                    <legend>SIGN IN</legend>
                    <table>
                        <tr>
                            <td>Enrollment No</td> 
                            <td><input type="text" name="EnrollmentNo" placeholder="0801XX131002"  required/></td>
                        </tr>
                        <tr>
                            <td>Password</td> 
                            <td><input type="password" name="passwd"  required/></td>
                    </tr>
                    <tr>
                        <td><input type="Submit" value="Sign In"></td>
                        <!--<td><a href="#">Forgot Password</a></td>-->
                    </tr>
                    </table>
                </fieldset>
            </form>
            
        </div>
            
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>
