<%-- 
    Document   : edit1
    Created on : 29 Mar, 2017, 9:04:02 PM
    Author     : monu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Home</title>
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
                    <li><a href="contact.jsp">Contact us</a></li>
                    <li><a href="logout.jsp">Logout</a></li>
                </ul>
        </div>
             <div style="position: relative">
                <div class="vmenu" style="float:left; width: 40%;">
                     <ul>
                    <li><a href="adminHome.html">Admin Home</a></li>     
                    <li><a href="registration.html">Registration Form</a></li>
                    <li><a href="managestudents.jsp" class="active">Manage Students</a></li>
                    <li><a href="candidatureLines.html">Candidature lines</a></li>
                    <li><a href="approveCandidates.html">Approve Candidates</a></li>
                    <li><a href="votingLines.html">Voting Lines</a></li>
                    <li><a href="declareResults.html">Results</a></li>
                    <li><a href="seecomplaints.jsp">Complaints</a></li>
                </ul>
                </div>
                
            <div style="margin-left: 40%">
                
                
                    <%
                        String EnrollmentNo= request.getParameter("EnrollmentNo");
try{ 
    out.print(EnrollmentNo);
    ResultSet rs=null;
Class.forName(this.getServletContext().getInitParameter("condrv"));
                
            Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");

PreparedStatement ps = con.prepareStatement("SELECT * FROM `student_details` WHERE EnrollmentNo=?");
ps.setString(1, EnrollmentNo); 
 rs = ps.executeQuery();
while(rs.next()){ 
%>

                
                <form action="update" method="POST" onSubmit="return validateRegistration(EnrollmentNo.value,sname.value,fname.value,yearOfJoining.value,yearOfPassing.value,currentYear.value,mobile.value,email.value,passwd.value,branch.value,dob.value)">
                <fieldset>
                    <legend> Edit Information</legend>
                <table>
                    <tr>
                        <th>Enrollment No</th>
                        <td> <input type="text" name="EnrollmentNo" value="<%=rs.getString(1)%>" placeholder="0801XX121008"></td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input type="text" name="sname" value="<%=rs.getString(2)%>" placeholder="Rakesh"></td>
                    </tr>
                    <tr>
                        <th>Fname</th>
                        <td><input type="text" name="fname" value="<%=rs.getString(3)%>" placeholder="Shekher"></td>
                    </tr>
                    <tr>
                        <th>DOB</th>
                        <td><input type="date" name="dob" value="<%=rs.getDate(4)%>"></td>
                    </tr>
                    <tr>
                        <th>Year_Of_Joining</th> 
                        <td>
                            <select  name="yearOfJoining">
                                <option value="<%=rs.getInt(5)%>"><%=rs.getInt(5)%></option>
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
                        <td>
                            <select name="yearOfPassing">
                                <option value="<%=rs.getInt(6)%>"><%=rs.getInt(6)%></option>
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
                                <option value="<%=rs.getString(7)%>"><%=rs.getString(7)%></option>
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
                                <option value="<%=rs.getString(8)%>"><%=rs.getString(8)%></option>
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
                        <td><input type="text" value="<%=rs.getString(9)%>" name="mobile"></td>
                    </tr>
                    <tr>
                        <th>Email</th>
                        <td><input type="text" value="<%=rs.getString(10)%>" name="email"></td>
                    </tr>
                    <tr>
                        <th>Password</th>
                        <td><input type="password" value="<%=rs.getString(11)%>" name="passwd"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Update"></td>
                    <td><input type="reset" value="Reset"></td></tr>
                </table>
                </fieldset>
            </form>
            
                
               
<% 
    }
} catch (Exception e) {
out.println(e);
e.printStackTrace();
}

%>                                 
                                                        
            </div>
             </div>
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>

