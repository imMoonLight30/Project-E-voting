package p1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * 
 */
public class applyCandidature extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String post=request.getParameter("post");
            HttpSession session = request.getSession();
            String EnrollmentNo=session.getAttribute("EnrollmentNo").toString();
           Class.forName(this.getServletContext().getInitParameter("condrv"));
           Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
           PreparedStatement ps=con.prepareStatement("Select EnrollmentNo,Post FROM candidature_details where EnrollmentNo=?");
           ps.setString(1,EnrollmentNo);
           ResultSet rs=ps.executeQuery();
           if(rs.next())
           {
            /* out.println("<html><body onload=''
             out.println("alert('You have already applied for a position.')");
            // out.println("location=studentHome.jsp");
             out.println("</script></body></html>");
             return;*/
            request.setAttribute("message","You have already applied for a post");
            RequestDispatcher rd=request.getRequestDispatcher("studentHome.jsp");
            rd.include(request, response);
           }
           ps = con.prepareStatement("INSERT INTO `candidature_details` (`EnrollmentNo`, `Post`, `Status`, `NoOfVotes`) VALUES(?,?,?,?)");
           ps.setString(1,EnrollmentNo);
           ps.setString(2,post);
           ps.setString(3,"N");
           ps.setInt(4,0);
           int check= ps.executeUpdate();
           if(check==1)
           {
            request.setAttribute("message","Congrats!! You have successfully applied for the post");
            }
           else
           {
            request.setAttribute("message","Sorry!! There seems an internal error. Try again later or contact administrator.");
           }
           RequestDispatcher rd=request.getRequestDispatcher("studentHome.jsp");
            rd.include(request, response);
           
        }
        
         catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(applyCandidature.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
