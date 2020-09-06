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

/**
 *
 * @author Admin
 */
public class approveCandidates extends HttpServlet {

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
            
           Class.forName(this.getServletContext().getInitParameter("condrv"));
           Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
            String enrollments[] = request.getParameterValues("approvedValues");
            for (int i=0 ; i < enrollments.length; i++){
                 
                PreparedStatement ps = con.prepareStatement("UPDATE `candidature_details` SET `Status`= 'Y' WHERE EnrollmentNo=?");
                ps.setString(1,enrollments[i]);
                int check = ps.executeUpdate();
                PreparedStatement ps3=con.prepareStatement("Select EnrollmentNo from candidature_profile where EnrollmentNo=?");
                ps3.setString(1,enrollments[i]);
                ResultSet rs1=ps3.executeQuery();
                if(!rs1.next())
                {
                PreparedStatement ps2 = con.prepareStatement("INSERT INTO `candidature_profile` (`EnrollmentNo`, `heading`, `newcolor`, `textcolor`, `text`) VALUES (?,?,?,?,?)");
               ps2.setString(1,enrollments[i]);
               ps2.setString(2,"heading");
               ps2.setString(3,"#ff80c0");
               ps2.setString(4,"#000000");
               ps2.setString(5,"Content to type...");
               ps2.executeUpdate();
                }   
               if(check == 1 ){
                   request.setAttribute("message", "Approval Status changed... ");
               }
                else{
                   request.setAttribute("message","Error!!!");
                }
               
                
            }
            RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
                rd.forward(request, response); 
                
           
           } catch (SQLException ex) {
            Logger.getLogger(approveCandidates.class.getName()).log(Level.SEVERE, null, ex);
            PrintWriter out = response.getWriter();
                    out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(approveCandidates.class.getName()).log(Level.SEVERE, null, ex);
            PrintWriter out = response.getWriter();
                    out.println(ex);
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
