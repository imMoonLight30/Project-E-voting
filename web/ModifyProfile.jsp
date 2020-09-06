<%-- 
    Document   : ModifyProfile
    Created on : Mar 23, 2017, 1:08:33 PM
    Author     : dashmeetkaur
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modify Profile</title>
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="icon"  type="image/jpeg" href="logo.ico"/>
         <link rel="stylesheet" type="text/css" href="sheets/css1.css"/>
         <script>
              function changecolor(id1,id2)
              {
                  var x=document.getElementById(id1).elements[0].value;
                  document.getElementById(id2).style.backgroundColor=x;
                  
              }
              function popup_show(id)
              {
                  document.getElementById(id).style.display='block';
              }
              function popup_hide(id)
              {
                  document.getElementById(id).style.display='none';
              }
              function savetext(id1)
              {
                  var textcolor=document.getElementById(id1).elements[1].value;
                  var h1=document.getElementById(id1).elements[2].value;
                  var text=document.getElementById(id1).elements[3].value;
                  document.getElementById('p1').style.color=textcolor;
                  document.getElementById('h1').innerHTML=h1;
                  document.getElementById('h1').style.color=textcolor;
                  document.getElementById('p1').innerHTML=text;
                  
              }
              function saveChange(id1,id2)
              {
                     document.getElementById(id2).style.display='none';
                     savetext(id1);
              }
              function submitForm(id1)
              {
                  document.getElementById(id1).submit();
              }
             </script>
             
    </head>
    <body>
          <% //session.setAttribute("EnrollmentNo","0801CS141002"); %>
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
             <div style="position: relative; min-height: 600px;">
                <div class="vmenu" style="float:left; width: 40%;">
                     <ul>
                     <li><a href="studentHome.jsp">Student Home</a></li>     
                    <li><a href="studentProfile.jsp">Profile</a></li>
                    <li><a href="castVotes.jsp">Cast Vote</a></li>  
                    <% String status = (String)session.getAttribute("status");
                        if(status.equals("Y")){
                    %>
                    <li><a href="ModifyProfile.jsp"  class="active">Modify Profile</a></li>
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
                 <div style="margin-left: 20%; position: absolute;">
                     
                     <% 
                            String EnrollmentNo=session.getAttribute("EnrollmentNo").toString();
                            String heading="";
                            String newcolor="";
                            String textcolor="";
                            String text="";
                            try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-electoral_sys","root","");
                            PreparedStatement ps=con.prepareStatement("Select * from candidature_profile where EnrollmentNo=?");
                            ps.setString(1,EnrollmentNo);
                            ResultSet rs=ps.executeQuery();
                            if(rs.next())
                            {
                                heading=rs.getString("heading");
                                newcolor=rs.getString("newcolor");
                                textcolor=rs.getString("textcolor");
                                text=rs.getString("text");
                            }
                            }
                            catch(Exception e)
                            {
                                out.println(e);
                            }
                        %>
                 <div id="workarea" style="left:0;margin-left: 0; margin-top: 5%; min-height: 300px; width: 1050px; overflow: auto; color: '<%=newcolor%>'">
                     <button onclick="popup_show('box1')">Change Properties</button>
                       
                     <h1 id="h1" style="text-align:center; font-size: 70px; color: '<%=textcolor%>'"><%=heading%></h1><br/><br/>
                   
                     <p id="p1" style="text-align:center; font-size: 30px; color: '<%=textcolor%>'"><%=text%></p>
                         
                 
                 
                  <div id="box1" style="display: none; z-index: 10;">
                     
                     <form action="modifyProfile" method="get" id="form1">
                         <table>
                             <tr><td>Color</td><td> <input type="color" name="newcolor" onchange="changecolor('form1','workarea')"></td></tr>
                             <tr><td>Text Color</td><td> <input type="color" name="textcolor"></td></tr>
                             <tr><td>Heading</td><td> <input type="text" name="heading"></td></tr>
                             <tr><td colspan="2">What would you like to say??<br/><textarea name="text" rows="10" cols="40">Write your views</textarea></td></tr>
                         </table>
                         
                     </form>
                      <button onclick="saveChange('form1','box1')">Change</button><br/><br/>
                  </div>
                 </div>
                 <button onclick="submitForm('form1')">Save Change</button><br/><br/>   
               </div>
                 
             </div>
             
            <div style="position: relative;">
        <footer>All rights reserved</footer>
        </div>
            </div>
        
        </body>
</html>
