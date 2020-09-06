<%-- 
    Document   : candidatesProfile
    Created on : Mar 29, 2017, 12:09:30 PM
    Author     : dashmeetkaur
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Online Electoral System</title>
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
        <% try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
           PreparedStatement ps = con.prepareStatement("SELECT resultsLines FROM `lines`");
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               if(rs.getInt(1) == 0){
                   request.setAttribute("lineMsg","Results are not declared Yet!!");
                   RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                   rd.forward(request, response);
               }
               
           }
        }catch(Exception e){
        
        }
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
            <div style='margin-left: 35%; min-height: 400px;'>
                <h1>RESULTS DECLARED</h1>
                <h3>Congratulations Comrades...</h3>
                <table>
                    <th>President</th>
                    <th>Vice-President</th>
                    <th>Secretary</th>
                     <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
                    
                    PreparedStatement ps=con.prepareStatement("Select Name,EnrollmentNo,NoOfVotes FROM candidature_details NATURAL JOIN student_details WHERE Post=? Order by NoOfVotes DESC LIMIT 1 ");
                    ps.setString(1,"President");
                   
                    ResultSet rs = ps.executeQuery(); 
                    boolean found = rs.next();
                %>
                    <tr><td><%=rs.getString(1)%></td>
                    <% ps.setString(1,"Vice-President");
                    rs = ps.executeQuery();
                     found = rs.next();
                    %>
                    <td><%=rs.getString(1)%></td>
                    <% ps.setString(1,"Secretary");
                    rs = ps.executeQuery();
                   found = rs.next();
                    %>
                    <td><%=rs.getString(1)%></td></tr>
                </table>
            </div>
            
            
            <div style="position: relative">
        <footer>All rights reserved</footer>
        </div>
        </div>
    </body>
</html>