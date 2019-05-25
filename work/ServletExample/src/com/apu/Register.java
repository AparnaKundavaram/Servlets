package com.apu;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.apu.constants.UserConstants;
import com.apu.utility.DbUtility;
import com.mongodb.client.MongoCollection;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		Date dt = new Date();
//		SimpleDateFormat ft = new SimpleDateFormat("E, dd MMM yyyy 'at' HH:mm:ss a");
//		String currentDateAndTime = ft.format(dt);
		//String siteName = "http://www.veridicsolutions.com/";
		response.sendRedirect("/ServletExample/WebContent/Register.jsp");
		
		String username = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
//		String gender = request.getParameter("gender");
//		String [] hobbies = request.getParameterValues("hobbies");
//		String country = request.getParameter("country");
//		String [] languages = request.getParameterValues("languages");
		
		DbUtility dbUtility = new DbUtility();
		dbUtility.connect(UserConstants.USER, UserConstants.DB, UserConstants.PASSWORD);
		MongoCollection<Document> collection = dbUtility.getCollection( dbUtility.getDatabase("myDb") , "sampleCollection");
		
		Document document = new Document() 
			      .append("userName", username) 
			      .append("password", passwd);
	 
	    collection.insertOne(document); 
		
		doGet(request, response);
	}

}
