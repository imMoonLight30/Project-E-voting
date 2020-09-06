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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CHAITANYA
 */
public class changePassword extends HttpServlet {

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
            HttpSession session = request.getSession();
            String EnrollmentNo = session.getAttribute("EnrollmentNo").toString();
           String passwd1 = request.getParameter("passwd1");
           String passwd2 = request.getParameter("passwd2");
           
           
           Class.forName(this.getServletContext().getInitParameter("condrv"));
           Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
           
           PreparedStatement ps = con.prepareStatement("SELECT `Password` FROM `student_details` WHERE `EnrollmentNo`=?");
           ps.setString(1,EnrollmentNo);
           ResultSet rs = ps.executeQuery();
           
           boolean found = rs.next();
          
               
           if(passwd1.equals(rs.getString(1)))
           {    
                PreparedStatement ps2 = con.prepareStatement("UPDATE `student_details` SET  `Password` =? WHERE `EnrollmentNo`=?");
                ps2.setString(1,passwd2);
                ps2.setString(2,EnrollmentNo);
           
           int check = ps2.executeUpdate();
           
            if(check == 1){
              
                request.setAttribute("pwdMessage","Password Changed Successfully!!!");
            RequestDispatcher rd = request.getRequestDispatcher("studentHome.jsp");
            rd.include(request, response);
         
                }
            else{
              request.setAttribute("pwdMessage","Error!!!");
            RequestDispatcher rd = request.getRequestDispatcher("changePassword.jsp");
            rd.include(request, response);
                }
           
           }
           else{
           
                request.setAttribute("pwdMessage","Old password wrongly entered!!! Please Try again..");
            RequestDispatcher rd = request.getRequestDispatcher("changePassword.jsp");
            rd.include(request, response);
           }
           
           
           
           
        }
        catch (ClassNotFoundException ex) {
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
