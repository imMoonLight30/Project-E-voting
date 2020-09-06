/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class login extends HttpServlet {

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
           String EnrollmentNo = request.getParameter("EnrollmentNo");
        
           String passwd = request.getParameter("passwd");
           if((EnrollmentNo.equals("admin1234567"))&&(passwd.equals("admin1234567"))){
               HttpSession session = request.getSession();
           session.setAttribute("checked", "yes"); 
           session.setAttribute("LoggedIn","true");
           response.sendRedirect("adminHome.jsp");
           
           }
           else{
           
           Class.forName(this.getServletContext().getInitParameter("condrv"));
           Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
           
           PreparedStatement ps = con.prepareStatement("SELECT `Password`,`Name` FROM `student_details` WHERE `EnrollmentNo`=?");
           ps.setString(1,EnrollmentNo);
           ResultSet rs = ps.executeQuery();
           boolean found = rs.next();
           if(found){
           if(passwd.equals(rs.getString(1)))
           {
               String sname = rs.getString(2);
               String status;
               Cookie c1 = new Cookie("EnrollmentNo", EnrollmentNo);
               
               HttpSession session = request.getSession();
               session.setAttribute("sname", sname);
               session.setAttribute("EnrollmentNo",EnrollmentNo);
                session.setAttribute("checked","yes");
                
               PreparedStatement ps2 = con.prepareStatement("SELECT Status FROM candidature_details WHERE EnrollmentNo = ?");
               ps2.setString(1,EnrollmentNo);
               ResultSet rs2 = ps2.executeQuery();
                if( rs2.next())
               status = rs2.getString(1);
               else
               status="N";
               session.setAttribute("status", status);
               session.setAttribute("LoggedIn","true");
           response.sendRedirect("studentHome.jsp");
//               out.println("Logged In");
            
           }
           else{
               request.setAttribute("message", "Incorrect credentials!!!");
           }
           }
           else{
           request.setAttribute("message", "Incorrect credentials!!!");
           }
           }
           RequestDispatcher rd   = request.getRequestDispatcher("login.jsp");
           rd.include(request, response);
                   
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
