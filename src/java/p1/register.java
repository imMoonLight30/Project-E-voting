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
 * @author Admin
 */
public class register extends HttpServlet {

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
            
                PreparedStatement ps = con.prepareStatement("INSERT INTO `student_details` (`EnrollmentNo`, `Name`, `FName`, `DOB`, `YearOfJoining`, `YearOfPassing`, `CurrentYear`, `Branch`, `Mobile`, `Email`, `Password`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,EnrollmentNo);
                ps.setString(2,sname);
                ps.setString(3,fname);
                ps.setString(4,dob);
                ps.setString(5,yearOfJoining);
                ps.setString(6,yearOfPassing);
                ps.setInt(7,currentYear);
                ps.setString(8,branch);
                ps.setString(9,mobile);
                ps.setString(10,email);
                ps.setString(11, passwd);
                
                int check = ps.executeUpdate();
                if(check==1)
           {
            request.setAttribute("message","!! Successfully registered...");
            }
           else
           {
            request.setAttribute("message","Sorry!! There seems an internal error.\n User with same enrollment no already exists or user with same email id exists.");
           }
                RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
                rd.include(request, response);
            
            
            
            
            
            
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
              
            } catch (SQLException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
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
