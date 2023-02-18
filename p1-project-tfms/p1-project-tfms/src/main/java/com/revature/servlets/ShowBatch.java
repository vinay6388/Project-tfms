package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.config.ConnectionFactory;

/**
 * Servlet implementation class ShowBatch
 */
public class ShowBatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBatch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();  
         response.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
             Connection con = ConnectionFactory.getConnection();  
             Statement stmt = con.createStatement();  
             ResultSet rs = stmt.executeQuery("select * from batch");  
             out.println("<table width=50% height=50% style=\"text-align: center\">");  
             out.println("<tr><th scope='col' width='20%'>Topic Name</th><th scope='col' width='20%'>Start Date</th><th scope='col' width='20%'>End Date</th><th scope='col' width='20%'>Duration</th><th scope='col' width='20%'>Trainer Id</th><th scope='col' width='45%'>Associate Id</th><tr>");  
             while (rs.next()) 
             {  
                 String c1 = rs.getString("topic_name");  
                 String c2 = rs.getString("start_date");  
                 String c3= rs.getString("end_date");  
                 int c4 = rs.getInt("batch_duration");  
                 String c5= rs.getString("trainer_id");  
                 String c6 = rs.getString("associate_id");    
                 out.println("<tr><td>" + c1 + "</td><td>" + c2 + "</td><td>" + c3 + "</td><td>" + c4 + "</td><td>" + c5 + "</td><td>" + c6 + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
