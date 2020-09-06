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
 * @author monu
 */
public class update extends HttpServlet {

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
            
            String EnrollmentNo = request.getParameter("EnrollmentNo");
            String sname = request.getParameter("sname");
            String fname = request.getParameter("fname");
            String dob = request.getParameter("dob");
            String yearOfJoining = request.getParameter("yearOfJoining");
            String yearOfPassing = request.getParameter("yearOfPassing");
            int currentYear = Integer.parseInt(request.getParameter("currentYear"));
            String branch = request.getParameter("branch");
            String mobile = request.getParameter("mobile");
            String email = request.getParameter("email");
            String passwd = request.getParameter("passwd");
            
                PreparedStatement ps = con.prepareStatement("UPDATE `student_details` SET `Name`=?, `FName`=?, `DOB`=?, `YearOfJoining`=?, `YearOfPassing`=?, `CurrentYear`=?, `Branch`=?, `Mobile`=?, `Email`=?, `Password`=? WHERE `EnrollmentNo`=?");
                ps.setString(11,EnrollmentNo);
                ps.setString(1,sname);
                ps.setString(2,fname);
                ps.setString(3,dob);
                ps.setString(4,yearOfJoining);
                ps.setString(5,yearOfPassing);
                ps.setInt(6,currentYear);
                ps.setString(7,branch);
                ps.setString(8,mobile);
                ps.setString(9,email);
                ps.setString(10,passwd);
                
                
                int check = ps.executeUpdate();
                out.println("hello");
                if(check == 1){
                request.setAttribute("message","Student Details Updated Successfully...");
                }
                else{
             request.setAttribute("message","Student Details Updated Successfully...");
                }
                RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
                rd.forward(request, response);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
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
