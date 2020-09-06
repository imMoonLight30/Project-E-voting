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
 * @author dashmeetkaur
 */
public class modifyProfile extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String heading=request.getParameter("heading");
            String newcolor=request.getParameter("newcolor");
            String textcolor=request.getParameter("textcolor");
            String text=request.getParameter("text");
            HttpSession session = request.getSession();
            String EnrollmentNo=session.getAttribute("EnrollmentNo").toString();
           Class.forName(this.getServletContext().getInitParameter("condrv"));
           Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
           PreparedStatement ps=con.prepareStatement("Update candidature_profile set heading=?, newcolor=?,textcolor=?, text=? where EnrollmentNo=?");
           ps.setString(1,heading);
           ps.setString(2,newcolor);
           ps.setString(3,textcolor);
           ps.setString(4,text);
           ps.setString(5,EnrollmentNo);
           int check = ps.executeUpdate();
           if(check == 1){
           RequestDispatcher rd = request.getRequestDispatcher("studentHome.jsp");
           rd.forward(request,response);
           }
           else
               out.println("hi ........");
    }   catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(modifyProfile.class.getName()).log(Level.SEVERE, null, ex);
            
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
