package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.impl.BatchDetailsImplementation;
import com.revature.model.Batch;

/**
 * Servlet implementation class AddBatch
 */
public class AddBatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBatch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String topicName=request.getParameter("topicName");
		String sDate=request.getParameter("startDate");
		String eDate=request.getParameter("endDate");
		int duration=Integer.parseInt(request.getParameter("batchDuration"));
		String tId=request.getParameter("trainerId");
		String associateId=request.getParameter("associateId");
		Batch batch=new Batch(topicName,sDate,eDate,duration,tId,associateId);
		BatchDetailsImplementation b=new BatchDetailsImplementation();
		int n=b.addBatchDetails(batch);
		System.out.println(n+" row added");
		response.sendRedirect("addBatch.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
