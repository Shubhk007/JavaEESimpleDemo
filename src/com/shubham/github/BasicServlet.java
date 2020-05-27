package com.shubham.github;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicServlet
 */
@WebServlet("/BasicServlet")
public class BasicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String ParameterArg= request.getParameter("PageNo");
		if(ParameterArg.equals("Page1"))
		{
			getServletContext().getRequestDispatcher("/Page1.jsp").forward(request, response);
		}else if(ParameterArg.equals("Page2"))
		{
			System.out.println("***** TEST********");
			getServletContext().getRequestDispatcher("/Page2.jsp").forward(request, response);
		}
		else
		{
			getServletContext().getRequestDispatcher("/ErrorPage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//we dont need this actually for now
		doGet(request, response);
	}

}
