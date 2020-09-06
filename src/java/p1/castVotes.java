/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dashmeetkaur
 */
public class castVotes extends HttpServlet {

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
            String president=request.getParameter("President");
            String vicepresident=request.getParameter("Vice-President");
            String secretary=request.getParameter("Secretary");
            HttpSession session=request.getSession();
            String EnrollmentNo=session.getAttribute("EnrollmentNo").toString();
            Class.forName(this.getServletContext().getInitParameter("condrv"));
            Connection con = DriverManager.getConnection(this.getServletContext().getInitParameter("conurl"),"root","");
            PreparedStatement ps=con.prepareStatement("Update candidature_details set NoOfVotes=NoOfVotes+1 where EnrollmentNo=?");
            PreparedStatement ps1=con.prepareStatement("Update student_details set VoteCasted='Y' where EnrollmentNo=?");
            int f1,f2,f3,f4;
            f1=f2=f3=f4=1;
            if(!president.equals("NOTA"))
            {
               ps.setString(1,president);
               f1=ps.executeUpdate();
            }
            if(!vicepresident.equals("NOTA"))
            {
               ps.setString(1,vicepresident);
               f2=ps.executeUpdate();
            }
            if(!secretary.equals("NOTA"))
            {
               ps.setString(1,secretary);
               f3=ps.executeUpdate();
            }
            ps1.setString(1,EnrollmentNo);
            f4=ps1.executeUpdate();
            if(f1==1 && f2==1 && f3==1 && f4==1)
            {
            request.setAttribute("message","Congratulations!! Your votes have been casted");
            }
            else
            {
              request.setAttribute("message","Error!! Contact Administrator.");
            }
            RequestDispatcher rd=request.getRequestDispatcher("studentHome.jsp");
            rd.forward(request,response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(castVotes.class.getName()).log(Level.SEVERE, null, ex);
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
