<%-- 
    Document   : castVotes
    Created on : Mar 29, 2017, 4:44:15 PM
    Author     : dashmeetkaur
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cast Vote</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="icon"  type="image/jpeg" href="logo.ico"/>
         <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
         
    </head>
    <body>
         <% try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
           PreparedStatement ps = con.prepareStatement("SELECT votingLines FROM `lines`");
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
               if(rs.getInt(1) == 0){
                   request.setAttribute("lineMsg","Dear student.. Lines are closed now!!");
                   RequestDispatcher rd = request.getRequestDispatcher("studentHome.jsp");
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
                    <li><a href="contact.jsp">Contact Us</a></li>
                    <li><a href="logout.jsp">Logout</a></li>
                </ul>
        </div>
           
             <div style="position: relative;">
                <div class="vmenu" style="float:left; width: 40%;">
                     <ul>
                    <li><a href="studentHome.jsp">Student Home</a></li>     
                    <li><a href="studentProfile.jsp">Profile</a></li>
                    <li><a href="castVotes.jsp" class="active">Cast Vote</a></li>  
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
                    <li><a href="changePassword.jsp">Change Password</a></li>
                
                    <li><a href="complaints.jsp">Register A Complaint</a></li>
                    
                </ul>
                </div>
                
            <div style="margin-left: 40%;">
                <%  String name=session.getAttribute("sname").toString();
                    String EnrollmentNo=session.getAttribute("EnrollmentNo").toString();
                    try{
                      Class.forName("com.mysql.jdbc.Driver");
                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
                      PreparedStatement ps=con.prepareStatement("Select VoteCasted from student_details where EnrollmentNo=?");
                      ps.setString(1,EnrollmentNo);
                      ResultSet rs=ps.executeQuery();
                      rs.next();
                      if(rs.getString(1).equals("Y"))
                      {
                          request.setAttribute("message","You have already casted votes!!");
                          RequestDispatcher rd = request.getRequestDispatcher("studentHome.jsp");
                          rd.forward(request, response);
                      }
                      else
                      {
                          %><form action="castVotes" method="post"><%
                          String posts[]={"President","Vice-President","Secretary"};
                          ps=con.prepareStatement("Select Name,EnrollmentNo from student_details natural join candidature_details where Post=? and Status='Y'");
                          
                          for(int i=0;i<3;i++)
                          {
                            ps.setString(1,posts[i]);
                            ResultSet rs1 =ps.executeQuery();
                            %>
                                <table width=300px;>
                                    <caption>Post: <%=posts[i]%></caption>
                                    <tr>
                                        <th>Name</th>
                                        <th>Vote</th>
                                    </tr>
                                    <% while(rs1.next())
                                    {
                                    %>
                                    <tr><td><%=rs1.getString(1)%></td>
                                        <td><input type="radio" name="<%=posts[i]%>" value="<%=rs1.getString(2)%>"/></td>
                                    </tr>
                                   <% 
                                   }
                                   %>
                                   <tr>
                                       <td>NOTA</td>
                                       <td><input type="radio" name="<%=posts[i]%>" value="NOTA"></td>
                                   </tr>
                                </table><%
                        }
                    %><input type="submit" value="Cast Vote"/></form><%
                      }
                    }catch(Exception e)
                       {out.println(e);}
                %>
               
            </div>
             </div>
            <div style="position: relative;">
        <footer>All rights reserved</footer>
        </div>
            </div>
    </body>
</html>

