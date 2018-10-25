package trivera.webshop.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trivera.webshop.model.Bluray;
import trivera.webshop.model.dao.BlurayDAO;
import trivera.webshop.model.dao.file.BlurayFileDAO;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2018 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
@WebServlet("/Search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected List<Bluray> getSearchResults(String title) {
		BlurayDAO dao = new BlurayFileDAO();
		return dao.searchByTitle(title);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		
		List<Bluray> searchResults = getSearchResults(title);
		
		request.setAttribute("result", searchResults);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("SearchResults.jsp");
		requestDispatcher.forward(request, response);
	}
}
