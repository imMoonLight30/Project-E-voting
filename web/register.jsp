<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registration Page</title>
        <link rel="icon"  type="image/jpeg" href="logo.ico"/>
        <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="script/checker.js" type="text/javascript"></script>
        <style>
            #menudiv{
                position: relative;
                background-color: white;
                    }
        </style>
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
                    <li><a href="contact.jsp">Contact Us</a></li>
                     <li><a href="logout.jsp">Logout</a></li>
                </ul>
            </div>
            <div style="position: relative">
                <div class="vmenu" style="float:left; width: 40%;">
                     <ul>
                   <li><a href="adminHome.jsp">Admin Home</a></li>     
                    <li><a href="register.jsp" class="active">Registration Form</a></li>
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
            <form action="register" method="POST" onSubmit="return validateRegistration(EnrollmentNo.value,sname.value,fname.value,yearOfJoining.value,yearOfPassing.value,currentYear.value,mobile.value,email.value,passwd.value,branch.value,dob.value)">
                <fieldset>
                    <legend>Registration Form</legend>
                <table>
                    <tr>
                        <th>Enrollment No</th>
                        <td> <input type="text" name="EnrollmentNo" placeholder="0801XX121008"></td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input type="text" name="sname" placeholder="Rakesh"></td>
                    </tr>
                    <tr>
                        <th>Fname</th>
                        <td><input type="text" name="fname" placeholder="Shekher"></td>
                    </tr>
                    <tr>
                        <th>DOB</th>
                        <td><input type="date" name="dob" value="1995-01-01"></td>
                    </tr>
                    <tr>
                        <th>Year_Of_Joining</th> 
                        <td><select  name="yearOfJoining">
                                <option value="2000">2000</option>
                                <option value="2001">2001</option>
                                <option value="2002">2002</option>
                                <option value="2003">2003</option>
                                <option value="2004">2004</option>
                                <option value="2005">2005</option>
                                <option value="2006">2006</option>
                                <option value="2007">2007</option>
                                <option value="2008">2008</option>
                                <option value="2009">2009</option>
                                <option value="2010">2010</option>
                                <option value="2011">2011</option>
                                <option value="2012">2012</option>
                                <option value="2013">2013</option>
                                <option value="2014">2014</option>
                                <option value="2015">2015</option>
                                <option value="2016">2016</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Year-Of_Passing</th>
                        <td> <select name="yearOfPassing">
                                <option value="2004">2004</option>
                                <option value="2005">2005</option>
                                <option value="2006">2006</option>
                                <option value="2007">2007</option>
                                <option value="2008">2008</option>
                                <option value="2009">2009</option>
                                <option value="2010">2010</option>
                                <option value="2011">2011</option>
                                <option value="2012">2012</option>
                                <option value="2013">2013</option>
                                <option value="2014">2014</option>
                                <option value="2015">2015</option>
                                <option value="2016">2016</option>  
                                <option value="2017">2017</option>
                                <option value="2018">2018</option>
                                <option value="2019">2019</option>
                                <option value="2020">2020</option>  
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Current_Year</th>
                        <td><select name="currentYear">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>  
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th> Branch</th>       
                        <td><select name="branch">
                            <option value="COMPUTER SCIENCE ENGINEERING">COMPUTER SCIENCE ENGINEERING</option>
                            <option value="CIVIL ENGINEERING">CIVIL ENGINEERING</option>
                            <option value="ELECTRICAL ENGINEERING">ELECTRICAL ENGINEERING</option>
                            <option value="MECHANICAL ENGINEERING">MECHANICAL ENGINEERING</option> 
                            <option value="ELECTRONICS AND COMMUNICATION ENGINEERING">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                            <option value="INDUSTRIAL AND PRODUCTION ENGINEERING">INDUSTRIAL AND PRODUCTION ENGINEERING</option>
                            <option value="BIOMEDICAL ENGINEERING">BIOMEDICAL ENGINEERING</option>
                            <option value="INFORMATION TECHNOLOGY ENGINEERING">INFORMATION TECHNOLOGY ENGINEERING</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Mobile</th>
                        <td><input type="text" name="mobile"></td>
                    </tr>
                    <tr>
                        <th>Email</th>
                        <td><input type="text" name="email"></td>
                    </tr>
                    <tr>
                        <th>Password</th>
                        <td><input type="password" name="passwd"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Register"></td>
                    <td><input type="reset" value="Reset"></td></tr>
                </table>
                </fieldset>
            </form>
            
            </div>
            </div>
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>

